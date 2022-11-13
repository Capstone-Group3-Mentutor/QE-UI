@class-management
Feature: Edit Class Functionality

  Background: User already on add class page
    Given User want to login as Admin
    And User click nav option Class on Admin Page

  Scenario: Verify edit class field is enable
    Given Admin already click kebab button on Kelas Testing
    And Admin choose edit button
    When Admin click edit class name field
    Then Edit class field can be clicked

  Scenario: Verify status class field is enable
    Given Admin already click kebab button on Kelas Testing
    And Admin choose edit button
    When Admin click status class field
    Then Edit class field is selected

  Scenario: Verify update class status to non_active
    Given Admin already click kebab button on Kelas Testing
    And Admin choose edit button
    When Admin select class status non_active
    And Admin click submit button
    And Admin click OK on modal success Edit
    Then Class Status of Kelas Testing is non_active

  Scenario: Verify update class status to active
    Given Admin already click kebab button on Kelas Testing
    And Admin choose edit button
    When Admin select class status active
    And Admin click submit button
    And Admin click OK on modal success Edit
    Then Class Status of Kelas Testing is active

  Scenario: Verify X button is enable
    Given Admin already click kebab button on Kelas Testing
    And Admin choose edit button
    When Admin click x button
    Then Admin go back to add class page

  Scenario: Input Numeric on edit class field
    Given Admin already click kebab button on Kelas Testing
    And Admin choose edit button
    When Admin input 123345 on edit class field
    Then 123345 Class is created

  Scenario: Input Special Character on edit class field
    Given Admin already click kebab button on Kelas Testing
    And Admin choose edit button
    When Admin input !#$%^ on edit class field
    Then !#$%^ Class is not created

  Scenario: Input Alphabet on edit class field
    Given Admin already click kebab button on Kelas Testing
    And Admin choose edit button
    When Admin input Valid Classname Edited on edit class field
    Then Valid Classname Edited Class is created
