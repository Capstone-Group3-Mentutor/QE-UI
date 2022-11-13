@edit-user-by-mentor
Feature: Mentor Profile Page's Page Title

  @Manual
  @Manual:Passed
  Scenario: Verify Page Title location on Mentee Profile Page
    Given User already login as Mentor
    And User Click Mentor Profile Page
    When Page is completed loaded
    Then Page Title should located at top left of the Page

  @Manual
  @Manual:Passed
  Scenario: Verify Page Title has biggest font on Mentee Profile Page
    Given User already login as Mentor
    And User Click Mentor Profile Page
    When Page is completed loaded
    Then Page Title should have biggest font on the page