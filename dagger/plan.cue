package main

import (
	"dagger.io/dagger"
	"com.example.dagger/action"
)

dagger.#Plan & {
	client: filesystem: {
        "..": read: contents: dagger.#FS
        "./_build/jar": write: contents: actions.build.jar.output
        "./_build/openapi": write: contents: actions.build.openapi.output
    }
	client: network: "unix:///var/run/docker.sock": connect: dagger.#Socket

    actions: {
        build: action.#Build & {
            src: client.filesystem."..".read.contents
        }
        push: action.#Push & {
            dockerHost: client.network."unix:///var/run/docker.sock".connect
            jarDir: build.jar.output
            tag: "java-app:load"
        }
	}
}
