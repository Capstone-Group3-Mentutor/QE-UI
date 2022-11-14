@register
Feature: Register New Member

  As an Admin
  I want to __Register New Member__
  In order to **Create New User Credentials**

  Background: User already login as Admin
    Given User want to login as Admin
    And User click nav option Member on Admin Page

  Scenario: Verify register new member with valid data
    When Admin enter valid data for register new user
    Then Registration Success
    And New User is created

  Scenario: Verify register new member with number on field name
    When Admin register new member with Number on name field
    Then Message Fullname must contain one uppercase appeared

  Scenario: Verify register new member with special character on field name
    When Admin register new member with special character on name field
    Then Message Fullname must contain one uppercase appeared

  Scenario: Verify register new member with less than allowed characters ammount on field name
    When Admin register new member with less than character allowed ammount on name field
    Then Message Fullname is too short appeared

  Scenario: Verify register new member with more than allowed characters ammount on field name
    When Admin register new member with more than character allowed ammount on name field
    Then Message Fullname is too long appeared

  Scenario: Verify register new member with blank on field name
    When Admin register new member with blank on name field
    Then Message Fullname is required appeared

  @Manual
  @Manual:Passed
  Scenario: Verify register new member with Accented Char on field name
    When Admin register new member with Accented Chars on name field
    Then Input is accepted

  Scenario: Verify register new member with Common Delimiter on field name
    When Admin register new member with Common Delimiter on name field
    Then Message Not Allowed Fullname Format appeared

  Scenario: Verify register new member with Single Space on field name
    When Admin register new member with Single Space on name field
    Then Registration Success
    And New User is created

  Scenario: Verify register new member with Multiple Space on field name
    When Admin register new member with Multiple Space on name field
    Then Registration Success
    And New User with multiple space is created

  Scenario: Verify register new member with Leading Space on field name
    When Admin register new member with Leading Space on name field
    Then Message Not allowed name format appeared

  Scenario: Verify register new member with End-of-Line Characters(^M) on field name
    When Admin register new member with End-of-Line Character on name field
    Then Message Not allowed name format appeared

  Scenario: Verify register new member with Copy-Paste on field name
    When Admin register new member with Copy-Paste on name field
    Then Registration Success
    And New User is created

  Scenario: Verify register new member with Emoji on field name
    When Admin register new member with Emoji on name field
    Then Message Not allowed format appeared

  Scenario: Verify if name field is case sensitive
    When Admin register new member with all lowercased Name
    Then Message Fullname must contain one uppercase appeared

  Scenario: Verify default name field placeholder
    When Admin check name field placeholder
    Then The Placeholder should be Full name

  Scenario: Verify register new member with valid email format
    When Admin register new member with allowed email format
    Then Registration Success
    And New User with new email is created

  Scenario: Verify register new member with already registered email
    When Admin register new member with already registered email
    Then Message Invalid Input From Client appeared

  Scenario: Verify register new member with invalid email format
    When Admin register new member with not allowed email format
    Then Message Email is invalid appeared

  Scenario: Verify email field is case sensitive
    When Admin register new member with all uppercased email
    Then Registration Success
    And New User with new email is created

  Scenario: Verify register new member with special character on field email
    When Admin register new member with special character on email field
    Then Message Email is invalid appeared

  Scenario: Verify register new member with less than allowed characters ammount on field email
    When Admin register new member with less than character allowed ammount on email field
    Then Message Email must be at least 6 characters appeared

  Scenario: Verify register new member with more than allowed characters ammount on field email
    When Admin register new member with more than character allowed ammount on email field
    Then Message Email must not exceed 30 characters appeared

  Scenario: Verify register new member with blank on field email
    When Admin register new member with blank on email field
    Then Message Email is required appeared

  Scenario: Verify email is unique value
    When Admin register new member with already registered email
    Then Message Email already registered appeared

  Scenario: Verify if email field is interactable
    When Admin click Email Field
    Then The Cursor is on Email Field

  Scenario: Verify default email field placeholder
    When Admin check email field placeholder
    Then Email Placeholder should be example@gmail.com

  Scenario: Verify if Role field is interactable
    When Admin click Role Field
    Then The role field shows options

  @Manual
  @Manual:Passed
  Scenario: Verify if Role field can not be typed directly
    When Admin send keys to role field
    Then The input is rejected

  Scenario: Verify if Role is mandatory
    When Admin did not select role when registering new users
    Then Message Data cannot be empty ! appeared

  Scenario: Verify if selected role is correct
    When Admin select role as mentor
    Then mentor role is selected

  Scenario: Verify Role placeholder
    When Admin check role field placeholder
    Then Role Placeholder should be Choose a role

  Scenario: Verify if Class field is interactable
    When Admin click Class Field
    Then The Class field shows options

  Scenario: Verify if Class field can not be typed directly
    When Admin send keys to Class field
    Then The input to Class field is rejected

  Scenario: Verify if Class is mandatory
    When Admin did not select Class when registering new users
    Then Message Invalid Input From Client appeared

  @Manual
  @Manual:Passed
  Scenario: Verify if just one Class can be selected
    When Admin select more than one Class
    Then The last Class selected is active

  Scenario: Verify if selected Class is correct
    When Admin select Class as Front end
    Then The Front end Class is selected

  Scenario: Verify Class placeholder
    When Admin check Class field placeholder
    Then Class Placeholder should be Choose a class

  Scenario: Verify register new member with valid password format
    When Admin register new member with valid format on password field
    Then Registration Success
    And New User is created

  Scenario: Verify register new member with less than allowed characters ammount on field password
    When Admin register new member with less than 8 characters on password field
    Then Message Password must be at least 8 characters appeared

  Scenario: Verify register new member with more than allowed characters ammount on field password
    When Admin register new member with more than 30 characters on password field
    Then Message Password must not exceed 30 characters appeared

  Scenario: Verify register new member with blank on field password
    When Admin register new member with blank on password field
    Then Message Password is required appeared

  @Manual
  @Manual:Failed
  Scenario: Verify register new member with Copy-Paste on field password
    When Admin register new member with copy-paste on password field
    Then Message Password must contain one number appeared

  Scenario: Verify register new member with Emoji on field password
    When Admin register new member with Emoji on password field
    Then Message Password must contain one uppercase appeared

  Scenario: Verify default password field placeholder
    When Admin check password field placeholder
    Then Password Placeholder should be ********

  Scenario: Verify register new member without uppercase on field password
    When Admin register new member without uppercase on password field
    Then Message Password must contain one uppercase appeared

  Scenario: Verify register new member without numeric on field password
    When Admin register new member without number on password field
    Then Message Password must contain one number appeared

  Scenario: Verify register new member without special char on field password
    When Admin register new member without special char on password field
    Then Message Password must contain one special character appeared

  @Manual
  @Manual:Failed
  Scenario: Verify password is masked when eye icon is not clicked
    When Tester type Admin123$ in password field
    But The eye icon is not clicked
    Then The password is masked

  @Manual
  @Manual:Failed
  Scenario: Verify password is masked when eye icon is clicked
    When Tester type Admin123$ in password field
    And The eye icon is clicked
    Then The password is not masked

  Scenario: Verify account button label
    When Tester check Add button
    Then The button label should be Add

  Scenario: Verify pop up message when successfully register new users
    When Admin enter valid data for register new user
    Then Message Register Success appeared

  Scenario: Verify pop up message when failed register new users
    When Admin register new user with invalid data
    Then Message Register Success not shown

  Scenario: Verify navigation trough field using TAB and SHIFT+TAB
    When Uer click Register Name field
    And User press TAB button
    Then The cursor is at Register Email field
    When User press SHIFT+TAB button
    Then The cursor is at Register Name field

  Scenario: Verify submit registration with ENTER
    When Admin register new user with valid data but admin doesnt click Login Button
    And User press ENTER button
    Then New User is created
