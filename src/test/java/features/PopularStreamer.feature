Feature: PopularStreamer Feature
  This feature is to check functionality of Popular Streamer

  @PopularStreamer
  Scenario: User able to see and open performer profile page from popular streamer carousel on the watch now page
    Given I open watch now tab
    When I see popular streamer carousel displayed
    And Tap one of the popular streamers
    Then That performer profile page opened

  @PopularStreamer
  Scenario: User able to see and open performer profile page from popular streamer carousel on the scheduled page
    Given I open scheduled tab
    When I see popular streamer carousel displayed
    And Tap one of the popular streamers
    Then That performer profile page opened