terraform {
  backend s3 {
    bucket = "hytssk-remote-tfstate"
    key = "SpringBootMicroServiceTutorial/resources/ecr"
    region = "ap-northeast-1"
  }
  required_providers {
    aws = {
      source = "hashicorp/aws"
      version = "4.14.0"
    }
  }
}

resource "aws_ecr_repository" "test" {
  name                 = "test"
  image_tag_mutability = "MUTABLE"

  image_scanning_configuration {
    scan_on_push = false
  }
}
