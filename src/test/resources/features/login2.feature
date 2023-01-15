Feature: Login Facebook
			In order to perform login
  			As a user
  			I have to enter usernam and password

  Scenario: Login to the facebook with valid user
    When user navigate to facebook website
    When user validate the homepage title
    Then user enter "valid" username
    And user enter "valid" password
    And user click on login button

  Scenario: Login to the facebook with invalid user
    Given user navigate to facebook website
    When user validate the homepage title
    Then user enter "invalid" username
    And user enter "invalid" password
    And user click on login button
