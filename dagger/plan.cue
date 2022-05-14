package main

import (
	"dagger.io/dagger"
	"dagger.io/dagger/core"
	"universe.dagger.io/docker"
	"universe.dagger.io/docker/cli"
	"com.example.dagger/images:image"
	"com.example.dagger/images/java"
)

dagger.#Plan & {
	_gradleCacheMount: "/root/.gradle": {
		dest: "/root/.gradle"
		type: "cache"
		contents: core.#CacheDir & {
			id: ".gradle"
		}
	}
	client: filesystem: {
        "..": read: contents: dagger.#FS
        "./_build/jar": write: contents: actions.build.jar.output
        "./_build/openapi": write: contents: actions.build.openapi.output
    }
	client: network: "unix:///var/run/docker.sock": connect: dagger.#Socket

    actions: {
        build: {
            _image: image.#Image
            load: core.#Copy & {
                input: _image.rootfs
                contents: client.filesystem."..".read.contents
                dest: "/src"
            }
            gradle: core.#Exec & {
                input: load.output
                env: _image.config.env
                workdir: "/src"
                args: ["./gradlew", ":app:bootJar"]
                mounts: _gradleCacheMount
            }
            jar: core.#Subdir & {
                input: gradle.output
                path: "/src/app/build/libs"
            }
            openapi: core.#Subdir & {
                input: gradle.output
                path: "/src/appApiSchema/build"
            }
        }
        push: {
            _image: java.#Image
            copy: core.#Copy & {
                input: _image.rootfs
                contents: build.contents.output
                dest: "/root"
            }
            // TODO: AWS ECRへのpushに置き換える
            load: cli.#Load & {
                image: docker.#Image & {
                    rootfs: copy.output
                    config: core.#ImageConfig & {
                        env: _image.config.env
                        entrypoint: ["java"]
                        cmd: ["-jar", "/root/app-1.0.jar"]
                    }
                }
                host: client.network."unix:///var/run/docker.sock".connect
                tag: "java-app:load"
            }
        }
	}
}
