Feature: Search Feature
  This feature is to check others function besides Live, Movies and Indie

  @Search,@Staging
  Scenario: Checking all element in search page
    Given I Go to search page
    Then  I verify all element on Search page

  @Search,@Staging
  Scenario: Checking search functionality
    Given I Go to search page
    And   I do functionality search for movies or series
    And   I clear search history
    Then  Recent search shold be empty