$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/addTitle.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@regressionoct"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User click on add tariff button",
  "keyword": "And "
});
formatter.match({
  "location": "AddTraiffPlan.user_click_on_add_tariff_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regressionoct"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "User enters tariff plan fields",
  "keyword": "When "
});
formatter.match({
  "location": "AddTraiffPlan.user_enters_tariff_plan_fields()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on tariff submit button",
  "keyword": "And "
});
formatter.match({
  "location": "AddTraiffPlan.user_click_on_tariff_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be received congratulation message",
  "keyword": "Then "
});
formatter.match({
  "location": "AddTraiffPlan.user_should_be_received_congratulation_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User click on add tariff button",
  "keyword": "And "
});
formatter.match({
  "location": "AddTraiffPlan.user_click_on_add_tariff_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regressionoct"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User enters tariff plan fields with two dim list",
  "rows": [
    {
      "cells": [
        "400",
        "300",
        "200",
        "100",
        "4",
        "3",
        "2"
      ]
    },
    {
      "cells": [
        "300",
        "200",
        "100",
        "100",
        "5",
        "4",
        "3"
      ]
    },
    {
      "cells": [
        "200",
        "100",
        "300",
        "100",
        "6",
        "5",
        "4"
      ]
    },
    {
      "cells": [
        "100",
        "400",
        "400",
        "100",
        "7",
        "6",
        "5"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddTraiffPlan.user_enters_tariff_plan_fields_with_two_dim_list(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on tariff submit button",
  "keyword": "And "
});
formatter.match({
  "location": "AddTraiffPlan.user_click_on_tariff_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be received congratulation message",
  "keyword": "Then "
});
formatter.match({
  "location": "AddTraiffPlan.user_should_be_received_congratulation_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "User enters tariff plan fields \"\u003cMR\u003e\",\"\u003cFLM\u003e\",\"\u003cFIM\u003e\",\"\u003cFSP\u003e\",\"\u003cLMC\u003e\",\"\u003cIMC\u003e\",\"\u003cSMC\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User click on tariff submit button",
  "keyword": "And "
});
formatter.step({
  "name": "User should be received congratulation message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "MR",
        "FLM",
        "FIM",
        "FSP",
        "LMC",
        "IMC",
        "SMC"
      ]
    },
    {
      "cells": [
        "400",
        "300",
        "200",
        "100",
        "4",
        "3",
        "2"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User click on add tariff button",
  "keyword": "And "
});
formatter.match({
  "location": "AddTraiffPlan.user_click_on_add_tariff_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regressionoct"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "User enters tariff plan fields \"400\",\"300\",\"200\",\"100\",\"4\",\"3\",\"2\"",
  "keyword": "When "
});
formatter.match({
  "location": "AddTraiffPlan.user_enters_tariff_plan_fields(String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on tariff submit button",
  "keyword": "And "
});
formatter.match({
  "location": "AddTraiffPlan.user_click_on_tariff_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be received congratulation message",
  "keyword": "Then "
});
formatter.match({
  "location": "AddTraiffPlan.user_should_be_received_congratulation_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});