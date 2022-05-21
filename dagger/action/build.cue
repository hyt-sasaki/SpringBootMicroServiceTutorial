package action

import (
	"dagger.io/dagger"
	"dagger.io/dagger/core"
	"com.example.dagger/images:image"
)

#Build: {
    _image: image.#Image
	_gradleCacheMount: "/root/.gradle": {
		dest: "/root/.gradle"
		type: "cache"
		contents: core.#CacheDir & {
			id: ".gradle"
		}
	}
    src: dagger.#FS
    load: core.#Copy & {
        input: _image.rootfs
        contents: src
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
