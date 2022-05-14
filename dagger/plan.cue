package main

import (
	"dagger.io/dagger"
	"dagger.io/dagger/core"
	"com.example.dagger/images:image"
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
    actions: {
        build: {
            _image: image.#Image
            load: core.#Copy & {
                input: _image.rootfs
                contents: client.filesystem."..".read.contents
                dest: "/src"
            }
            mkdir: core.#Mkdir & {
                input: load.output
                path: "/src/appApiSchema/build"
            }
            openapi: core.#Exec & {
                input: mkdir.output
                env: _image.config.env
                workdir: "/src/appApiSchema"
                args: ["cue", "export", "-o", "/src/appApiSchema/build/openapi.yaml", "-f"]
            }
            gradle: core.#Exec & {
                input: openapi.output
                env: openapi.env
                workdir: "/src"
                args: ["./gradlew", ":app:bootJar"]
                mounts: _gradleCacheMount
            }
            contents: core.#Subdir & {
                input: gradle.output
                path: "/src/app/build"
            }
        }
	}
}
