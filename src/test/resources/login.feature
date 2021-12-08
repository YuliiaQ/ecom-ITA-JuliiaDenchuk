Feature: As an unregistered user
  I want to log in to the system with my credentials
  So that I can have access to store

  Scenario: Property File check
    Given User is logged in on Login Page

  Scenario:[PARAMS] My Account page is displayed after successful login
    Given Login page is opened in header dropdown
    When I enter in the field 'email' data 'sajowi9588@epeva.com' on Login page
    And I enter in the field 'password' data '123123' on Login page
    And I click 'Login' button on Login page
    Then My Account page is displayed

  Scenario: [ENUM] My Account page is displayed after successful login
    Given Login page is opened in header dropdown
    When I enter in the enum field EMAIL_INPUT_FIELD data 'sajowi9588@epeva.com' on Login page
    And I enter in the enum field PASSWORD_INPUT_FIELD data '123123' on Login page
    And I click SUBMIT_LOGIN_BUTTON enum button on Login page
    Then My Account page is displayed

  Scenario: [DATA TABLE] My Account page is displayed after successful login
    Given Login page is opened in header dropdown
    When I enter text into field on Login Page:
      | inputData            | fieldName |
      | sajowi9588@epeva.com | email     |
      | 123123               | password  |
    And I click 'Login' button on Login page
    Then My Account page is displayed





