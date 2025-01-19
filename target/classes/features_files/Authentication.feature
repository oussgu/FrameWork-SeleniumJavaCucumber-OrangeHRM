Feature: Authentication feature
  As a user, I want to login to my account in order to head to home page

  @Authentification
  Scenario: I want to verify the login Page and try to connect to my account with a correct credentials
    Given I connect to the orangeHRM application
    When I enter valid data for the username field "Admin"
    And I enter valid data for the password field "admin123"
    And I click on the login button
    Then I head to the home page "Dashboard"
