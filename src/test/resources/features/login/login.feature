Feature: User login

  As an user,
  I want to __Login to App__
  In order to ***Use the App***

  Scenario Outline: Login with valid credentials
    Given User already on Login Page
    When User want to login as <role>
    Then User logged in as <role>

    Examples:
      | role   |
      | Admin  |
      | Mentor |
      | Mentee |

