@Etsy
Feature: Etsy title verification

  Background:
    Given User is on the Etsy home page



  Scenario: Title verification
    Then User sees the title as expected


  Scenario: Etsy functionality title verification (without parameterization)
    When User types "Wooden spoon" in the search box
    And User clicks search button
    Then User sees "Wooden spoon" in the title
