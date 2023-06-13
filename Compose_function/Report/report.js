$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/DELL/eclipse-workspace/Compose_function/Feature/Login_test.feature");
formatter.feature({
  "line": 1,
  "name": "Compose Function",
  "description": "",
  "id": "compose-function",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Compose mail to particular recepient",
  "description": "",
  "id": "compose-function;compose-mail-to-particular-recepient",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "user is on Gmail page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters email and password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user click on Next Button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user is on Gmail home page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user click on Compose Button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user click on TO section of compose mail",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user click on Subject section",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "add \"Incubyte\"  to subject section",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user click on Body of mail",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "add \"Automation QA test for Incubyte\" to Body section",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user click on Send button",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "Message displayed Message Sent Successfully",
  "keyword": "Then "
});
});