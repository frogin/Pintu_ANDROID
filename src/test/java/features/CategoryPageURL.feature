Feature: CategoryPageURL Feature
  This feature is to check functionality of CategoryPageURL

  @CategoryPageURL
  Scenario: Check the selected category on the watch now page without tag
    Given I click category page URL without tag
    Then I see the watch now page with the selected category

  @CategoryPageURL
  Scenario: Check the selected category on the watch now page
    Given I click category page URL with tag now
    Then I see the watch now page with the selected category

  @CategoryPageURL
  Scenario: Check the selected category on the scheduled page
    Given I click category page URL with tag upcoming
    Then I see the scheduled page with the selected category