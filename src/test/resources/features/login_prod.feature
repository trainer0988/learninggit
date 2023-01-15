@sanity
Feature: Login Facebook
  			In order to perform login
  			As a user
  			I have to enter usernam and password

  Scenario Outline: Login to the facebook with valid user
    Given user navigate to facebook website
    When user validate the homepage title
    Then user enter "<username>" username
    And user enter "<password>" password
    And user enter captch image
    And user click on login button
    
    Examples:
    
    |username | password |
    |valid    | valid    |
    |invalid  | invalid  |
    |valid    | invalid  |
    |invalid  | valid    |
