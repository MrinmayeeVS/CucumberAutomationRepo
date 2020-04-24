Feature: Create account of Facebook1
As a user you need to open Facebook home page and do the validation

Background: Common Login Steps11
Given User need to be on Facebook login page

Scenario: Validate First Name Field12
When User enters user "David" first name
Then User checks user "David" first name is present
Then Close browser

Scenario: Validate Create User Multiple Fields13
When User enters user "Ryan" first name
And User enters user "Jack" surname
Then User checks user "Ryan" first name is present
And User checks user "Jack" surname is present
Then User mobile field should be blank
Then Close browser