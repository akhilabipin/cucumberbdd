Feature: Login Using Simple DataDriven

 
  Scenario: Verify Login with valid credential
    Given I should launch application
    Then I should enter username "tutorial"
    And I  have enter password "tutorial" 
    Then I should select to the submit button
