Feature: Login functionality
  Agile story: As a user, when I try to login
  I should be able to login

  Scenario: Login as Hr
    When user enters Hr username
    And user enters Hr Password
    And user enters click
    Then user should see the dashboard