@login
Feature: Login Page Visual Testing

  @Manual
  @Manual:Passed
  Scenario: Validate all text is visible with proper writing
    Given Tester already on Login Page
    When Tester check All available text
    Then All Text is visible
    And All Text written properly"

  @Manual
  @Manual:Passed
  Scenario: Validate error messages should be displayed properly and in the correct position
    Given Tester already on Login Page
    When Tester check all error message
    Then All error message should displayed properly"

  @Manual
  @Manual:Failed
  Scenario: Verify all error messages should be displayed in same CSS style
    Given Tester already on Login Page
    When Tester check all error message
    Then All error message should displayed with same CSS Style"

  @Manual
  @Manual:Passed
  Scenario: Verify general confirmation messages should be displayed using CSS style either than error message style
    Given Tester already on Login Page
    When Tester login as admin
    Then Login confirmation is displayed different than error message"

  @Manual
  @Manual:Passed
  Scenario: Verify tooltips text should be meaningful
    Given Tester already on Login Page
    When Tester try to login
    Then The tooltips text is clear enough"

  @Manual
  @Manual:Passed
  Scenario: Verify all placeholder is displayed properly and meaningful
    Given Tester already on Login Page
    When Tester try to login
    Then All placeholders is displayed properly
    And All placeholders is meaningful"

  @Manual
  @Manual:Failed
  Scenario: Verify password is masked when eye icon is not clicked
    Given Tester already on Login Page
    When Tester type password in password field
    But The eye icon is not clicked
    Then The password is masked"

  @Manual
  @Manual:Failed
  Scenario: Verify password is masked when eye icon is clicked
    Given Tester already on Login Page
    When Tester type password in password field
    And The eye icon is clicked
    Then The password is masked"

  @Manual
  @Manual:Failed
  Scenario: Verify application crash handling method and should be redirected to error page
    Given Tester already on Login Page
    When the app crash
    Then Page crash handling is displayed"

  @Manual
  @Manual:Passed
  Scenario: Verify all text on page for spelling and grammatical errors
    Given Tester already on Login Page
    When Tester check page spelling and grammatical error
    Then error is on acceptable level"

  @Manual
  @Manual:Passed
  Scenario: Verify all field on the page should be aligned properly
    Given Tester already on Login Page
    When Tester check page alignment
    Then page should aligned properly"

  @Manual
  @Manual:Passed
  Scenario: Verify enough space should be provided between title, email field, password field and login button
    Given Tester already on Login Page
    When Tester check page spaces
    Then page spaces is proper"

  @Manual
  @Manual:Passed
  Scenario: Verify font size, style, and color for headline, description text, labels, infield data, and grid info should be standard as specified in PRD
    Given Tester already on Login Page
    When Tester check page spaces
    Then page spaces is proper"

  @Manual
  @Manual:Passed
  Scenario: Verify upon clicking on the input text field, the mouse arrow pointer should get changed to the cursor
    Given Tester already on Login Page
    When User clicking on input text field
    Then the mouse arrow pointer should get changed to the cursor"

  @Manual
  @Manual:Passed
  Scenario: Check all pages for broken images
    Given User already on Login Page
    When User wait until all element loaded
    Then All Image element should be visible"

  @Manual
  @Manual:Passed
  Scenario: Check all pages for broken links
    Given User already on Login Page
    When User wait until all element loaded
    Then All link not broken"

  @Manual
  @Manual:Passed
  Scenario: Verify Page text is justified correctly
    Given Tester already on Login Page
    When Tester verify all text available
    Then All Text should be justified correctly"


