@edit-user-by-mentee
Feature: Edit User’s Profile by Mentee

  Scenario: Verify all element is visible using automated element locator on Mentee Profile Page
    Given User want to login as EditMentee
    And User click nav option Profile on Mentee Page
    When User wait until all element loaded
    Then All element is loaded and visible on Mentee Profile Page