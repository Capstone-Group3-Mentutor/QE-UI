@mentor-forum
Feature: Mentor post a comment

  Background: User already login as Mentor
    Given User want to login as Mentor
    And User click nav option Forum on Mentor Home Page

    @Manual
    @Manual:Passed
    Scenario: Verify create new comments
      When Mentor create a comment That is great
      Then Comment That is great created