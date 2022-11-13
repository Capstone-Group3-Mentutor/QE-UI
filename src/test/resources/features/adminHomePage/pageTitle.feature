@admin-home
Feature: Admin Home Page Title

  Scenario: Verify Page Title contains correct message
    Given User want to login as Admin
    When User wait until all element loaded
    Then Admin Home Page Title should be Hello Admin !

  @Manual
  @Manual:Passed
  Scenario: Verify Page Title location
    When Page is completed loaded
    Then Page Title should located at top left of the Page