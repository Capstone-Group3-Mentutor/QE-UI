@admin-home
Feature: Modal of Edit Users by Admin

  Background: User already open edit user modal
    Given User want to login as Admin
    When User click Kebab Button
    And User click Edit Button

  Scenario: Verify Modal Edit Element visibility
    Then Edit User modal appeared
    And User can see Modal Edit User element
@need-fix
  Scenario: Input alphabet on Name field
    Then Edit User modal appeared
    When User input Valid Name on Name FIeld
    Then Valid Name should be inputted
@need-fix
  Scenario: Input numeric on Name field
    Then Edit User modal appeared
    When User input 123456 on Name FIeld
    Then Numeric should be inputted

  Scenario: Input special character on Name field
    Then Edit User modal appeared
    And User input $%^&* on Name FIeld
    And $%^&* shouldn't be inputted
@need-fix
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
@rerun @sapu-jagat
  Scenario: Verify Dropdown Content functionality
    And Edit User modal appeared
    When User select class Front end
    Then Front end class should be selected