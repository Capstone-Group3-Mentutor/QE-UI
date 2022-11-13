@mentee-profile
Feature: Mentee Profile Page's Profile Picture

  @Manual
  @Manual:Passed
  Scenario: Verify User Profile picture location
    Given User already login as Mentee
    And User Click Mentee Profile Page
    When User on Mentee Profile Page
    Then User can see user PP under Page Title

  @Manual
  @Manual:Passed
  Scenario: Verify User Profile picture not interactable
    Given User already login as Mentee
    And User Click Mentee Profile Page
    When User on Mentee Profile Page
    And Click profile picture
    Then Nothing happen

  @Manual
  @Manual:Passed
  Scenario: Verify mentee profile detail location
    Given User already login as Mentee
    And User Click Mentee Profile Page
    When User on Mentee Profile Page
    Then User see mentee profile detail
