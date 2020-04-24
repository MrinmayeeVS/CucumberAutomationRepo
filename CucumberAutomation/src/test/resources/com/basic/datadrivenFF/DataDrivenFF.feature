Feature: Create account of Facebook2
As a user you need to open Facebook home page and do the validation

Scenario Outline: Validate Create User Multiple Fields21
Given User need to be on Facebook login page
When User enters user "<user>" first name
And User enters user "<surName>" surname
Then User checks user "<user>" first name is present
And User checks user "<surName>" surname is present
Then User mobile field should be blank
Then Close browser

Examples:
| user   | surName |
| Tom    | Jerry   |
| Lorren | Hardy   | 