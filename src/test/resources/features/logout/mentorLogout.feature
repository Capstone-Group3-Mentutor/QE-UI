@mentor-logout
Feature: Mentor logout

  As an Mentor
  I want to ___logout___
  In order to ***quit from web app***

  Background: User already login as Mentor
    Given User want to login as Mentor

  Scenario: Verify User Logout as Mentor functionality
    When User click logout menu
    And User click confirm logout
    Then User is logged out

  Scenario: Verify Cancel Logout as Mentor functionality
    When User click logout menu
    And User click cancel logout
    Then User is not logged out from mentor

  Scenario: Verify Cancel Logout as Mentor with refreshing the browser
    When User click logout menu
    And User click cancel logout
    And User press REFRESH on Browser
    Then User is not logged out from mentor