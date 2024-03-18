Feature: To test the login functionality

  Scenario: Login with correct credentials
    Given User is on the Customer login page
    When User enters valid Username TestUser2
    And User enters valid Password Test@1230
    Then User should be navigated to Accounts Services Page

    Scenario: Login with invalid password
      Given User is on the Customer login page
      When User enters valid Username TestUser2
      And User enters invalid Password Test@123
      Then User should be prompted with Error The username and password could not be verified