package main

import (
	"dagger.io/dagger"
	"com.example.dagger/action"
)

dagger.#Plan & {
	client: filesystem: {
		"..": read: contents:                dagger.#FS
		"./_build/jar": write: contents:     actions.build.jar.output
		"./_build/openapi": write: contents: actions.build.openapi.output
	}
	client: commands: sts: {
		name: "aws"
		args: ["sts", "assume-role", "--role-arn", "arn:aws:iam::146161350821:role/ecr_login_role", "--role-session-name", "AWSCLIsession"]
		stdout: dagger.#Secret
	}

	actions: {
		build: action.#Build & {
			src: client.filesystem."..".read.contents
		}
		loadSecret: action.#LoadSecret & {
			input: client.commands.sts.stdout
		}
		push: action.#Push & {
			credentials: loadSecret.credentials
			jarDir:      build.jar.output
			tag:         "dagger"
		}
	}
}
