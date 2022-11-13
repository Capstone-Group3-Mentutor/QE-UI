@mentee-forum
Feature: Mentor post a comment

  Background: User already login as Mentor
    Given User want to login as Mentee
    And User click nav option Forum on Mentee Page

  Scenario: Verify create new comments
    When Mentee create a comment "Kudo's For You"
    Then Comment Kudo's for you created