package cue

import (
	"universe.dagger.io/docker"
)

_#DefaultVersion: "v0.4.3"

#Image: {
    version: *_#DefaultVersion | string

    docker.#Image & {
        _build: docker.#Build & {
            steps: [
                docker.#Pull & {
                    source: "golang:1.18.1"
                },
                docker.#Run & {
                    command: {
                        name: "go"
                        args: ["install", "cuelang.org/go/cmd/cue@\(version)"]
                    }
                },
            ]
        }
        _build.output
    }
}
