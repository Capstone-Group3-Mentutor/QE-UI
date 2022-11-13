@mentee-profile
Feature: Mentee Profile Page's Edit Button

  @Manual
  @Manual:Passed
  Scenario: Verify Edit Button location
    Given User already login as Mentee
    And User Click Mentee Profile Page
    When User on Mentee Profile Page
    Then Location should be in line with Name