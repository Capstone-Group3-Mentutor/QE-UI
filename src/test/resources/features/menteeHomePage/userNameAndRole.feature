@mentee-home
Feature: User's Name and Role

  Background: User already login as admin
    Given User want to login as Mentee

  Scenario: Verify User's name visibility
    When User wait until all element loaded
    Then User's name is visible on the right side of the page
      | User's Name|
      | Jangan dihapus |

  Scenario: Verify User's role visibility
    When User wait until all element loaded
    Then User role is visible under of user name
    | User's Role |
    | Mentee      |

  Scenario: Verify User's profile picture visibility
    When User wait until all element loaded
    Then User's profile picture is displayed