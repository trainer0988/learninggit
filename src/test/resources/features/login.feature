@smoke
Feature: Login Facebook
  			In order to perform login
  			As a user
  			I have to enter usernam and password
  			
  Background:
    Given user navigate to facebook website
    When user validate the homepage title
  			

  Scenario: Login to the facebook with valid user
    Then user enter "valid" username
    And user enter "valid" password
    And user click on login button
    
    
     Scenario: Login to the facebook with invalid user
    Then user enter "invalid" username
    And user enter "invalid" password
    And user click on login button

