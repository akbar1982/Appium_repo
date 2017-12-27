$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("verifyErrorMassage.feature");
formatter.feature({
  "line": 1,
  "name": "Hotels.com android app project",
  "description": "",
  "id": "hotels.com-android-app-project",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Verify sign in error message",
  "description": "Given: I open Hotels.com application",
  "id": "hotels.com-android-app-project;verify-sign-in-error-message",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@sign_in-1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "i press OK button from pop Up screen",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I press corner Menu button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I choose sign in from menu",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter \"mohammad@technosoftacademy.io\" into email textfield",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter \"Test12345\" into password field",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I press signIn button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I verify displayed \"\u003cerror message\u003e\" given below",
  "keyword": "Then "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "hotels.com-android-app-project;verify-sign-in-error-message;",
  "rows": [
    {
      "cells": [
        "error message"
      ],
      "line": 17,
      "id": "hotels.com-android-app-project;verify-sign-in-error-message;;1"
    },
    {
      "cells": [
        "We no longer support signing in with this version of the app. Please update to the latest version."
      ],
      "line": 18,
      "id": "hotels.com-android-app-project;verify-sign-in-error-message;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 18,
  "name": "Verify sign in error message",
  "description": "Given: I open Hotels.com application",
  "id": "hotels.com-android-app-project;verify-sign-in-error-message;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@sign_in-1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "i press OK button from pop Up screen",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I press corner Menu button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I choose sign in from menu",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter \"mohammad@technosoftacademy.io\" into email textfield",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter \"Test12345\" into password field",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I press signIn button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I verify displayed \"We no longer support signing in with this version of the app. Please update to the latest version.\" given below",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "TestInvalidLogin.i_press_OK_button_from_pop_Up_screen()"
});
formatter.result({
  "duration": 88484204822,
  "status": "passed"
});
formatter.match({
  "location": "TestInvalidLogin.i_press_corner_Menu_button()"
});
formatter.result({
  "duration": 1373291869,
  "status": "passed"
});
formatter.match({
  "location": "TestInvalidLogin.i_choose_sign_in_from_menu()"
});
formatter.result({
  "duration": 1531187815,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mohammad@technosoftacademy.io",
      "offset": 9
    }
  ],
  "location": "TestInvalidLogin.i_enter_into_email_textfield(String)"
});
formatter.result({
  "duration": 4585220310,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test12345",
      "offset": 9
    }
  ],
  "location": "TestInvalidLogin.i_enter_into_password_field(String)"
});
formatter.result({
  "duration": 1177709354,
  "status": "passed"
});
formatter.match({
  "location": "TestInvalidLogin.i_press_signIn_button()"
});
formatter.result({
  "duration": 811861112,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "We no longer support signing in with this version of the app. Please update to the latest version.",
      "offset": 20
    }
  ],
  "location": "TestInvalidLogin.iVerifyDisplayedGivenBelow(String)"
});
formatter.result({
  "duration": 1853946691,
  "status": "passed"
});
});