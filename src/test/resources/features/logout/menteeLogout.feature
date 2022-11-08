@mentee-logout
Feature: Mentee logout

  As an Mentee
  I want to ___logout___
  In order to ***quit from web app***

  Background: User already login as Mentee
    Given User want to login as Mentee

    Scenario: Verify User Logout as Mentee functionality
      When User click logout menu
      And User click confirm logout
      Then User is logged out

    Scenario: Verify Cancel Logout as Mentee functionality
      When User click logout menu
      And User click cancel logout
      Then User is not logged out

    Scenario: Verify Cancel Logout as Mentee with refreshing the browser
      When User click logout menu
      And User click cancel logout
      And User press REFRESH on Browser
      Then User is not logged out