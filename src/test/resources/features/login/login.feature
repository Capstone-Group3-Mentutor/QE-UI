Feature: User login

  As an user,
  I want to __Login to App__
  In order to ***Use the App***

  Background: User is already on login page
    Given User already on Login Page

    Scenario Outline: Verify user login with valid registered credentials
      When User want to login as <role>
      Then User logged in as <role>
      And Message Login Successful ! appeared

      Examples:
        | role   |
        | Admin  |
  #      | Mentor |
  #      | Mentee |

    Scenario: Verify user login with unregistered credential
      When User want to login with unregistered Credentials
      Then User cannot login
      And Message An invalid client request appeared

