@class-management
Feature: Submit Button Functionality

  Background: USer already on add class page
    Given User want to login as Admin
    And User click nav option Class on Admin Page

  Scenario: Input valid data on edit class field and choose inactive class
    Given Admin already click kebab button on Kelas Testing
    And Admin choose edit button
    When Admin select class status non_active
    And Admin click submit button
    And Admin click OK on modal success Edit
    And Class Status of Kelas Testing is non_active

  Scenario: Input valid data on edit class field and choose active class
    Given Admin already click kebab button on Kelas Testing
    And Admin choose edit button
    When Admin select class status active
    And Admin click submit button
    And Admin click OK on modal success Edit
    Then Class Status of Kelas Testing is active

  Scenario: Input valid data on edit class field and didn't choose status class
    Given Admin already click kebab button on Kelas Testing
    And Admin choose edit button
    And Admin click submit button
    And Admin click OK on modal success Edit
    Then Class Status of Kelas Testing is active

  Scenario: Input "<valid data>" with minimum character allowed on edit class field and choose inactive class
    Given Admin already click kebab button on Kelas Edit
    And Admin choose edit button on Kelas Edited
    When Admin select class status non_active
    And Admin input cl on edit class field
    Then cl Class is created
    And Class Status of Kelas Edit is non_active

  Scenario: Input "<valid data>" with minimum character allowed on edit class field and choose active class
    Given Admin already click kebab button on Kelas Edit
    And Admin choose edit button on Kelas Edited
    When Admin select class status active
    And Admin input cl on edit class field
    Then cl Class is created
    And Class Status of Kelas Edit is active

  Scenario: Input "<valid data>" with minimum character allowed on edit class field and didn't choose status class
    Given Admin already click kebab button on Kelas Edit
    And Admin choose edit button on Kelas Edited
    When Admin input cl on edit class field
    Then cl Class is created
    And Class Status of Kelas Edit is active

  Scenario: Input "<valid data>" with maximum character allowed on edit class field and choose inactive class
    Given Admin already click kebab button on Kelas Edit
    And Admin choose edit button on Kelas Edited
    When Admin select class status non_active
    And Admin input aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa on edit class field
    Then aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa Class is created
    And Class Status of Kelas Edit is non_active

  Scenario: Input "<valid data>" with maximum character allowed on edit class field and choose active class
    Given Admin already click kebab button on Kelas Edit
    And Admin choose edit button on Kelas Edited
    When Admin select class status active
    And Admin input aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa on edit class field
    Then aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa Class is created
    And Class Status of Kelas Edit is active

  Scenario: Input "<valid data>" with maximum character allowed on edit class field and choose active class
    Given Admin already click kebab button on Kelas Edit
    And Admin choose edit button on Kelas Edited
    When Admin input aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa on edit class field
    Then aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa Class is created
    And Class Status of Kelas Edit is active

  Scenario: Input invalid data on edit class field and choose inactive class
    Given Admin already click kebab button on Kelas Edit
    And Admin choose edit button on Kelas Edited
    When Admin select class status non_active
    And Admin input *&^*%(%* on edit class field
    Then *&^*%(%* Class is not created
    And Message Update Failed, Invalid Class Name appeared

  Scenario: Input invalid data on edit class field and choose active class
    Given Admin already click kebab button on Kelas Edit
    And Admin choose edit button on Kelas Edited
    When Admin select class status active
    And Admin input *&^*%(%* on edit class field
    Then *&^*%(%* Class is not created
    And Message Update Failed, Invalid Class Name appeared

  Scenario: Input invalid data on edit class field and didn't choose status class
    Given Admin already click kebab button on Kelas Edit
    And Admin choose edit button on Kelas Edited
    When Admin input *&^*%(%* on edit class field
    Then *&^*%(%* Class is not created
    And Message Update Failed, Invalid Class Name appeared

  Scenario: Input empty data on edit class field and choose inactive class
    Given Admin already click kebab button on Kelas Edit
    And Admin choose edit button on Kelas Edited
    When Admin select class status non_active
    And Admin input "" on edit class field
    Then "" Class is not created
    And Message Update Failed, Invalid Class Name appeared

  Scenario: Input empty data on edit class field and choose active class
    Given Admin already click kebab button on Kelas Edit
    And Admin choose edit button on Kelas Edited
    When Admin select class status active
    And Admin input "" on edit class field
    Then "" Class is not created
    And Message Update Failed, Invalid Class Name appeared

  Scenario: Input empty data on edit class field and didn't choose active class
    Given Admin already click kebab button on Kelas Edit
    And Admin choose edit button on Kelas Edited
    When Admin input "" on edit class field
    Then "" Class is not created
    And Message Update Failed, Invalid Class Name appeared

  Scenario: Input "<valid data>" with valid character allowed on edit class field and choose active class
    Given Admin already click kebab button on Kelas Edit
    And Admin choose edit button on Kelas Edited
    When Admin select class status active
    And Admin input cl on edit class field
    Then cl Class is created
    And Class Status of Kelas Edit is active