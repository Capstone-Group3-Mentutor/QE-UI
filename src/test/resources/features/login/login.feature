Feature: User Login Functionality

  As an user,
  I want to __Login to App__
  In order to ***Use the App***

  Background: User already open browser and go to login page
    Given User already on Login Page

    Scenario Outline: Verify user login with valid registered credentials
      When User want to login as <role>
      Then User logged in as <role>
      And Message Login Successful ! appeared

      Examples:
        | role   |
        | Admin  |
        | Mentor |
        | Mentee |

    Scenario: Verify user login with unregistered credential
      When User want to login with unregistered Credentials
      Then User cannot login
      And Message An invalid client request appeared

    Scenario: Verify user login without email
      When User login with blank email
      Then User cannot login
      And Message Email is required appeared

    Scenario: Verify user login without password
      When User login with blank password
      Then User cannot login
      And Message Password is required appeared

    Scenario: Verify user login without email and password
      When User login with blank email and blank password
      Then User cannot login
      And Message Email is required appeared
      And Message Password is required appeared

    Scenario: Verify user login without email suffix
      When User login without email suffix
      Then User cannot login
      And Message Please enter an email address appeared

    Scenario: Verify minimal length of allowed password input
      When User login with 9 character password
      Then User cannot login
      And Message password must be at least 8 character appeared

    Scenario: Verify max length allowed text input on password field
      When User login with 31 char length password
      Then User cannot login
      And Message password must not exceed 30 characters appeared

    Scenario: Verify whether email field is case sensitive
      When User login with uppercase email
      Then User cannot login
      And Message An invalid client request appeared

    Scenario: Verify whether password field is case sensitive
      When User login with uppercase password
      Then User cannot login
      And Message An invalid client request appeared

