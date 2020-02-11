

Feature: Adactin room booking

  
  Scenario: hotel room booking in adactin website
    Given user enter login details (user name and password)
    When user clicks the login buttton
    When user is selecting his location
    And user is choosng his hotel
    And user choosing the room type
    Then user selecting the no of rooms
    And user selecting adults per room
    And user selecting childrens per room
    Then user clicks the search button
		And user clicks the radio button(selects)
		Then user clicks continue
		And user provides first and last name
		
  	And user provides billing address
  	And user gives credit card no
  	And user choose credit card type
  	And userprovides expiry dates
  	Then user provides cvv number
  	And user clicks the book button