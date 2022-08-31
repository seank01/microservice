resource "aws_s3_bucket" "test-s3-tf-state" {

  bucket = "seank-s3-test-tf"

  tags = {
    "Name" = "seank-s3-test-tf"
  }
  
}

resource "aws_dynamodb_table" "test-ddb-tf-lock" {

  depends_on   = [aws_s3_bucket.test-s3-tf-state]
  name         = "seank-dynamodb-test-tf-lock"
  billing_mode = "PAY_PER_REQUEST"
  hash_key     = "LockID"

  attribute {
    name = "LockID"
    type = "S"
  }

  tags = {
    "Name" = "seank-dynamodb-test-tf-lock"
  }

}