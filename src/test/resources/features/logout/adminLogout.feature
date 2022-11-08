@admin-logout
Feature: Admin logout

  As an admin
  I want to ___logout___
  In order to ***quit from web app***

  Background: User already login as admin
    Given User logged in as Admin

  Scenario: Verify User Logout as Admin functionality
    When User click logout menu
    And User click confirm logout
    Then User is logged out

  Scenario: Verify Cancel Logout as Admin functionality
    When User click logout menu
    And User click cancel logout
    Then User is not logged out

  Scenario: Verify Cancel Logout as Admin with refreshing the browser
    When User click logout menu
    And User click cancel logout
    And User press REFRESH on Browser
    Then User is not logged out