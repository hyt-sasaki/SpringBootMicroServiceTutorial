package main

import (
	"dagger.io/dagger"
	"dagger.io/dagger/core"
	"universe.dagger.io/docker"
)

dagger.#Plan & {
	_gardleCacheMount: "/root/.gradle": {
		dest: "/root/.gradle"
		type: "cache"
		contents: core.#CacheDir & {
			id: ".gradle"
		}
	}
	client: filesystem: {
        "..": read: contents: dagger.#FS
        "./_build": write: contents: actions.build.contents.output
    }
	client: env: {
        MYSQL_DATABASE: string | *"sample"
        MYSQL_ROOT_PASSWORD: string | *"root"
        MYSQL_USER: string | *"docker"
        MYSQL_PASSWORD: string | *"docker"
        MYSQL_URL: string | *"jdbc:mysql://127.0.0.1:3306/sample?useSSL=false"
    }
    actions: {
        openapi: {
            cue: #CueRun & {
                src: client.filesystem."..".read.contents
                script: "mkdir -p /src/appApiSchema/build; cue export -o /src/appApiSchema/build/openapi.yaml"
            }
        }
		build: {
            _input: core.#Subdir & {
                input: openapi.cue.output.rootfs
                path: "/src"
            }
            gradle: #GradleRun & {
                src: _input.output
                arguments: [":app:bootJar"]
                always: false
            }
            contents: core.#Subdir & {
                input: gradle.output.rootfs
                path: "/src/app/build"
            }
		}
		test: {
            _input: core.#Subdir & {
                input: build.gradle.output.rootfs
                path: "/src"
            }
            _env: {
                MYSQL_DATABASE: client.env.MYSQL_DATABASE
                MYSQL_ROOT_PASSWORD: client.env.MYSQL_ROOT_PASSWORD
                MYSQL_USER: client.env.MYSQL_USER
                MYSQL_PASSWORD: client.env.MYSQL_PASSWORD
                MYSQL_URL: client.env.MYSQL_URL
            }
            db: {
                _mysql: docker.#Pull & {
                    source: "mysql:8.0.28"
                }
                mysql: core.#Start & {
                    input: _mysql.output.rootfs
                    env: _env
                    args: ["/entrypoint.sh", "mysqld"]
                }
                terminate: core.#Stop & {
                    _deps: gradle.success
                    input: mysql
                }
            }
            gradle: #GradleRun & {
                src: _input.output
                arguments: [":greeting-usecase:test", ":app:test"]
                always: true
                env: _env
            }
		}
	}
}
