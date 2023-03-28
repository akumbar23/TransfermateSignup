$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/TransfermateSignup.feature");
formatter.feature({
  "name": "First example",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful Login with Valid Credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "User Launch Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "kuchbhi.user_Launch_Chrome_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User opens URL \"https://www.transfermate.io/en/register.asp\"",
  "keyword": "When "
});
formatter.match({
  "location": "kuchbhi.user_opens_URL(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on Corporate",
  "keyword": "And "
});
formatter.match({
  "location": "kuchbhi.click_on()"
});
formatter.result({
  "status": "skipped"
});
});