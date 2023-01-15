@datatable
Feature: Login Facebook
  			In order to perform login
  			As a user
  			I have to enter usernam and password

  Scenario: Login to the facebook with valid user
    Given user navigate to facebook website
    When user validate the homepage title
    Then user enetr loginid and password
      | loginid  | password    |
      | Ashutosh | Ashutosh123 |
      | Ankush   | Ankush123   |
    And user click on login button
