@edit-user-by-mentee
Feature: Edit User’s Profile by Mentee's Page Title

  @Manual
  @Manual:Passed
  Scenario: Verify Page Title location on Edit User's Profile by Mentee
    Given User already login as Mentee
    And User Edit Mentee Profile
    When Page is completed loaded
    Then Page Title should located at top left of the Page
  @Manual
  @Manual:Passed
  Scenario: Verify Page Title has biggest font on Edit User's Profile by Mentee
    Given User already login as Mentee
    And User Edit Mentee Profile
    When Page is completed loaded
    Then Page Title should have biggest font on the page