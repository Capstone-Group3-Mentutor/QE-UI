@mentee-task
Feature: Mentee Task Page Task Bar

  Background: User already in Mentee Task Page
    Given User want to login as Mentee
    And User click nav option Task on Mentee Page

  @Manual
  @Manual:Passed
  Scenario: Verify Task Bar visibility when there is mentee due task
    When There is due task
    Then User can see Task Bar with detailed task

  @Manual
  @Manual:Failed
  Scenario: Verify Task Bar visibility when there is no mentee due task
    But There is no due task
    Then Message There is no due task(s) appeared

  Scenario: Verify Task Bar Title visibility
    When User wait until all element loaded
    Then User can see Task Bar title is Your Task

  Scenario: Verify Task Title visibility
    When There is due task
    Then User can see Task title

  Scenario: Verify Task description visibility
    When There is due task
    Then User can see Task order

  Scenario: Verify Due Date visibility
    When There is due task
    Then User can see due date

  @Manual
  @Manual:Passed
  @TryAutomated
  Scenario: Verify Task file visibility
    When There is due task
    Then User can see Task File

  @Manual
  @Manual:Passed
  Scenario: Verify Task file redirect functionality
    When User can see Task File
    And User click that task file
    Then User downloaded the task file

  @Manual
  @Manual:Passed
  Scenario: Verify Score visibility when reviewed
    When Task already scored
    Then User can see score not 0

  @Manual
  @Manual:Passed
  Scenario: Verify Score visibility when not reviewed
    When Task not scored
    Then User see score 0

  @Manual
  @Manual:Passed
  @TryAutomated
  Scenario: Verify Submit your task visibility
    When There is due task
    Then User can see submit button

  @Manual
  @Manual:Passed
  @TryAutomated
  Scenario: Verify Submit your task functionality
    When User can see Task File
    And User click submit your task file
    Then User navigate to submit task modal

  @Manual
  @Manual:Passed
  Scenario: Verify user upload valid file format
    When user click task file
    And User upload valid file
    Then Upload successful

  @Manual
  @Manual:Passed
  Scenario: Verify user upload invalid file format
    When user click task file
    And User upload invalid file
    Then Upload unsuccessful

  @Manual
  @Manual:Passed
  Scenario: Verify Task Bar Title font size
    Given User already login as Mentee
    And User navigate to Task Page
    When User on Mentee Task
    Then User can see Task Bar title is bigger than task title

  @Manual
  @Manual:Passed
  Scenario: Verify Task Title Font size and location
    Given User already login as Mentee
    And User navigate to Task Page
    When there is due task
    Then user can see task title on the task bar
    And Font size is biggest on task detail bar

  @Manual
  @Manual:Passed
  Scenario: Verify Task description Font size and location
    Given User already login as Mentee
    And User navigate to Task Page
    When there is due task
    Then user can see task description under task title
    And Font size is smaller than task title

  @Manual
  @Manual:Passed
  Scenario: Verify Due date Font config and location
    Given User already login as Mentee
    And User navigate to Task Page
    When there is due task
    Then user can see due date under task title
    And Font size is smaller than task title
    And text colored different than title

  @Manual
  @Manual:Passed
  Scenario: Verify Task file location
    Given User already login as Mentee
    And User navigate to Task Page
    When There is due task
    Then User can see task file below task description

  @Manual
  @Manual:Passed
  Scenario: Verify Score location
    Given User already login as Mentee
    And User navigate to Task Page
    When There is due task
    Then User can see score below task file