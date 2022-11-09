@class-management
Feature: Add Class by Admin

  As an Admin
  I want to ___Add new class___
  In order to ***Create new class***

  Background: User already on add class page
    Given User want to login as Admin
    And Admin already on add Class Page

    Scenario: Verify class field is enable
      When Admin click class name field
      Then class field can be clicked

    Scenario Outline: Input Alphabet on Add Class Field
      When Admin input "<alphabet>" on add class field
      Then "<alphabet>" should be inputted

      Examples:
        | alphabet |
        | classA        |
        | математика       |
        | 数学      |

    Scenario Outline: Input Numeric on Add Class Field
      When Admin input <numeric> on add class field
      #TODO create stepdefs
      Then "<numeric>" should be inputted

    Examples:
    | numeric |
    | 1 |
    | 12 |
    | 123 |

    Scenario Outline: Input Special Character on Add Class Field
      When Admin input "<special character>" on add class field
      Then "<special character>" shouldn't be inputted

    Examples:
    | special character |
    | ! |
    | !@ |
    | !@# |

    Scenario: Input valid data with minimum character allowed on Add Class Field
      When Admin input less than minimum char allowed on add class field
      Then Data should be rejected
      And Message Class name too few appeared

    Scenario: Input valid data with maximum character allowed on Add Class Field
      When Admin input exceed maximum char allowed on add class field
      Then Data should be rejected
      And Message Class name too long appeared
