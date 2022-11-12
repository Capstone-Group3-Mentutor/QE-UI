@home-mentor
Feature: Mentor Home Page Menu Navigation

  Background: User already login as Mentor
    Given User want to login as Mentor

  Scenario: Verify Mentor Home Page Menu Navigation and option visibility
    When User wait until all element loaded
    Then All menu of Mentor home page is displayed

  Scenario: Verify Mentor Home Page Menu Navigation and option functionality
    When User click nav option Task on Mentor Home Page
    Then User redirected to Mentor page Task
    When User click nav option Forum on Mentor Home Page
    Then User redirected to Mentor page Forum
    When User click nav option Profile on Mentor Home Page
    Then User redirected to Mentor page Profile
    When User click nav option Home on Mentor Home Page
    Then User redirected to Mentor page Home