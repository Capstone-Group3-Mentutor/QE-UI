@review-task
Feature: Mentor Review Task Submitted by Mentee

  Background: User already on task reviewing modal
    Given User already login as Mentor
    And User already on task page

  @Manual
  @Manual:Passed
  Scenario: Verify reviewing a task and gave valid score
    When User give score between 1-100
    Then Score saved
    And New score shown

  @Manual
  @Manual:Passed
  Scenario: Verify reviewing a task and gave valid score
    When User give score between out of range 1-100
    Then Message Please input score 1-100 appeared
    And Score not saved