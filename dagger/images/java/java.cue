package java

import (
	"universe.dagger.io/docker"
)

_#DefaultVersion: "16"

#Image: {
	version: *_#DefaultVersion | string

	docker.#Image & {
		_build: docker.#Build & {
			steps: [
				docker.#Pull & {
					source: "index.docker.io/eclipse-temurin:\(version)-jdk"
				},
			]
		}
		_build.output
	}
}
