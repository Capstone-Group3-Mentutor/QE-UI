@mentor-task
Feature: Mentor create a task

  Background: User already on task page
    Given User want to login as Mentor
    And User click nav option Task on Mentor Home Page

  Scenario: Verify create a task with attachment
    When User create a task "Matematika itu mudah bukan?" with attachment
    Then Task "Matematika itu mudah bukan?" created

  Scenario: Verify create a task without attachment
    When User create a task "Buatlah grafik fungsi 3x + 1!" without attachment
    Then Task "Buatlah grafik fungsi 3x + 1!" created