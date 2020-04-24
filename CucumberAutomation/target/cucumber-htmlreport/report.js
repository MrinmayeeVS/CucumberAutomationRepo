$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TagsFF.feature");
formatter.feature({
  "line": 2,
  "name": "Create account of Facebook11",
  "description": "As a user you need to open Facebook home page and do the validation",
  "id": "create-account-of-facebook11",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Important"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Validate First Name Field1111",
  "description": "",
  "id": "create-account-of-facebook11;validate-first-name-field1111",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User need to be on Facebook login page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User enters user \"David\" first name",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User checks user \"David\" first name is present",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "TagsStepDef.user_need_to_be_on_Facebook_login_page()"
});
formatter.result({
  "duration": 16751305000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "David",
      "offset": 18
    }
  ],
  "location": "TagsStepDef.user_enters_user_first_name(String)"
});
formatter.result({
  "duration": 1105052600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "David",
      "offset": 18
    }
  ],
  "location": "TagsStepDef.user_checks_user_first_name_is_present(String)"
});
formatter.result({
  "duration": 1036923200,
  "status": "passed"
});
formatter.match({
  "location": "TagsStepDef.close_browser()"
});
formatter.result({
  "duration": 4140478500,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Validate Create User Multiple Fields2112",
  "description": "",
  "id": "create-account-of-facebook11;validate-create-user-multiple-fields2112",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@Smoke"
    },
    {
      "line": 12,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "User need to be on Facebook login page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "User enters user \"Ryan\" first name",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User enters user \"Jack\" surname",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User checks user \"Ryan\" first name is present",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "User checks user \"Jack\" surname is present",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User mobile field should be blank",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "TagsStepDef.user_need_to_be_on_Facebook_login_page()"
});
formatter.result({
  "duration": 16793220600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ryan",
      "offset": 18
    }
  ],
  "location": "TagsStepDef.user_enters_user_first_name(String)"
});
formatter.result({
  "duration": 1096029400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jack",
      "offset": 18
    }
  ],
  "location": "TagsStepDef.user_enters_user_surname(String)"
});
formatter.result({
  "duration": 1081523300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ryan",
      "offset": 18
    }
  ],
  "location": "TagsStepDef.user_checks_user_first_name_is_present(String)"
});
formatter.result({
  "duration": 1029161500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jack",
      "offset": 18
    }
  ],
  "location": "TagsStepDef.user_checks_user_surname_is_present(String)"
});
formatter.result({
  "duration": 1037398700,
  "status": "passed"
});
formatter.match({
  "location": "TagsStepDef.user_mobile_field_should_be_blank()"
});
formatter.result({
  "duration": 1037733900,
  "status": "passed"
});
formatter.match({
  "location": "TagsStepDef.close_browser()"
});
formatter.result({
  "duration": 4122458000,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Validate First Name Field4114",
  "description": "",
  "id": "create-account-of-facebook11;validate-first-name-field4114",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 28,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "User need to be on Facebook login page",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "User enters user \"David\" first name",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "User checks user \"David\" first name is present",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "Close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "TagsStepDef.user_need_to_be_on_Facebook_login_page()"
});
formatter.result({
  "duration": 15110686200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "David",
      "offset": 18
    }
  ],
  "location": "TagsStepDef.user_enters_user_first_name(String)"
});
formatter.result({
  "duration": 1098957200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "David",
      "offset": 18
    }
  ],
  "location": "TagsStepDef.user_checks_user_first_name_is_present(String)"
});
formatter.result({
  "duration": 1036276400,
  "status": "passed"
});
formatter.match({
  "location": "TagsStepDef.close_browser()"
});
formatter.result({
  "duration": 4386772000,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "Validate First Name Field5115",
  "description": "",
  "id": "create-account-of-facebook11;validate-first-name-field5115",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 35,
      "name": "@Regression"
    },
    {
      "line": 35,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 37,
  "name": "User need to be on Facebook login page",
  "keyword": "Given "
});
formatter.step({
  "line": 38,
  "name": "User enters user \"David\" first name",
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "User checks user \"David\" first name is present",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "Close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "TagsStepDef.user_need_to_be_on_Facebook_login_page()"
});
formatter.result({
  "duration": 16003436500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "David",
      "offset": 18
    }
  ],
  "location": "TagsStepDef.user_enters_user_first_name(String)"
});
formatter.result({
  "duration": 1119671800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "David",
      "offset": 18
    }
  ],
  "location": "TagsStepDef.user_checks_user_first_name_is_present(String)"
});
formatter.result({
  "duration": 1031999800,
  "status": "passed"
});
formatter.match({
  "location": "TagsStepDef.close_browser()"
});
formatter.result({
  "duration": 4353556100,
  "status": "passed"
});
});