package main

import (
	"dagger.io/dagger"
	"dagger.io/dagger/core"
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
            }
            contents: core.#Subdir & {
                input: gradle.output.rootfs
                path: "/src/app/build"
            }
		}
	}
}
