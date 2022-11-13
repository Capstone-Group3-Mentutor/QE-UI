@edit-user-by-mentee
Feature: Mentor Profile Page's Edit Button

  @Manual
  @Manual:Passed
  Scenario: Verify Edit Button location
    Given User already login as Mentor
    And User Click Mentor Profile Page
    When User on Mentor Profile Page
    Then Location should be in line with Name