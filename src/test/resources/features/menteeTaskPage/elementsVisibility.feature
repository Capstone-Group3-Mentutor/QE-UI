@mentee-task @lionelsantiago
Feature: Element Visibility and Locator mentee task

  Scenario: Verify all element is visible using automated element locator on Mentee Page
    Given User want to login as Mentee
    And User click nav option Task on Mentee Page
    When User wait until all element loaded
    Then All element is loaded and visible on Mentee Task Page
