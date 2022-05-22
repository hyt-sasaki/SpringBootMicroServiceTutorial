package action

import (
	"dagger.io/dagger"
	"dagger.io/dagger/core"
	"universe.dagger.io/docker"
	"universe.dagger.io/aws"
	awsCli "universe.dagger.io/aws/cli"
	"com.example.dagger/images/java"
)

#Push: {
	_image: java.#Image
	jarDir: dagger.#FS
	tag:    *"latest" | string
	copy:   core.#Copy & {
		input:    _image.rootfs
		contents: jarDir
		dest:     "/root"
	}
	buildImage: docker.#Image & {
		rootfs: copy.output
		config: core.#ImageConfig & {
			env: _image.config.env
			entrypoint: ["java"]
			cmd: ["-jar", "/root/app-1.0.jar"]
		}
	}
	credentials: aws.#Credentials
	ecrLogin:    awsCli.#Command & {
		"credentials": credentials
		options: region: "ap-northeast-1"
		unmarshal: false
		service: {
			name:    "ecr"
			command: "get-login-password"
		}
	}
	loadEcrSecret: core.#NewSecret & {
		input: ecrLogin.output.rootfs
		path:  "/output.txt"
	}
	dockerPush: docker.#Push & {
		image: buildImage
		dest:  "146161350821.dkr.ecr.ap-northeast-1.amazonaws.com/test:latest"
		auth: {
			username: "AWS"
			secret:   loadEcrSecret.output
		}
	}
}
