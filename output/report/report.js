$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Registration.feature");
formatter.feature({
  "name": "Registration",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@SingleData"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "Launch chrome browser and open URL \"http://demo.automationtesting.in/Register.html\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Demosite.launch_chrome_browser_and_open_URL(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Register details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SingleData"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "user clicks the firstname and enter the value \"Selenium\"",
  "keyword": "When "
});
formatter.match({
  "location": "Demosite.user_clicks_the_firstname_and_enter_the_value(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks the lastname and enter the value \"Automation\"",
  "keyword": "And "
});
formatter.match({
  "location": "Demosite.user_clicks_the_lastname_and_enter_the_value(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks the address and enter the values \"Kovilampakkam\"",
  "keyword": "And "
});
formatter.match({
  "location": "Demosite.user_clicks_the_address_and_enter_the_values(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks the emailaddress and enter the value \"abcd@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "Demosite.user_clicks_the_emailaddress_and_enter_the_value(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks the phone and enter the value \"1234567891\"",
  "keyword": "And "
});
formatter.match({
  "location": "Demosite.user_clicks_the_phone_and_enter_the_value(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user validate the page title as \"Register\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Demosite.user_validate_the_page_title(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user validate the cart page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});