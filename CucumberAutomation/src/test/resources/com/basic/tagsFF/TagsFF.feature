@Important
Feature: Create account of Facebook11
As a user you need to open Facebook home page and do the validation

@Smoke
Scenario: Validate First Name Field1111
Given User need to be on Facebook login page
When User enters user "David" first name
Then User checks user "David" first name is present
Then Close browser

@Smoke @Regression
Scenario: Validate Create User Multiple Fields2112
Given User need to be on Facebook login page
When User enters user "Ryan" first name
And User enters user "Jack" surname
Then User checks user "Ryan" first name is present
And User checks user "Jack" surname is present
Then User mobile field should be blank
Then Close browser

Scenario: Validate First Name Field3113
Given User need to be on Facebook login page
When User enters user "David" first name
Then User checks user "David" first name is present
Then Close browser

@Regression
Scenario: Validate First Name Field4114
Given User need to be on Facebook login page
When User enters user "David" first name
Then User checks user "David" first name is present
Then Close browser

@Regression @Smoke
Scenario: Validate First Name Field5115
Given User need to be on Facebook login page
When User enters user "David" first name
Then User checks user "David" first name is present
Then Close browser