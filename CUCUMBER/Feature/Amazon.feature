Feature: amazon app add to cart placing

  @flipkartsearchingaproduct
  Scenario: flipkat searching a product
    Given user intialize flipkart in chrome browser
    When user search for a samsung mobile phone
    And user choosing a product

  @Amazonaddtocart
  Scenario: buying a product in amazon
    Given user intialize amazon in chrome browser
    And user search for a mobile phone
    When user selects a model
    And switching to a new window
    And user add item to the cart
