Feature: Create account of Facebook5
As a user you need to open Facebook home page and do the validation

Scenario: Validate First Name Field51
Given User need to be on Facebook login page
When User enters user "David" first name
Then User checks user "David" first name is present
#Then Close browser

Scenario: Validate Create User Multiple Fields52
Given User need to be on Facebook login page
When User enters user "Ryan" first name
And User enters user "Jack" surname
Then User checks user "Ryan" first name is present
And User checks user "Jack" surname is present
Then User mobile field should be blank
#Then Close browser