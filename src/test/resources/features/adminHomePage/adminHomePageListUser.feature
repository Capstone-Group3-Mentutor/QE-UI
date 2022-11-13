@admin-home
Feature: Admin Home Page List User

  Background: User already login as Admin
    Given User want to login as Admin

  Scenario: Verify List User visibility when there is list users
    When User on Admin home
    Then User can see List User with detailed user profile

  Scenario: Verify List User visibility when there is no list users
    When User on Admin home
    But There is no list users
    Then Message There is no list user appeared

  Scenario: Verify List User Title visibility
    When User on Admin home
    Then User can see Task Bar title is List Mentor / Mentee

  Scenario: Verify List User Content visibility
    When There is list user
    Then User can see List of users

  Scenario: Verify Kebab Button visibility
    When There is list user
    Then User can see Kebab Button

  Scenario: Verify Kebab Button functionality
    When There is list user
    And User click Kebab Button
    Then Options displayed

  Scenario: Verify Delete Button functionality
    When User click Kebab Button
    And User click Delete Button
    Then Message Are you sure? appeared

  Scenario: Verify Cancel Delete User functionality
    When User click Delete Button
    And User click cancel
    Then User redirected to Admin page Home

  Scenario: Verify Delete User functionality
    When User click Delete Button
    And User click Yes, delete!
    Then Message User Successfully Deleted appeared

    Scenario: Verify Edit User functionality
      When User click Kebab Button
      And User click Edit Button
      Then Edit User modal appeared

    @Manual
    @Manual:Passed
    Scenario: Verify Scroll bar visibility
      When There is more than one list users
      Then Scrollbar appear
