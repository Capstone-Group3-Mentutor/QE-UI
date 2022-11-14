@mentee-home
Feature: Hero Pics and Message

  @Manual
  @Manual:Passed
  Scenario: Verify Hero Pics and message visibility
    Given User want to login as Mentee
    When User wait until all element loaded
    Then User can see Hero Pics and Message