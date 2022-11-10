@admin-home
Feature: Admin Home Page Element Visibility and Locator

    Scenario: Verify all element is visible using automated element locator
      Given User want to login as Admin
      When User wait until all element loaded
      Then All Home Admin Page Element should be visible