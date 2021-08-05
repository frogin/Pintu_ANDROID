Feature: Live Feature
  This feature is to check all functionality in Live tab

  @Live
  Scenario: Checking Live event
    Given I open live event
    And  `I check event detail element
    Then `I ended live should go back to homepage

  @Live
  Scenario: Checking screen clean mode
    Given I open live event
    And  `I check clean mode screen
    Then `I ended live should go back to homepage

  @Live
  Scenario: Checking performer profile
    Given I open live event
    And   I open performer profile to check all element
    And   I tap live event from profile to goback
    Then `I ended live should go back to homepage

  @Live
  Scenario: User play with another live recommendation
    Given I open live event
    Then  I open another live recommendation

  @Live
  Scenario: User tap Hearts and number supposed to be Increase
    Given I open live event
    And   I check Hearts functiionality
    Then `I ended live should go back to homepage

  @Live
  Scenario: User send message to performer
    Given I open live event
    And   I send message to performer
    Then `I ended live should go back to homepage

  @Live
  Scenario: User send shout to performer
    Given I open live event
    And   I send shout to performer
    Then `I ended live should go back to homepage

  @Live
  Scenario: User send gift to performer
    Given I open live event
    And   I send gift to performer
    Then `I ended live should go back to homepage

  @Live
  Scenario: User playing with group public/private
    Given I open Today live event
    Then  I check group functionality

  @Live
  Scenario: User check marketing event from Loket
    Given I open Marketing event
    And   I verify all element on marketing page

  @Live
  Scenario: User check reminder functionality
    Given I Verify reminder function in All section

  @Live
  Scenario: User check Today live event
    Given I open Today live event
    And   I verify all element on today live event page
    And   I open another live recommendation

  @Live
  Scenario: User play live event video from recorded
    Given I open top watched event
    Then  I verify all element on recorded event

