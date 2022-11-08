@mentee-home
Feature: Element visibility and locator

  As an user,
  I want to __check all available element__
  In order to ***verify element location***

  Background: User already login as Mentee
    Given User want to login as Mentee

    Scenario: Verify all element is visible using automated element locator
      When User wait until all element loaded
      Then All Home Mentee Page should be visible
