@mentee-home
Feature: Mentee Home Page Task Bar

  Background: User already login as Mentee
    Given User want to login as Mentee

  Scenario: Verify Task Bar visibility when there is mentee due task
    When There is due task
    Then User can see Task Bar with detailed task

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

  Scenario: Verify Task file visibility
    When There is due task
    Then User can see Task File

  Scenario: Verify Task file redirect functionality
    When User can see Task File
    And User click that task file
    #TODO create step defs
    Then User downloaded the task file

  @Manual
  @Manual:Passed
  @Update
  Scenario: Verify Score visibility when reviewed
    When Task already scored
    Then User can see score not 0

  @Manual
  @Manual:Passed
  @Update
  Scenario: Verify Score visibility when not reviewed
    When Task not scored
    Then User see score 0

  Scenario: Verify Submit your task visibility
    When There is due task
    Then User can see submit button

  Scenario: Verify Submit your task functionality
    When User can see Task File
    And User click submit your task file
    Then User navigate to submit task modal

  @Manual
  @Manual:Passed
  Scenario: Verify Scroll bar visibility
    Given User already login as mentee
    When There is more than one due tasks
    Then Scrollbar appear"

  @Manual
  @Manual:Passed
  Scenario: Verify Task Bar Title font size
    Given User already login as mentee
    When User on Mentee home
    Then User can see Task Bar title is bigger than task title"

  @Manual
  @Manual:Passed
  Scenario: Verify Task Title Font size and location
    Given User already login as mentee
    When there is due task
    Then user can see task title on the task bar
    And Font size is biggest on task detail bar "

  @Manual
  @Manual:Passed
  Scenario: Verify Task description Font size and location
    Given User already login as mentee
    When there is due task
    Then user can see task description under task title
    And Font size is smaller than task title "

  @Manual
  @Manual:Passed
  Scenario: Verify Due date Font config and location
    Given User already login as mentee
    When there is due task
    Then user can see due date under task title
    And Font size is smaller than task title
    And text colored different than title "

  @Manual
  @Manual:Passed
  Scenario: Verify Task file location
    Given User already login as mentee
    When There is due task
    Then User can see task file below task description"

  @Manual
  @Manual:Passed
  Scenario: Verify Score location
    Given User already login as mentee
    When There is due task
    Then User can see score below task file"