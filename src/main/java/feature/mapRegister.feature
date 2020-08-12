Feature: Registration

  Scenario: verify Register functionality
    Given I have to launch application
    Then I should click on Register Menu
    Then I should select Gender
    Then I should enter data
      | FName | LName | Email              | Password | CPassword |
      | Jesni | AS    | jesni123@gmail.com | jes123   | jes123    |
    Then I should click on Register button
    Then I should close browser