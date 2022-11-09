@mentee_home
Feature: Mentee Home Page Menu Navigation

  Background: User already login as Mentee
    Given User want to login as Mentee

  Scenario: Verify Mentee Home Page Menu Navigation and option visibility
    When User wait until all element loaded
    Then All menu of mentee home page is displayed

  Scenario: Verify Mentee Home Page Menu Navigation and option functionality
    When User click nav option Task on Mentee Page
    Then User redirected to Mentee page Task
    When User click nav option Forum on Mentee Page
    Then User redirected to Mentee page Forum
    When User click nav option Profile on Mentee Page
    Then User redirected to Mentee page Profile
    When User click nav option Home on Mentee Page
    Then User redirected to Mentee page Home
