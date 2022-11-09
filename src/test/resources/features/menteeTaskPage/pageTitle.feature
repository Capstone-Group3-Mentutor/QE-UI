@mentee-task
Feature: Mentee Task Page Title

  Scenario: Verify all element is visible using automated element locator on Mentee Page
    Given User want to login as Mentee
    And User click nav option Task on Mentee Page
    When User wait until all element loaded
    Then Page Title should be Hello Jangan Dihapus !