@mentee-forum
Feature: Mentee create a post

  Background: User already login as Mentor
    Given User want to login as Mentee
    And User click nav option Forum on Mentee Page

  Scenario: Verify create new post with file
    When Mentee create a post "Did you guys know about KNN Method?"
    Then Post "Did you guys know about KNN Method?" created

  Scenario: Verify create new post without file
    When Mentee create a post "Heyy, I created a post without file" without file attachment
    Then Post "Heyy, I created a post without file" created