@edit-user-by-mentee
Feature: Edit User’s Profile by Mentee's Profile Picture

  @Manual
  @Manual:Passed
  Scenario: Verify User Profile picture location
    Given User already login as Mentee
    And User Edit Mentee Profile
    When User on Edit Mentee Profile Page
    Then User can see user PP under Page Title

  @Manual
  @Manual:Passed
  Scenario: Verify User Profile picture not interactable
    Given User already login as Mentee
    And User Edit Mentee Profile
    When User on EditMentee Profile Page
    And Click profile picture
    Then Nothing happen

  @Manual
  @Manual:Failed
  Scenario: Verify new profile picture displayed correctyly
    Given User already login as Mentee
    And User Already updated photo picture
    When User on edit profile page
    And New Profile picture updated