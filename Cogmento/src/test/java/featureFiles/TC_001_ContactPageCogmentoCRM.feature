Feature: Test Cogmento CRM UI Automation Test Cases

  Scenario: Validate login functionality
    Given user open application in "chrome" browser
    When user enter valid username and password
    Then user click on login button

  Scenario: validate Home Page functionality
    Then validate home page logo
    And validate home page header

  Scenario: validate Create Contact and Delete Contact functionality
    When user click on contact link
    Then verify user on contact page
    Then user click on create button
    And user enter first name and last name and email
    And user enter description and select status
    And user enter address and city and country and pincode
    And user click on save button
    And user click on delete button and confirm delete button

  Scenario: validate logout functionality
    When user click on profile icon
    And user click on logout button
