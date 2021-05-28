$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/AddBank.feature");
formatter.feature({
  "line": 2,
  "name": "User should able to access bank features",
  "description": "",
  "id": "user-should-able-to-access-bank-features",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@AddBankInformation"
    }
  ]
});
formatter.scenarioOutline({
  "line": 7,
  "name": "User should able to get into the page with correct infromation",
  "description": "",
  "id": "user-should-able-to-access-bank-features;user-should-able-to-get-into-the-page-with-correct-infromation",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "User enter the \"\u003cuserName\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User click on SignInbutton",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User land on the dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User click on Bank and Cash",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User click on Add New Account",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User enter the information \"\u003caccountTittle\u003e\" and \"\u003cdescription\u003e\" and \"\u003cinitialBalance\u003e\" and \"\u003caccountNumber\u003e\" and \"\u003ccontactPerson\u003e\" and \"\u003cphoneNumber\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User click on submit button",
  "keyword": "Then "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "user-should-able-to-access-bank-features;user-should-able-to-get-into-the-page-with-correct-infromation;",
  "rows": [
    {
      "cells": [
        "userName",
        "password",
        "accountTittle",
        "description",
        "initialBalance",
        "accountNumber",
        "contactPerson",
        "phoneNumber"
      ],
      "line": 17,
      "id": "user-should-able-to-access-bank-features;user-should-able-to-get-into-the-page-with-correct-infromation;;1"
    },
    {
      "cells": [
        "demo@techfios.com",
        "abc123",
        "Checking",
        "join account",
        "250000",
        "15484545",
        "817-558-5555",
        "800-585-5555"
      ],
      "line": 18,
      "id": "user-should-able-to-access-bank-features;user-should-able-to-get-into-the-page-with-correct-infromation;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 12018558400,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User should be techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefination.User_should_be_techfios_loginpage()"
});
formatter.result({
  "duration": 2516979200,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "User should able to get into the page with correct infromation",
  "description": "",
  "id": "user-should-able-to-access-bank-features;user-should-able-to-get-into-the-page-with-correct-infromation;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@AddBankInformation"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User enter the \"demo@techfios.com\" and \"abc123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User click on SignInbutton",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User land on the dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User click on Bank and Cash",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User click on Add New Account",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User enter the information \"Checking\" and \"join account\" and \"250000\" and \"15484545\" and \"817-558-5555\" and \"800-585-5555\"",
  "matchedColumns": [
    2,
    3,
    4,
    5,
    6,
    7
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User click on submit button",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 16
    },
    {
      "val": "abc123",
      "offset": 40
    }
  ],
  "location": "LoginStepDefination.user_enter_the_and(String,String)"
});
formatter.result({
  "duration": 179778700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_click_on_SignInbutton()"
});
formatter.result({
  "duration": 1677660500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_land_on_the_dashboard_page()"
});
formatter.result({
  "duration": 423240700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_click_on_Bank_and_Cash()"
});
formatter.result({
  "duration": 51336100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_click_on_Add_New_Account()"
});
formatter.result({
  "duration": 12351485100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Checking",
      "offset": 28
    },
    {
      "val": "join account",
      "offset": 43
    },
    {
      "val": "250000",
      "offset": 62
    },
    {
      "val": "15484545",
      "offset": 75
    },
    {
      "val": "817-558-5555",
      "offset": 90
    },
    {
      "val": "800-585-5555",
      "offset": 109
    }
  ],
  "location": "LoginStepDefination.user_enter_the_information_and_and_and_and_and(String,String,String,String,String,String)"
});
formatter.result({
  "duration": 1049311700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.User_click_on_submit_button()"
});
formatter.result({
  "duration": 1087373900,
  "status": "passed"
});
});