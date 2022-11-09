@mentee-task
Feature: Mentee Task Page Task Bar

  Background: User already in Mentee Task Page
    Given User want to login as Mentee
    And User click nav option Task on Mentee Page

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

  Scenario: Verify Score visibility when reviewed
    When Task already scored
    Then User can see score not 0

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

  Scenario: Verify user upload valid file format
    When user click task file
    And User upload valid file
    Then Upload successful

  Scenario: Verify user upload invalid file format
    When user click task file
    And User upload invalid file
    Then Upload unsuccessful
