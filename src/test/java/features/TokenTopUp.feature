Feature: TokenTopUp Feature
  This feature is to check functionality of Token Top-up

  @TokenTopUp
  Scenario: Verify user able to top-up from homepage
    Given I open token topup bottom sheet from homepage
    Then pay the token

  @TokenTopUp
  Scenario: Verify user able to top-up from profile page
    Given I open token topup bottom sheet from profile page
    Then pay the token

  @TokenTopUp
  Scenario: Verify user able to top-up from live event
    Given I open token topup bottom sheet from live event
    Then pay the token

  @TokenTopUp
  Scenario: Verify user able to top-up from insufficient token alert
    Given I get insufficient token alert
    Then I open token topup bottom sheet from insufficient token alert and pay