@MultipleData
Feature: Register with multiple data

@Smoke
Scenario Outline: validate Register Page with multiple data

Given Launch chrome browser and open URL "http://demo.automationtesting.in/Register.html"
When user clicks the firstname and enter the value "<FirstName>"
And user clicks the lastname and enter the value "<LastName>"
And user clicks the address and enter the values "<Address>"
And user clicks the emailaddress and enter the value "<Email>"
And user clicks the phone and enter the value "<Phone>"
Then user validate the page title as "Register"


Examples:

|FirstName|LastName|Address|Email|Phone|
|Selenium1|Automation1|Kovilampakkam1|abcd@gmail.com|1234567891|
|Selenium2|Automation2|Kovilampakkam2|efgh@gmail.com|5234567891|
|Selenium3|Automation3|Kovilampakkam3|xyxz@gmail.com|3234567891|
|Selenium4|Automation4|Kovilampakkam4|xcvs@gmail.com|7234567891|




@Smoke
Scenario: New Test
Given Launch chrome browser and open URL "http://demo.automationtesting.in/Register.html"
Then user validate the page title as "Register"
