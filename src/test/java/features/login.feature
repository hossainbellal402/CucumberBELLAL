Feature: feature to test login functionality

Scenario: Check login is successful with valid credentials

Given user is on login page
When user enters username and password
And click on login button
Then user is navigated to the home page


  Scenario Outline: Check login is successful with valid credentials

    Given user is on login page
    When user enters <username> and <password>
    And click on login button
    Then user is navigated to the home page

  Examples:
  |username|password|
  |user1   |password1|
  |user2   |password2|
  |user3   |password3|
