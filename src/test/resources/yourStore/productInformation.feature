Feature: As a registered user
  I want to open the card with information about product
  So I can read the information abut the product

  Scenario: Successful opening card with information about the product
    Given Login page is opened in header dropdown
    When I enter in the enum field EMAIL_INPUT_FIELD data 'sajowi9588@epeva.com' on Login page
    And I enter in the enum field PASSWORD_INPUT_FIELD data '123123' on Login page
    And I click SUBMIT_LOGIN_BUTTON enum button on Login page
    And I click YOUR_STORE_LINK on Your Store Navbar on My Account Page
    And I click MACBOOK_TITLE_LINK link on product card
    Then Information product card named MACBOOK_CARD_TITLE is opened
