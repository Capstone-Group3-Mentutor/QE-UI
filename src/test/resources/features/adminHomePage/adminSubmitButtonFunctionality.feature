@admin-home
Feature: Submit Button Functionality

  Background: User already on edit user modal
    Given User want to login as Admin
    When User click Kebab Button
    And User click Edit Button

  Scenario: Verify user input valid data
    When User can see Modal Edit User element
    And User edit user with valid data
    Then Success Edit User
    And User click Confirm Edit
    And User data edited

  Scenario: Verify user input invalid data
    When User can see Modal Edit User element
    And User edit user with invalid data
    Then Failed Update User
    And User click Confirm Edit
    And User close edit modal
    And User data not edited