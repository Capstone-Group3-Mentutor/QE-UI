@login
Feature: Login Page Performance

  @Manual
  @Manual:Passed
  Scenario: Verify accessing webapp trough link
    Given User clicking link which redirect to web app
    When Browser Open
    Then User is on Login Page"

  @Manual
  @Manual:Passed
  Scenario: Verify functionallity when multiple Browser instances open
    Given User already login as admin in Windows 1
    When User open New Browser Window 2
    Then User already logged in as admin"

  @Manual
  @Manual:Passed
  Scenario: Verify critical element visibility when font resized
    Given User already on Login Page
    When User resized the font
    Then All Critical Element is visible"

  @Manual
  @Manual:Failed
  Scenario: Verify app handler when application is busy
    Given User is login when app is crowded
    When User login as admin
    Then User is prompted that the App is Busy
    And Message App is Busy. Try again Later! appeared"

  @Manual
  @Manual:Failed
  Scenario: Verify app behaviour when operation timeout
    Given Tester already on Login Page
    When Tester login as admin
    But Tester connection timeout
    Then Page is shown timeout handling"