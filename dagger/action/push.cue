package action

import (
	"dagger.io/dagger"
	"dagger.io/dagger/core"
	"universe.dagger.io/docker"
	"universe.dagger.io/docker/cli"
	"com.example.dagger/images/java"
)

#Push: {
    _image: java.#Image
    dockerHost: dagger.#Socket
    jarDir: dagger.#FS
    tag: *"java-app:load" | string
    copy: core.#Copy & {
        input: _image.rootfs
        contents: jarDir
        dest: "/root"
    }
    buildImage: docker.#Image & {
        rootfs: copy.output
        config: core.#ImageConfig & {
            env: _image.config.env
            entrypoint: ["java"]
            cmd: ["-jar", "/root/app-1.0.jar"]
        }
    }
    // TODO: AWS ECRへのpushに置き換える
    load: cli.#Load & {
        image: buildImage
        host: dockerHost
        "tag": tag
    }
}
