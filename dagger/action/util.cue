package action

import (
	"dagger.io/dagger"
	"dagger.io/dagger/core"
	"universe.dagger.io/aws"
)

#LoadSecret: {
	input:       dagger.#Secret
	_awsSecrets: core.#DecodeSecret & {
		format:  "json"
		"input": input
	}
	_credential: _awsSecrets.output.Credentials
	credentials: aws.#Credentials & {
		accessKeyId:     _credential.AccessKeyId.contents
		secretAccessKey: _credential.SecretAccessKey.contents
		sessionToken:    _credential.SessionToken.contents
	}
}
