terraform {
  
  required_providers {
    aws = {
      source = "hashicorp/aws"
      version = "4.22.0"
    }
  }

  backend "s3" {
    bucket = "seank-s3-test-tf"
    key = "terraform.tfstate"
    region = "ap-northeast-2"
    dynamodb_table = "seank-dynamodb-test-tf-lock"
    encrypt = "true"
  }
}

provider "aws" {
  region = var.aws_region
}