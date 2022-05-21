package image

import (
	"dagger.io/dagger/core"
	"universe.dagger.io/docker"
	"com.example.dagger/images/java"
	"com.example.dagger/images/cue"
)

#Image: docker.#Image & {
	_cueImage:  cue.#Image
	_javaImage: java.#Image
	_copy:      core.#Copy & {
		input:    _javaImage.rootfs
		contents: _cueImage.rootfs
		source:   "/go/bin/cue"
		dest:     "/usr/local/bin/cue"
	}
	rootfs: _copy.output
	config: _javaImage.config
}
