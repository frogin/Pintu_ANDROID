Feature: FollowingLabel Feature
  This feature is to check functionality of Following Label

  @FollowingLabel
  Scenario: User able to see following label on the live event card
    Given I open watch now page
    And Follow one of the performers
    When I see that performer live event card
    Then Following label displayed

  @FollowingLabel
  Scenario: User able to see following label on the upcoming event card
    Given I open scheduled page
    And Follow one of the performers
    When I see that performer upcoming event card
    Then Following label displayed