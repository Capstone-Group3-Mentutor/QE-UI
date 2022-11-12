@mentor-forum
Feature: Mentor post a comment

  Background: User already login as Mentor
    Given User want to login as Mentor
    And User click nav option Forum on Mentor Home Page

    Scenario: Verify create new comments
      When Mentor create a comment "That's great"
      Then Comment "That's great" created