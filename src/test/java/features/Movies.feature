Feature: Movie Feature
  This feature is to check all functionality in Movies and Series tab

  @Movies
  Scenario: Verify user able to play movies with some episode free
    Given I Go to Movies page
    Then  I verify all element and user can watch some episode

  @Movies
  Scenario: Verify user able to play movies with free episode
    Given I Go to Movies page
    Then  I verify all element and user can watch all episode

  @Staging
  Scenario: Verify user able to play movies with free episode Staging
    Given   I Go to Movies page
    Then  I verify all element and user can watch all episode Staging

  @Movies
  Scenario: Verify user not able to play paid movie
    Given I Go to Movies page
    Then  I verify all element and user can't play paid movie

  @Movies
  Scenario: Verify user can Rent Movie
    Given I Go to Movies page
    Then  I verify that I can rent movie

  @Staging
  Scenario: Verify user can Rent Movie Staging
    Given   I Go to Movies page
    Then  I verify that I can rent movie staging

  @Movies
  Scenario: Verify user can open random movie
    Given I Go to Movies page
    Then  I verify that I can open random movie