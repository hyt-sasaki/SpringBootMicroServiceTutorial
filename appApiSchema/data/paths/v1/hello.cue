package paths

import "strings"

let name = "hello"
let uri = "/v1/\(name)"
let dto = "#/components/schemas/\(strings.ToTitle(name))DTO"

#Paths: (uri): [string]: tags: [name]

#Paths: (uri): get: {
	responses: "200": {
		description: "get \(name) message"
		content: "application/json": schema: $ref: dto
	}
}
