#https://tutorialsninja.com/demo/

Feature: Place order

  Scenario: Search single item 
    Given User is on homepage
    When User search an item "Macbook Air"
    Then Item must be listed

  Scenario: Add Item to cart
    Given User should be on Search Result page
    When User add item to cart
    Then Item must be added

  Scenario: Checkout order
    When User do checkout
    Then should navigate to Checkout page
