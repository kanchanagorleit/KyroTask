$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featurefile/login_test.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "To validate and check features of Login Page with invalid data",
  "description": "",
  "id": "to-validate-and-check-features-of-login-page-with-invalid-data",
  "keyword": "Feature",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "line": 24,
  "name": "Login the web application",
  "description": "",
  "id": "to-validate-and-check-features-of-login-page-with-invalid-data;login-the-web-application",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 23,
      "name": "@invalidCredentials"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "Launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "Click the login button",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "Enter the username \"\u003cusername\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Enter the password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Click on Continue",
  "keyword": "Then "
});
formatter.examples({
  "line": 32,
  "name": "",
  "description": "",
  "id": "to-validate-and-check-features-of-login-page-with-invalid-data;login-the-web-application;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "error"
      ],
      "line": 34,
      "id": "to-validate-and-check-features-of-login-page-with-invalid-data;login-the-web-application;;1"
    },
    {
      "cells": [
        "kanchana@gmail.com",
        "NandithaSree@1215",
        "invalid username or password"
      ],
      "line": 35,
      "id": "to-validate-and-check-features-of-login-page-with-invalid-data;login-the-web-application;;2"
    },
    {
      "cells": [
        "kanchanagorle@gmail.com",
        "admin@1234",
        "invalid username or password"
      ],
      "line": 36,
      "id": "to-validate-and-check-features-of-login-page-with-invalid-data;login-the-web-application;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 35,
  "name": "Login the web application",
  "description": "",
  "id": "to-validate-and-check-features-of-login-page-with-invalid-data;login-the-web-application;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    },
    {
      "line": 23,
      "name": "@invalidCredentials"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "Launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "Click the login button",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "Enter the username \"kanchana@gmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Enter the password \"NandithaSree@1215\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Click on Continue",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.launch_the_application()"
});
formatter.result({
  "duration": 2029192600,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_the_login_button()"
});
formatter.result({
  "duration": 3302276800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kanchana@gmail.com",
      "offset": 20
    }
  ],
  "location": "Steps.enter_the_username(String)"
});
formatter.result({
  "duration": 192535400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NandithaSree@1215",
      "offset": 20
    }
  ],
  "location": "Steps.enter_the_password(String)"
});
formatter.result({
  "duration": 166220900,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_on_Continue()"
});
formatter.result({
  "duration": 778120800,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "Login the web application",
  "description": "",
  "id": "to-validate-and-check-features-of-login-page-with-invalid-data;login-the-web-application;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    },
    {
      "line": 23,
      "name": "@invalidCredentials"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "Launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "Click the login button",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "Enter the username \"kanchanagorle@gmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Enter the password \"admin@1234\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Click on Continue",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.launch_the_application()"
});
formatter.result({
  "duration": 516813100,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_the_login_button()"
});
formatter.result({
  "duration": 1375404900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kanchanagorle@gmail.com",
      "offset": 20
    }
  ],
  "location": "Steps.enter_the_username(String)"
});
formatter.result({
  "duration": 137411900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin@1234",
      "offset": 20
    }
  ],
  "location": "Steps.enter_the_password(String)"
});
formatter.result({
  "duration": 155767400,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_on_Continue()"
});
formatter.result({
  "duration": 803214500,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": "Login the web application",
  "description": "",
  "id": "to-validate-and-check-features-of-login-page-with-invalid-data;login-the-web-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 38,
      "name": "@validCredentials"
    }
  ]
});
formatter.step({
  "line": 41,
  "name": "in login page",
  "keyword": "Given "
});
formatter.step({
  "line": 42,
  "name": "click login button",
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "Enter username as \"kanchanagit@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "Enter password as \"Kanchana@1234\"",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "Continue",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.in_login_page()"
});
formatter.result({
  "duration": 480814200,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_login_button()"
});
formatter.result({
  "duration": 1292511400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kanchanagit@gmail.com",
      "offset": 19
    }
  ],
  "location": "Steps.enter_username_as(String)"
});
formatter.result({
  "duration": 138090600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Kanchana@1234",
      "offset": 19
    }
  ],
  "location": "Steps.enter_password_as(String)"
});
formatter.result({
  "duration": 139950500,
  "status": "passed"
});
formatter.match({
  "location": "Steps.continue_to_login()"
});
formatter.result({
  "duration": 1613261700,
  "status": "passed"
});
formatter.scenario({
  "line": 50,
  "name": "Navigate To Dashboard",
  "description": "",
  "id": "to-validate-and-check-features-of-login-page-with-invalid-data;navigate-to-dashboard",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 49,
      "name": "@Dashboard"
    }
  ]
});
formatter.step({
  "line": 51,
  "name": "home page",
  "keyword": "Given "
});
formatter.step({
  "line": 52,
  "name": "New project",
  "keyword": "Then "
});
formatter.step({
  "line": 53,
  "name": "Create New Project",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.home_page()"
});
formatter.result({
  "duration": 1048592400,
  "status": "passed"
});
formatter.match({
  "location": "Steps.new_project()"
});
formatter.result({
  "duration": 640343900,
  "status": "passed"
});
formatter.match({
  "location": "Steps.create_New_project()"
});
formatter.result({
  "duration": 5180193700,
  "status": "passed"
});
formatter.scenario({
  "line": 56,
  "name": "Creating new task under the new project",
  "description": "",
  "id": "to-validate-and-check-features-of-login-page-with-invalid-data;creating-new-task-under-the-new-project",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 55,
      "name": "@CreateTask"
    }
  ]
});
formatter.step({
  "line": 57,
  "name": "Project selected",
  "keyword": "Given "
});
formatter.step({
  "line": 58,
  "name": "Start creating task",
  "keyword": "Then "
});
formatter.step({
  "line": 59,
  "name": "Verify task created",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.select_project()"
});
formatter.result({
  "duration": 1136248000,
  "status": "passed"
});
formatter.match({
  "location": "Steps.start_creating_task()"
});
formatter.result({
  "duration": 3347826200,
  "status": "passed"
});
formatter.match({
  "location": "Steps.verify_task_created()"
});
formatter.result({
  "duration": 1028722000,
  "error_message": "java.lang.AssertionError: The following asserts failed:\n\tdid not expect [Application error: a client-side exception has occurred (see the browser console for more information).] but found [Application error: a client-side exception has occurred (see the browser console for more information).]\r\n\tat org.testng.asserts.SoftAssert.assertAll(SoftAssert.java:47)\r\n\tat org.testng.asserts.SoftAssert.assertAll(SoftAssert.java:31)\r\n\tat kyro.stepdefinition.Steps.verify_task_created(Steps.java:152)\r\n\tat ✽.And Verify task created(featurefile/login_test.feature:59)\r\n",
  "status": "failed"
});
});