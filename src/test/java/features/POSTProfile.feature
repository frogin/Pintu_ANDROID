Feature: PostProfile
  Test POST operation using REST-assured library

  @TestAPI
  Scenario: Verify Post operation for Profile
    Given I Perform POST operation for "/assembly/engine/v4/hello" with body
#    Then I should see the body has name as "Sams"

  Scenario: Verify Post operation for from BDD STYLE
    Given I check with BDDStyle


