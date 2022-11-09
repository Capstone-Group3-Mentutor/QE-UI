@class-management
Feature: X Button Functionality

  Background: User already on Add Class Page
    Given User want to login as Admin
    And User click nav option Class on Admin Page

  Scenario: Input valid data on edit class field
    Given Admin already click kebab button on Kelas Edit
    And Admin choose edit button
    When Admin input &%&$#^ on edit class field
    And Admin select class status non_active
    And Admin click x button
    Then Class Status of Kelas Edit is active

  Scenario: Input invalid data on edit class field
    Given Admin already click kebab button on Kelas Edit
    And Admin choose edit button
    When Admin input &%&$#^ on edit class field
    And Admin click x button
    Then Class Status of Kelas Edit is active

  Scenario: Input valid data and choose active class
    Given Admin already click kebab button on Kelas Edit
    And Admin choose edit button
    When Admin input Valid Class Name on edit class field
    And Admin select class status active
    And Admin click x button
    Then Class Status of Kelas Edit is active

  Scenario: Input valid data and choose inactive class
    Given Admin already click kebab button on Kelas Edit
    And Admin choose edit button
    When Admin input Valid Class Name on edit class field
    And Admin select class status non_active
    And Admin click x button
    Then Class Status of Kelas Edit is active

  Scenario: Input invalid data and choose active class
    Given Admin already click kebab button on Kelas Edit
    And Admin choose edit button
    When Admin input &%&$#^ on edit class field
    And Admin select class status active
    And Admin click x button
    Then Class Status of Kelas Edit is active

  Scenario: Input invalid data and choose inactive class
    Given Admin already click kebab button on Kelas Edit
    And Admin choose edit button
    When Admin input &%&$#^ on edit class field
    And Admin select class status non_active
    And Admin click x button
    Then Class Status of Kelas Edit is active
