@mentor-forum
Feature: View More Comments and Hide Comments

  Background: User already login as Mentor
    Given User want to login as Mentor
    And User click nav option Forum on Mentor Home Page

  Scenario: Verify View All comment functionality
    When User click view All Comments
    Then More comment loaded

  Scenario: Verify Hide All comment functionality
    When User click view Hide Comment
    Then All comment is hidden