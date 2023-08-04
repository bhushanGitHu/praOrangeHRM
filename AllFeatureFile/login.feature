Feature: Test the Orange HRM application

  Scenario: Test Login page functionality
    Given User is on login page
    When user enter firstname and last name
    Then click on login button

  Scenario: Test Home Page functionality
    Then user validate Title
    And validate url
    And validate Logo
