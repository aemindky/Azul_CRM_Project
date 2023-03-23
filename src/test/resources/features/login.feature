Feature: User should be able to login using correct credentials
  Agile story: As a user, when I try to login
  I should be able to login

    Background: user is on the login page
      Given user is on the login page of web table app

    @AZUL10-343
    Scenario Outline: Users can login with valid credentials
      When user enters valid username "<username>"
      And user enters valid password "<password>"
      And user enters click
      Then user should see the dashboard


      Examples:
      |username                        |password|
      |hr11@cybertekschool.com         |UserUser|
      |hr12@cybertekschool.com         |UserUser|
      |marketing81@cybertekschool.com  |UserUser|
      |marketing88@cybertekschool.com  |UserUser|
      |helpdesk11@cybertekschool.com   |UserUser|
      |helpdesk22@cybertekschool.com   |UserUser|

  @AZUL10-343
    Scenario Outline: Users can login with invalid credentials
      When user enters invalid username "<username>"
      And user enters invalid password "<password>"
      And user enters click
      Then user should see incorrect login or password text

      Examples:
        |username                         |password |
        |hr11@cyberteckschool.com         |UserUser |
        |hr12@cyberteckschool.com         |UserUser |
        |marketing88@cyberteckschool.com  |Uerser   |
        |marketing81@cyberteckschool.com  |UserUserr|
        |Helpdesk11@cyberteckschool.com   |UsserUser|
        |helpdesk22@cyberteckSchool.com   |UsersUser|


#  @AZUL10-343
#    Scenario: User should see "Please fill out this field" message
#      When user enters any username
#      And user enters any password
#      And user enters click
#      Then user should see please fill out this message

  @AZUL10-343
    Scenario: User land on the ‘Get Password’ page
      after clicking on the "Forgot your password?" link
      When user clicks on the Forgot your password link
      Then user lands on the Get Password page

  @AZUL10-343
    Scenario: User can see "Remember Me" link
      When Remember Me link exists on the login page
      Then Remember Me link is clickable

  @AZUL10-343
    Scenario: User should see the password in bullet signs by default
    # When user types password into password input box
      Then user should see password in bullet signs

  @AZUL10-343
    Scenario: Verify if the ‘Enter’ key of the keyboard is working correctly on the login page
      When user enters username
      And user enters password and presses the Enter button
      Then user should see the dashboard


  @AZUL10-343 @wipp
    Scenario: All users can see their own usernames in the profile menu, after successful login
      When user enters valid username
      And user enters valid password
      And user enters click
      Then user see his-her own username in the profile menu


