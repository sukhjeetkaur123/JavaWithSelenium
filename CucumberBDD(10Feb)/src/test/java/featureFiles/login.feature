
Feature: chechking login functionality of application


#
 #Scenario: chech the login functionality with valid credentails
 #
  #Given user is on login page
  #Then user enter the username into username field
  #Then user enter the password into password field
  #Then user click on login button
  #Then user is on home page
  #Then user click to logout button
 #
 #@SmokeTests
 #Scenario Outline: chech the login functionality with valid credentails
 #
  #Given user is on login page
  #Then User enter the "<userName>" into username field and "<password>" into password field
  #Then user click on login button
  #Then user is on home page
  #
  #Examples:
      #|userName|password|
      #|admin   |qwee    |
      #|Admin   |admin123|
      #
      
  Scenario: chech the login functionality with valid credentails
 
  Given user is on login page
  When enters the username and enters the password
      |admin   |qwee    |
      |Admin   |admin123|
  Then user click on login button
  Then user is on home page
  

    
 
 