@task-submission
Feature: Choose Task File Button

  As a Mentee,
  I want to ___upload file___
  In order to ***submit task given***

  Background: Mentee want to submit a task
    Given User want to login as Admin
    And User want to submit task

  Scenario: Verify submit valid file with Choose Task File Button
    When User Click Choose Task File Button
    And User upload File
    Then File Uploaded

  Scenario: Verify submit valid file with Choose Task File Button
    When User Click Choose Task File Button
    And User upload invalid File
    Then Upload rejected
    And Message Invalid file appeared