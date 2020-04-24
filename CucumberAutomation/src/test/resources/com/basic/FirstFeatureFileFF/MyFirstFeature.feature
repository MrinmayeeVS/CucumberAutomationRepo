Feature: Create account of Facebook4
As a user you need to open Facebook home page and do the validation

Scenario: Validate First Name Field41
Given User need to be on Facebook login page
When User enters user first name
Then User checks user first name is present

#Scenario: Validate Create User Multiple Fields
#Given User need to be on Facebook login page
#When User enters user first name
#And User enters user surname
#Then User checks user first name is present
#And User checks user surname is present
#But User mobile field should be blank