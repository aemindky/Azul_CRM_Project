Feature: User should be able to log out
  1- The user can log out and ends up on the login page.
  2- The user can not go to the home page again by clicking
  the step back button after successfully logging out.
  3- The user must be logged out if the user close the open
  tab (all tabs if there are multiple open tabs)
  @AZUL10-347
  Background: user is on the homepage
    Given user is on the homepage

  @AZUL10-347 @Wipp
  Scenario: The user can log out and ends up on the login page.
    When The user clicks on logout button in the profile menu
    Then The user ends up in Login page

  @AZUL10-347
  Scenario: User cannot go to the homepage with step-back button
    When The user clicks on logout button in the profile menu
    And The user ends up in Login page
    And The user clicks on step-back button in the browser
    Then The user ends up in "Login" page

  @AZUL10-347
  Scenario: The user must be logged out if the user close the open tab or tabs
    When The user closes all the open tabs
    And The user navigates to the "qa.azulcrm.com" page
    Then The user ends up in Login page