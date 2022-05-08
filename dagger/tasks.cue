package main

import (
	"dagger.io/dagger"
	"dagger.io/dagger/core"
	"universe.dagger.io/docker"
)

#JavaImage: {
    docker.#Build & {
        steps: [
            docker.#Pull & {
                source: "eclipse-temurin:\(tag)"
            },
            docker.#Copy & {
                contents: srcDir
                dest:     "/src"
            },
        ]
    }
    tag: string | *"16-jdk"
    srcDir: dagger.#FS
}

#GradleRun: {
	_gardleCacheMount: "/root/.gradle": {
		dest: "/root/.gradle"
		type: "cache"
		contents: core.#CacheDir & {
			id: ".gradle"
		}
	}

    _build: docker.#Run & {
        input: _image.output
        command: {
            name: "./gradlew"
            args: arguments
        }
        workdir: "/src"
        mounts: _gardleCacheMount
        "env": env
        "always": always
    }

    _image: #JavaImage & {
        srcDir: src
    }
    src: dagger.#FS
    arguments: [...string]
    output: _build.output
    export: _build.export
    env: [string]: string
    success: _build.success
    always?: bool | *true
}

#CueImage: {
    docker.#Build & {
        steps: [
            docker.#Pull & {
                source: "golang:1.18.1"
            },
            docker.#Run & {
                command: {
                    name: "go"
                    args: ["install", "cuelang.org/go/cmd/cue@latest"]
                }
            },
            docker.#Copy & {
                contents: srcDir
                dest:     "/src"
            },
            docker.#Run & {
                command: {
                    name: "mkdir"
                    args: ["-p", "/src/appApiSchema/build"]
                }
            },
        ]
    }
    srcDir: dagger.#FS
}

#CueRun: {
    _run: docker.#Run & {
        input: _image.output
        command: {
            name: "sh"
            args: ["-c", script]
        }
        workdir: "/src/appApiSchema"
    }
    _image: #CueImage & {
        srcDir: src
    }
    src: dagger.#FS
    script: string
    output: _run.output
    export: _run.export
}
