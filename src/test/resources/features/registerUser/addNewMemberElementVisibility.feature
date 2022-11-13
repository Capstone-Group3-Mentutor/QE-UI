@register
Feature: Add new member element visibility

  As an Tester,
  I want to ___Check all critical element is visible___
  In order to ***Check I can create new member***

  Background: User already login as Admin
    Given User want to login as Admin

  @Manual
  @Manual:Passed
  @TryAutomated
  Scenario: Verify all Add new member page element visibility using automated element inspector
    When User wait until all element loaded
    Then All Element is visible in Register page

  @Manual
  @Manual:Passed
  @TryAutomated
  Scenario: Verify Page Title visibility
    When User resize down the browser
    Then All Element is visible in Register page
