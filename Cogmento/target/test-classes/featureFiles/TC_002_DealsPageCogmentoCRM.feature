Feature: Test Cogmento CRM UI Automation Test Cases

  Scenario: Validate login functionality
    Given user open application in "chrome" browser
    When user enter valid username and password
    Then user click on login button

  Scenario: validate Home Page functionality
    Then validate home page logo
    And validate home page header

  Scenario: validate Create deals and Delete deals functionality
    When user click on deals link
    Then verify user on deals page
    Then user click on create button in deals page
    And user enter title in deals page
    And user enter description in deals page
    And user click on save button in deals page
    And user click on delete button and confirm delete button in deals  page

  Scenario: validate logout functionality
    When user click on profile icon
    And user click on logout button
