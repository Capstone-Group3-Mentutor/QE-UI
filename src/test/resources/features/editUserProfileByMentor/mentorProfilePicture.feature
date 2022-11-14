@edit-user-by-mentor
Feature: Mentor Profile Page's Profile Picture

  @Manual
  @Manual:Passed
  Scenario: Verify User Profile picture location
    Given User already login as Mentor
    And User Click Mentor Profile Page
    When User on Mentor Profile Page
    Then User can see user PP under Page Title

  @Manual
  @Manual:Passed
  Scenario: Verify User Profile picture not interactable
    Given User already login as Mentor
    And User Click Mentor Profile Page
    When User on Mentor Profile Page
    And Click profile picture
    Then Nothing happen

  @Manual
  @Manual:Passed
  Scenario: Verify Mentor profile detail location
    Given User already login as Mentor
    And User Click Mentor Profile Page
    When User on Mentor Profile Page
    Then User see Mentor profile detail
