
Feature: Facebook login module


  Scenario: login fuctionality chrome browser
    Given user initialize chrome browser
   When user launch facebook app
   Then user enter the username and password
   Then user clicks the login button
   
   