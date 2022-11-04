Feature: User Login

  As an user,
  I want to __Login to App__
  In order to ***Use the App***

  Background: User is already open web App and already on login page
    Given User already on Login Page

  Scenario Outline: Verify user login with valid credentials
    When User want to login as <role>
    Then User logged in as <role>

    Examples: Roles
      | role   |
      | Admin  |
      | Mentor |
      | Mentee |

  Scenario: Verify user login with valid email prefixes
    When User want to login with valid email prefixes
      | email            | password   |
      | abc-d@mail.com   | valid_pass |
      | abc.def@mail.com | valid_pass |
      | abc@mail.com     | valid_pass |
      | abc_def@mail.com | valid_pass |
    Then User is logged in
