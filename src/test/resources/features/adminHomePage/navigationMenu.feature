@home-admin
Feature: Admin Home Page Menu Navigation

  Background: User already login as Mentee
    Given User want to login as Admin

  Scenario: Verify Admin Home Page Menu Navigation and option visibility
    When User wait until all element loaded
    Then All menu of Admin home page is displayed

  Scenario: Verify Admin Home Page Menu Navigation and option functionality
    When User click nav option Input Class on Admin Home Page
    Then User redirected to Admin page Input Class
    When User click nav option Input Member on Admin Home Page
    Then User redirected to Admin page Forum
    When User click nav option Home on Admin Home Page
    Then User redirected to Admin page Home