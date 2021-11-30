Feature: Profile Feature
  This feature is to check all functionality in performer profile

  @Profile
  Scenario: Verify user able to follow/unfollow
    Given I open performer profile page
    And   Follow performer to check the functionality
    Then  Unfollow performer to check the functionality

  @Profile
  Scenario: Verify user can share performer profile
    Given I open performer profile page
    Then  I share performer profile

  @Profile
  Scenario: Verify if profile don't have upcoming and recorded event
    Given I Go to search page
    And   I type for "Aldo Gunawan"
    And   I should see in Streamer column
    And   I click to open their profile
    Then  I see empty state in Upcoming and Previous event

  @Profile
  Scenario: Verify if profile have many upcoming and recorded event
    Given I Go to search page
    And   I type for "Rumah Kreatif Musikindo"
    And   I should see in Streamer column
    And   I click to open their profile
    Then  I see all upcoming and recorded event