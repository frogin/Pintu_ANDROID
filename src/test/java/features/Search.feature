Feature: Search Feature
  This feature is to check others function besides Live, Movies and Indie

  @Search @Staging
  Scenario: Checking all element in search page
    Given I Go to search page
    Then  I verify all element on Search page

  @Search @Staging
  Scenario: Checking direction for top Streamer
    Given I Go to search page
    Then  I click one of top streamer and verify

  @Search @Staging
  Scenario: Checking top search
    Given I Go to search page
    Then  I click one of top search and verify

  @Search @Staging
  Scenario: Checking all movies,series and indie
    Given I Go to search page
    Then  I explore all movies and verify

  @Search @Staging
  Scenario: Checking some genre
    Given I Go to search page
    Then  I explore all genre and verify

  @Search @Staging
  Scenario: Checking recent search
    Given I Go to search page
    And   I type for "Rumah Kreatif Musikindo"
    And   Recent search should be populated
    Then  I clear search history

  @Search @Staging
  Scenario: Checking search for TOP
    Given I Go to search page
    And   I type for "RKM"
    Then  I should see all result

  @Search @Staging
  Scenario: Checking search for performer
    Given I Go to search page
    And   I type for "Rumah Kreatif Musikindo"
    Then  I should see in Streamer column

  @Search @Staging
  Scenario: Checking search for movies
    Given I Go to search page
    And   I type for "Neysha"
    Then  I should see in Movies column

  @Search @Staging
  Scenario: Verify direction after click streamer should going to their profile
    Given I Go to search page
    And   I type for "Rumah Kreatif Musikindo"
    And   I should see in Streamer column
    Then  I click to open their profile

  @Search @Staging
  Scenario: Verify direction after click movies should going to movie detail
    Given I Go to search page
    And   I type for "Neysha"
    Then  I should see in Movies column
    Then  I click to open movie detail


