Feature: login DataDriven

Scenario Outline: verify login functionality

Given I have navigate to application
Then I enter valid username "<uname>"
And I should enter valid password "<password>"
Then I should click  submit button

Examples:

|uname    |password| 
|tutorial |tutorial|

