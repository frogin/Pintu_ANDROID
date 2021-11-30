Feature: My Account Feature
  This feature is to check all functionality in my account menu


  Scenario: Verify user able to subscribe goplay
    Given I Go to MyAccount page
    Then  I verify user can pay Goplay access

  @Setting @Staging
  Scenario: Verify user can input promo code
    Given I Go to MyAccount page
    Then  I verify user can input promo code

  @Setting @Staging
  Scenario: Verify user can access tokens info
    Given I Go to MyAccount page
    Then  I verify user can access token info