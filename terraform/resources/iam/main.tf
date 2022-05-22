terraform {
  backend "s3" {
    bucket = "hytssk-remote-tfstate"
    key    = "SpringBootMicroServiceTutorial/resources/iam"
    region = "ap-northeast-1"
  }
  required_providers {
    aws = {
      source  = "hashicorp/aws"
      version = "4.14.0"
    }
  }
}

resource "aws_iam_role" "ecr_login_role" {
  name               = "ecr_login_role"
  assume_role_policy = data.aws_iam_policy_document.assume_policy.json
}

data "aws_iam_policy_document" "assume_policy" {
  statement {
    actions = ["sts:AssumeRole"]
    principals {
      type        = "AWS"
      identifiers = [local.dev_user_role_arn, aws_iam_role.gha.arn]
    }
  }
}

resource "aws_iam_role_policy" "ecr_login_policy" {
  name   = "ecr_login_policy"
  role   = aws_iam_role.ecr_login_role.id
  policy = data.aws_iam_policy_document.ecr_policy.json
}

data "aws_iam_policy_document" "ecr_policy" {
  statement {
    actions   = ["ecr:GetAuthorizationToken"]
    resources = ["*"]
  }
  statement {
    actions = [
      "ecr:GetDownloadUrlForLayer",
      "ecr:BatchGetImage",
      "ecr:BatchCheckLayerAvailability",
      "ecr:InitiateLayerUpload",
      "ecr:UploadLayerPart",
      "ecr:CompleteLayerUpload",
      "ecr:PutImage"
    ]
    resources = [data.terraform_remote_state.ecr.outputs.ecr_repository_arn]
  }
}


resource "aws_iam_role" "gha" {
  name               = "gha_role"
  assume_role_policy = data.aws_iam_policy_document.gha_assume_policy.json
}

data "aws_iam_policy_document" "gha_assume_policy" {
  statement {
    actions = ["sts:AssumeRoleWithWebIdentity"]
    principals {
      type        = "Federated"
      identifiers = [data.terraform_remote_state.oidc.outputs.arn]
    }
    condition {
      test     = "StringLike"
      variable = "token.actions.githubusercontent.com:sub"
      values   = ["repo:hyt-sasaki/SpringBootMicroServiceTutorial:*"]
    }
  }
}
