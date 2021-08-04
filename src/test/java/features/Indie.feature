Feature: Indie Feature
  This feature is to check all functionality in indie tab

  @Indie
  Scenario: Verify user able to indie movies
    Given I Go to Indie page
    Then  I verify all element and user can watch Indie movie

  @Indie
  Scenario: Verify user can open random indie
    Given I Go to Indie page
    Then  I verify that I can open random Indie movie