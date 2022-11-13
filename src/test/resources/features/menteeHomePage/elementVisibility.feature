@mentee-home @lionelsantiago
Feature: Element visibility and locator

  As an user,
  I want to __check all available element__
  In order to ***verify element location***

  @Manual
  @Manual:Passed
  Scenario: Verify all element is visible using automated element locator
    Given User want to login as Mentee
    When User wait until all element loaded
    Then All Home Mentee Page should be visible
