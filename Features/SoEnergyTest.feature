Feature: This feature file is to validate test steps for the SoEnergy take home test

  @test
  Scenario: Automate the test steps given in take home test
    Given I am on home page for the test page
    And I hover Dresses tab and click SummerDresses
    And I change the view of the products to List view
    And I add the product to the cart
    Then I proceed to checkout
    And Increase the quantity to two dresses
    Then I login using my account
    And Confirm address and confirm shipping
    Then I print name of product and the price
