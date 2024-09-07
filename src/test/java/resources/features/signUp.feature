Feature: SignUp Feature

  Scenario: Successful Sign Up
    Given I am on the Sign Up page
    When I enter a valid username
    And I enter a valid password
    And I click the Sign Up button
    Then I should be signed up successfully
