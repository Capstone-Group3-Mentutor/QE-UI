@admin-home
Feature: Modal of Edit Users by Admin

  Background: User already open edit user modal
    Given User want to login as Admin
    When User click Kebab Button
    And User click Edit Button

  Scenario: Verify Modal Edit Element visibility
    Then Edit User modal appeared
    And User can see Modal Edit User element

  Scenario: Input alphabet on Name field
    Then Edit User modal appeared
    When User input Valid Name on Name FIeld
    Then Valid Name should be inputted

  Scenario: Input numeric on Name field
    Then Edit User modal appeared
    When User input 123456 on Name FIeld
    Then 123456 should be inputted

  Scenario: Input special character on Name field
    Then Edit User modal appeared
    And User input $%^&* on Name FIeld
    And $%^&* shouldn't be inputted

  Scenario: Input Invalid Email on Email field
    When User input not.an.email Email
    Then Message Please enter valid email address appeared

  Scenario: Input valid Email on Email field
    When User input correct.email@gmail.com Email
    Then Email correct.email@gmail.com inputted

  Scenario: Verify Dropdown Button functionality
    And Edit User modal appeared
    When User click Dropdown Button on Modal
    Then Show dropdown content

  Scenario: Verify Dropdown Content functionality
    And Edit User modal appeared
    When User select class Front End
    Then Front End class should be selected

  @Manual
  @Manual:Passed
  Scenario: Verify Name field is enable
    When User on Modal Edit User
    And User click Name field
    Then Name field can be clicked

  @Manual
  @Manual:Passed
  Scenario: Verify Email field is enable
    When User on Modal Edit User
    And User click Email field
    Then Email field can be clicked

  @Manual
  @Manual:Passed
  Scenario: Verify Password field is enable
    When User on Modal Edit User
    And User click Password field
    Then Password field can be clicked

  @Manual
  @Manual:Passed
  Scenario: Verify Class field is enable
    When User on Modal Edit User
    And User click Class field
    Then Class field can be clicked