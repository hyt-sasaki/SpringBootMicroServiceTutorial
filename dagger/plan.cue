package main

import (
	"dagger.io/dagger"
	"dagger.io/dagger/core"
	"universe.dagger.io/alpine"
	"universe.dagger.io/bash"
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
	client: filesystem: "..": read: contents: dagger.#FS
	actions: {
		deps: docker.#Build & {
			steps: [
				alpine.#Build & {
					packages: {
						gradle: {}
						bash: {}
					}
				},
				docker.#Copy & {
					contents: client.filesystem."..".read.contents
					dest:     "/root/project"
				},
			]
		}

		showTasks: bash.#Run & {
			input: deps.output
			script: contents: "echo $HOME && ls -la $HOME/.gradle && ./gradlew tasks && ls -la $HOME"
			workdir: "/root/project"
			mounts: _gardleCacheMount
		}

		check: bash.#Run & {
			input: showTasks.output
			script: contents: "echo $HOME && ls -la $HOME/.gradle && ./gradlew --help"
			workdir: "/root/project"
			mounts: _gardleCacheMount
			always: true
		}

	}
}
