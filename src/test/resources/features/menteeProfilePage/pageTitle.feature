@mentee-profile
Feature: Mentee Profile Page Page Title

  @Manual
  @Manual:Passed
  Scenario: Verify Page Title location on Tasks Submission Modal
    Given User already login as Mentee
    And User want to submit task
    When Page is completed loaded
    Then Page Title should located at top left of the Page

  @Manual
  @Manual:Passed
  Scenario: Verify Page Title has biggest font on Tasks Submission Modal
    Given User already login as Mentee
    And User want to submit task
    When Page is completed loaded
    Then Page Title should have biggest font on the page

  @Manual
  @Manual:Passed
  Scenario: Verify Page Title location on Mentee Profile Page
    Given User already login as Mentee
    And User Click Mentee Profile Page
    When Page is completed loaded
    Then Page Title should located at top left of the Page

  @Manual
  @Manual:Passed
  Scenario: Verify Page Title has biggest font on Mentee Profile Page
    Given User already login as Mentee
    And User Click Mentee Profile Page
    When Page is completed loaded
    Then Page Title should have biggest font on the page