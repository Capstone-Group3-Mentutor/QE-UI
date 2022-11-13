@task-submission
Feature: Task Submission Page Title

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