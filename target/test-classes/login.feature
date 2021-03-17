Feature: To Validate the Login function

  Background: 
    Given I am in facebook login page

  Scenario: To validate the Login using invalid credentials
    When I enter invalid username and password
      | username | password |
      | python   | Java     |
      | Gops     | Tinku    |
      | Cheeky   | Bella    |
    And I click login button
    Then I should be displayed with an error message
