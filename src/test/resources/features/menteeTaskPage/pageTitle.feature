@mentee-task
Feature: Mentee Task Page Title

  Scenario: Verify all element is visible using automated element locator on Mentee Page
    Given User want to login as Mentee
    And User click nav option Task on Mentee Page
    When User wait until all element loaded
    Then Page Title should be Hello Jangan Dihapus !

  @Manual
  @Manual:Passed
  Scenario: Verify Page Title location on Mentee Task Page
    Given User already login as Mentee
    And User navigate to Task Page
    When Page is completed loaded
    Then Page Title should located at top left of the Page

  @Manual
  @Manual:Passed
  Scenario: Verify Page Title has biggest font on Mentee Task Page
    Given User already login as Mentee
    And User navigate to Task Page
    When Page is completed loaded
    Then Page Title should have biggest font on the page

