@mentee-home
Feature: Mentee Home Page Title

  Background: User is login as Mentee
    Given User want to login as Mentee

    Scenario: Verify Page Title contains correct message
      When User wait until all element loaded
      Then Then Mentee Home Page Title should be Hello Jangan Dihapus !