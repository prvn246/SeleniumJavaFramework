Feature: Validating Amazon WebPage
@AmazonFeature
  Scenario: Validating the second highest price description
    Given I click on the second highest price TV link
    When I switch to new tab
    Then I verify about this item element exists
