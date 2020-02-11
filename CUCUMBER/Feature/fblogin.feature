
Feature: Facebook login module

  
  Scenario: checking facebook login
    Given user intialize chrome browser
    And  user in fb page
    When user enters username
    And user enter invalid password
    And user click submit button
   
 