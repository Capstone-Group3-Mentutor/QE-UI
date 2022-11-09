@mentee-task
Feature: Element Visibility and Locator

  Scenario: Verify all element is visible using automated element locator on Mentee Page
    Given User want to login as Mentee
    When User wait until all element loaded
    Then All element is loaded and visible on Mentee Task Page
