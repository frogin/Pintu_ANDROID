Feature: SwipeUp Feature
  This feature is to check functionality of swipe up gesture

  @SwipeUp
  Scenario: User able to swipe up on live event
    Given I open live event from watch now page
    When I swipe up on the swipe area
    Then The next event is opened

  @SwipeUp
  Scenario: User able to swipe down on live event
    Given I open live event from watch now page
    When I swipe down on the swipe area
    Then The previous event is opened

  @SwipeUp
  Scenario: User able to swipe up on recorded event
    Given I open recorded event from watch now page
    When I swipe up on the swipe area
    Then Live event is opened after recorded event

  @SwipeUp
  Scenario: User able to swipe up on scheduled event
    Given I open scheduled event from scheduled page
    When I swipe up on the swipe area
    Then Live event is opened after scheduled event

  @SwipeUp
  Scenario: User able to swipe up on live event from performer profile page
    Given I open perfomer profile page from watch now
    And Open live event from that performer
    When I swipe up on the swipe area
    Then Recorded event from that performer is opened

  @SwipeUp
  Scenario: User able to swipe up on scheduled event from performer profile page
    Given I open perfomer profile page from search
    And Open scheduled event from that performer
    When I swipe up on the swipe area
    Then The next recorded event from that performer is opened



