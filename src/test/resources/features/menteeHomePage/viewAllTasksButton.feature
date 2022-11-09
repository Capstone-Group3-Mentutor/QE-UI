@mentee-home
Feature: View All Task Button

  Background: User already login as Mentee
    Given User want to login as Mentee

  Scenario: Verify view all task button functionality
    When User click view all task button
    Then  User redirected to Task Page
    And All user available task is shown

  Scenario: Verify navigate to task page by typing directly to browser
    When User go to Task Page by directly typing on browser
    Then  User redirected to Task Page
    And All user available task is shown

  Scenario: Verify view all task button visibility
    When User wait until all element loaded
    Then view all task button is displayed