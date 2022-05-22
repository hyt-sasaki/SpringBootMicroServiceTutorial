data "terraform_remote_state" "oidc" {
  backend = "s3"

  config = {
    bucket = "hytssk-remote-tfstate"
    key    = "SpringBootMicroServiceTutorial/resources/oidc"
    region = "ap-northeast-1"
  }
}

data "terraform_remote_state" "ecr" {
  backend = "s3"

  config = {
    bucket = "hytssk-remote-tfstate"
    key    = "SpringBootMicroServiceTutorial/resources/ecr"
    region = "ap-northeast-1"
  }
}
