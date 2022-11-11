@edit-user-by-mentee
Feature: Submit Button

  Background: User already open edit user modal
    Given User want to login as EditMentee
    And User click nav option Profile on Mentee Page
    And User click edit user icon

  Scenario: Verify Submit button when edit with valid data
    When Mentee edit user with valid data
    Then Message success update profile appeared
    And User edited

  Scenario: Verify Submit button when edit with invalid data
    When Mentee edit user with invalid data
    Then Message Please enter an email address. appeared


