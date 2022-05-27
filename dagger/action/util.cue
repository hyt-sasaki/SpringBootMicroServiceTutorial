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
	credentials: aws.#Credentials & {
		accessKeyId:     _awsSecrets.output.Credentials.AccessKeyId.contents
		secretAccessKey: _awsSecrets.output.Credentials.SecretAccessKey.contents
		sessionToken:    _awsSecrets.output.Credentials.SessionToken.contents
	}
}
