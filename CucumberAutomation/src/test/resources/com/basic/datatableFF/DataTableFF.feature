Feature: Create account of Facebook3
As a user you need to open Facebook home page and do the validation

Scenario: Validate Create User Multiple Fields31
Given User need to be on Facebook login page
When Enter following data
|userName |userSurname |mobile|
|Tom      |Hanks       |1234  |
|Jack     |Daniel      |5678  |
Then Close browser