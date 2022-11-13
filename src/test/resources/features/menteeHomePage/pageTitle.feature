@mentee-home
Feature: Mentee Home Page Title

  Background: User is login as Mentee
    Given User want to login as Mentee

  Scenario: Verify Page Title contains correct message
    When User wait until all element loaded
    Then Then Mentee Home Page Title should be Hello Jangan Dihapus !

  @Manual
  @Manual:Passed
  Scenario: Verify Page Title location
    Given User already login as Mentee
    When Page is completed loaded
    Then Page Title should located at top left of the Page"

  @Manual
  @Manual:Passed
  Scenario: Verify Page Title has biggest font on the page
    Given User already login as Mentee
    When Page is completed loaded
    Then Page Title should have biggest font on the page"

