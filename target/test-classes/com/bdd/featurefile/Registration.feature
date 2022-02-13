@SingleData
Feature: Registration

Background:
Given Launch chrome browser and open URL "http://demo.automationtesting.in/Register.html"


@Regression 
Scenario: Register details

When user clicks the firstname and enter the value "Selenium"
And user clicks the lastname and enter the value "Automation"
And user clicks the address and enter the values "Kovilampakkam"
And user clicks the emailaddress and enter the value "abcd@gmail.com"
And user clicks the phone and enter the value "1234567891"
Then user validate the page title as "Register"
Then user validate the cart page

@Smoke
Scenario: Register detail with multiple data
When user clicks the firstname and enter the value "Selenium1"

@test
Scenario: New case
When user clicks the firstname and enter the value "Selenium2"
