Feature: Login Feature

  Scenario: Successful login with valid credentials
    Given I am on the login page
    When I enter valid UserName
    And I enter valid Password
    And I click on the login button
    #Then I should see the home page
