
Feature: fbloginwithdifferentnames

  Scenario Outline: user intialize fb in chrome browser
    Given user enters"<username>" and "<password>"
    
    And  user clicks the login button
     And  user closes the driver

    Examples: 
      | username  | password |
      | venkat |     54231 | 
      | raj |     7 |
