@login-functionality
Feature: User Login Functionality

  As an user,
  I want to __Login to App__
  In order to ***Use the App***

  Background: User already open browser and go to login page
    Given User already on Login Page

  Scenario Outline: Verify user login with valid registered credentials
    When User want to login as <role>
    Then User logged in as <role>
#      And Message Login Successful ! appeared


    Examples:
      | role   |
      | Admin  |
      | Mentor |
      | Mentee |

  Scenario: Verify user login with unregistered credential
    When User want to login with unregistered Credentials
    Then User cannot login
    And Message password must contain one uppercase appeared

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

  @Manual
  @Manual:Failed
  Scenario: Verify user login without email suffix
    When User login without email suffix
    Then User cannot login
    And Message Please enter an email address appeared

  Scenario: Verify minimal length of allowed password input
    When User login with 7 character password
    Then User cannot login
    And Message password must be 8 character appeared

  Scenario: Verify max length allowed text input on password field
    When User login with 31 char length password
    Then User cannot login
    And Message password must not exceed 30 characters appeared

  Scenario: Verify whether email field is case sensitive
    When User login with uppercase email
    Then User logged in as Admin
    And Message Login Successful ! appeared

  Scenario: Verify whether password field is case sensitive
    When User login with uppercase password
    Then User cannot login
    And Message Invalid email or password appeared

  Scenario: Verify max length allowed text input on email field
    When User login with 76 char length email
    Then User cannot login
    And Message Invalid email or password appeared

  Scenario: Verify user login with copy pasted email
    When User login as admin with copy pasted email
    Then User logged in as Admin
    And Message Login Successful ! appeared

  Scenario: Verify user login with copy pasted password
    When User login as admin with copy pasted password
    Then User logged in as Admin
    And Message Login Successful ! appeared

  @Manual
  @Manual:Passed
  Scenario: Verify user login with multiple tap on login button
    When User login as Admin
    But User press login button multiple time
    Then User logged in as Admin

  @Manual
  @Manual:Failed
  Scenario: Verify user login at the same times with different browser
    When User login as admin on Windows 1
    And User open login page on Windows 2
    Then User logged in as Admin

  @Manual
  @Manual:Failed
  Scenario: Verify user login when other login session is active
    When User open another tab
    And User go to Login Page
    Then User is redirected to Admin Home Page

  @Manual
  @Manual:Failed
  Scenario: Verify accessing webapp after close without logout
    Given User close the browser
    When User already on Login Page
    Then User logged in as Admin

  @Manual
  @Manual:Passed
  Scenario: Verify accessing webapp after close and logout
    Given User already logout
    And User close the browser
    When User already on Login Page
    Then User is not logged in

  @Manual
  @Manual:Failed
  Scenario: Verify eye icon functionality
    When User type valid password
    And User click eye icon
    Then The password is revealed

  @Manual
  @Manual:Passed
  Scenario: Verify data inputted was cleaned while page refreshed
    Given User login as Admin
    But User doesnt click Login Button
    When User press REFRESH on Browser
    Then Credentials is cleaned

  @Manual
  @Manual:Passed
  Scenario: Verify critical element visibility when windows resized
    When User resized the browser
    Then All Critical Element is visible

  @Manual
  @Manual:Passed
  Scenario: Verify user login but network disconnected when request sent
    Given User already on Login Page
    When User login as admin
    But the internet is disconnected
    Then Request expired"

  @Manual
  @Manual:Passed
  Scenario: Verify accessing webapp trough browser typing directly
    Given User already on Open Browser
    When User go to Login Page
    Then User is on Login Page"
