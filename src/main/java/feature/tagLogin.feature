Feature: tags
Background:
Given Launch the browser

@SmokeTest
Scenario:verify login with valid credentials
Given I navigate to Home Page
Then I click on Login button
And I should enter valid email id and password
Then Click on login button

@InvalidTest @FeatureTest
Scenario:verify login with invalid emailid and valid password
Given Launch the Home Page
Then user click on Login button
And user should enter invalid email id and valid password
Then user click on login button

@InvalidTest
Scenario:verify login with valid emailid and invalid password
Given user should Launch the Home Page
Then user should click on Login button
And user should enter valid email id and invalid password
Then user should click on login button

@InvalidTest @FeatureTest
Scenario:verify login with blank emailid and password
Given user should navigate to Home Page
Then user should click on Login 
And user should enter blank email id and blank password
Then click on login 
