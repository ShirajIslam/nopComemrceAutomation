Feature: Order place feature

  Background:
    Given user is on login page
    When user enters username "test@mail.com"
    And user enters password "1"
    And user clicks on login button

Scenario: Add multiple product to cart
Then user clicks on add product to cart from two products
And go to cart
And products are present in cart

Scenario: Shopping cart title
And go to cart
Then user gets the title of the page
And page title should be "Your store. Shopping Cart"

  Scenario: Applying discount code works
    Then user clicks on add product to cart from two products
    And go to cart
    And products are present in cart
    And Add coupon code
    And Coupon added message is displayed as "Entered coupon code - 123"

    Scenario: Applying Gift card code works
      Then user clicks on add product to cart from two products
      And go to cart
      And products are present in cart
      And add gift card code
      And gift card coupon added message is displayed as "The gift card code was applied"

Scenario: Checkout page title
Then user clicks on add product to cart from two products
And go to cart
And check the checkbox of terms of service
And user clicks on checkout button
Then user gets the title of the page
And page title should be "Your store. Checkout"

Scenario: Confirm order by placing a order
Then user clicks on add product to cart from two products
And go to cart
And check the checkbox of terms of service
And user clicks on checkout button
And user clicks on continue button of billing address
And user clicks on continue button of shipping method
And user clicks on continue button of payment method 
And user clicks on continue button of payment information
And user clicks on confirm button of confirm order
  And  Order confirmed message should be "Your order has been successfully processed!"
 # Scenario: New address mandatory fields adding