 Feature: Create account of Facebook8
As a user you need to open Facebook home page and do the validation

Scenario: Validate First Name Field81
Given User need to be on Facebook login page
When User enters user first name
Then User checks user first name is present
Then Close browser

Scenario: Validate Create User Multiple Fields82
Given User need to be on Facebook login page
When User enters user first name
And User enters user surname
Then User checks user first name is present
And User checks user surname is present
Then User mobile field should be blank
Then Close browser