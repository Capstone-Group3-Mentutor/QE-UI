@class-management
Feature: Delete Button Functionality

  Background: User already on add class page
    Given User want to login as Admin
    And User click nav option Class on Admin Page
    And User add New Class To be Deleted class

  Scenario: Verify pop up window shown before deleting
    Given Admin already click kebab button on Kelas Delete
    When Admin choose delete button
    Then Pop up delete confirmation appear

  Scenario: Verify Cancel Delete class
    Given Admin already click kebab button on Kelas Delete
    When Admin choose delete button
    Then Pop up delete confirmation appear
    When User click cancel delete
    Then Class New Class To be Deleted is not deleted

  @Manual
  @Manual:Passed
  Scenario: Verify deleting a class
    Given Admin already click kebab button on Kelas Delete
    When Admin choose delete button
    Then Pop up delete confirmation appear
    When User click confirm delete
    Then Class New Class To be Deleted is deleted

