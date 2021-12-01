Feature: As a registered user
  I want to add product to Shopping Cart
  So I can buy the product

  Scenario: Successful adding product to Shopping Cart
    Given Login page is opened in header dropdown
    When I enter in the enum field EMAIL_INPUT_FIELD data 'sajowi9588@epeva.com' on Login page
    And I enter in the enum field PASSWORD_INPUT_FIELD data '123123' on Login page
    And I click SUBMIT_LOGIN_BUTTON enum button on Login page
    And I click YOUR_STORE_LINK on Your Store Navbar on My Account Page
    And I click ADD_MACBOOK_TO_SHOPPING_CART_BUTTON button
    Then Message successful adding "Success: You have added MacBook to your shopping cart!" is displayed

