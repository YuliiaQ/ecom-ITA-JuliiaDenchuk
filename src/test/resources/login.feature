Feature: As an unregistered user
  I want to log in to the system with my credentials
  So that I can have access to store

  Scenario: My Account page is displayed after successful login
    Given Login page is opened in header dropdown
    When I enter email 'sajowi9588@epeva.com' on Login page
    And I enter password '123123' on Login page
    And I click Login button on Login page
    Then My Account page is displayed


