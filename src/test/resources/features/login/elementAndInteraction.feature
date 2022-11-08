Feature: Login Page Element and Interaction

  As a Tester,
  I want to ___inspect all element and interaction on Login Page___
  In order to ***make sure all displayed correctly and working properly***

  Background: User already on Login Page
    Given User already on Login Page

    Scenario: Verify all element visible with automated element inspector
      When User wait until all element loaded
      Then All Login Page element should be visible

    Scenario: Verify all element visibility after reloading with automated element inspector
      When User press REFRESH on Browser
      Then All Login Page element should be visible

    Scenario Outline: Verify email and password field is interactable
      When User click <element> field
      Then The Cursor is on <element> field

      Examples: element field
        | element  |
        | email    |
        | password |

    Scenario Outline: Verify login button and contact admin link is interactable
      When User click <element> field
      Then The element <element> is responding

      Examples: element
        | element            |
        | login button       |
        | contact admin link |

#    Scenario: Verify data inputted was cleaned while page refreshed
#      Given User login as admin but user doesnt click Login Button
#      When User refreshed the browser
#      Then Credentials is cleaned

    Scenario: Verify navigation trough field using TAB and SHIFT+TAB
      When User click email field
      Then The Cursor is on email field
      When User press TAB button
      Then The Cursor is on password field
      When User press SHIFT+TAB button
      Then The Cursor is on email field

    Scenario: Verify submit registration with ENTER
      When User login as admin but user doesnt click Login Button
      And User press ENTER button
      Then User logged in as Admin
      And Message Login Successful ! appeared

    Scenario: Verify expired message when press BACK button
      Given User want to login as Admin
      When User press BACK on Browser
      #TODO create assertion Session expired
      Then Session expired

