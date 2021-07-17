Feature: Login Feature
  This feature deals with all login functionality in application

  @Login
  Scenario: Checking login element
    Given I navigate to the Home page
    And I click login button
    Then I should see login form

  @Login
  Scenario: Login with unregistered phone number
    Given I navigate to the Home page
    And I click login button
    And I input wrong phone number
    Then I should see modal alert to register


#  Scenario: Login with correct username and password to fail
#    Given I navigate to the login page
#    And I enter the following for Login
#      | username | password      |
#      | admin    | adminpassword |
#    And I click login button
#    Then I should see the userform page wrongly