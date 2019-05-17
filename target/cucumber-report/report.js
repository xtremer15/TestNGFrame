$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Features/ParaBankRegistryPage.feature");
formatter.feature({
  "name": "This feature will handle the completion of registry form",
  "description": "  As an user\n  I want to fill the registry form\n  So that i can have an active account",
  "keyword": "Feature"
});
formatter.background({
  "name": "User is on the main Page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Main page has loaded",
  "keyword": "Given "
});
formatter.match({
  "location": "ParaBankRegistringPageStepDefinitions.main_page_has_loaded()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will click on Register",
  "keyword": "And "
});
formatter.match({
  "location": "ParaBankRegistringPageStepDefinitions.user_will_click_on_register()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User sees the registering form and \"Signing up is easy!\" is displayed as well",
  "keyword": "And "
});
formatter.match({
  "location": "ParaBankRegistringPageStepDefinitions.user_sees_the_registering_form_and_something_is_displayed_as_well(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User will insert the values in the boxes",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@TC01"
    }
  ]
});
formatter.step({
  "name": "User will add the values",
  "rows": [
    {
      "cells": [
        "First Name",
        "Last Name",
        "Address",
        "City",
        "State",
        "Zip Code",
        "Phone",
        "SSN",
        "User Name",
        "Password",
        "Confirm"
      ]
    },
    {
      "cells": [
        "ksdfh",
        "dfkjgh",
        "slkdfj",
        "fhdfhd",
        "hjjh",
        "ryu",
        "rutru",
        "hgjghj",
        "jkiu",
        "fdgh",
        "sdfshj"
      ]
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "ParaBankRegistringPageStepDefinitions.user_will_add_the_values(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The response should be displayed as invalid",
  "keyword": "Then "
});
formatter.match({
  "location": "ParaBankRegistringPageStepDefinitions.the_response_should_be_displayed_as_invalid()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "User is on the main Page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Main page has loaded",
  "keyword": "Given "
});
formatter.match({
  "location": "ParaBankRegistringPageStepDefinitions.main_page_has_loaded()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will click on Register",
  "keyword": "And "
});
formatter.match({
  "location": "ParaBankRegistringPageStepDefinitions.user_will_click_on_register()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User sees the registering form and \"Signing up is easy!\" is displayed as well",
  "keyword": "And "
});
formatter.match({
  "location": "ParaBankRegistringPageStepDefinitions.user_sees_the_registering_form_and_something_is_displayed_as_well(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "The user will not add any value",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@TC02"
    }
  ]
});
formatter.step({
  "name": "User does not add anything",
  "keyword": "Given "
});
formatter.match({
  "location": "ParaBankRegistringPageStepDefinitions.user_does_not_add_anything()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on submit",
  "keyword": "And "
});
formatter.match({
  "location": "ParaBankRegistringPageStepDefinitions.clicks_on_submit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Error should be displayed for the required fields",
  "keyword": "Then "
});
formatter.match({
  "location": "ParaBankRegistringPageStepDefinitions.error_should_be_displayed_for_the_required_fields()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "User is on the main Page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Main page has loaded",
  "keyword": "Given "
});
formatter.match({
  "location": "ParaBankRegistringPageStepDefinitions.main_page_has_loaded()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will click on Register",
  "keyword": "And "
});
formatter.match({
  "location": "ParaBankRegistringPageStepDefinitions.user_will_click_on_register()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User sees the registering form and \"Signing up is easy!\" is displayed as well",
  "keyword": "And "
});
formatter.match({
  "location": "ParaBankRegistringPageStepDefinitions.user_sees_the_registering_form_and_something_is_displayed_as_well(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User is going to check a null value",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@TC03"
    }
  ]
});
formatter.step({
  "name": "We have null value",
  "keyword": "Given "
});
formatter.match({
  "location": "ParaBankRegistringPageStepDefinitions.we_have_null_value()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will input the value",
  "rows": [
    {
      "cells": [
        "First Name",
        "Last Name",
        "Address",
        "City",
        "State",
        "Zip Code",
        "Phone",
        "SSN",
        "User Name",
        "Password",
        "Confirm"
      ]
    },
    {
      "cells": [
        "null",
        "null",
        "null",
        "null",
        "null",
        "null",
        "null",
        "",
        "null",
        "null",
        "null"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "ParaBankRegistringPageStepDefinitions.user_will_input_the_value(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Account should not be created",
  "keyword": "Then "
});
formatter.match({
  "location": "ParaBankRegistringPageStepDefinitions.account_should_not_be_created()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});