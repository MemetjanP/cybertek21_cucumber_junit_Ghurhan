
Feature: Wikipedia search functionality verification

  Scenario: Title verification
    Given User is on the wikipedia home page
    When User searches "Steve Jobs" in the wikipedia search box
    Then User clicks the search button
    Then User see "Steve Jobs" in the wiki title


  Scenario: Header verification
    Given User is on the wikipedia home page
    When User searches "Steve Jobs" in the wikipedia search box
    Then User clicks the search button
    Then User see "Steve Jobs" in the main header


  Scenario: Image header verification
    Given User is on the wikipedia home page
    When User searches "Steve Jobs" in the wikipedia search box
    Then User clicks the search button
    Then User see "Steve Jobs" in the image header


  @scenarioOutline
  Scenario Outline: Wikipedia search header verification
    Given User is on the wikipedia home page
    When User searches "<searchValue>" in the wikipedia search box
    Then User clicks the search button
    Then User see "<expectedMainHeader>" in the main header
    Then User see "<ExpectedTitle>" in the wiki title

    Examples: search terms we are going to search in the wikipedia
      | searchValue       | expectedMainHeader | ExpectedTitle     |
      | Mile Pompeo       | Mile Pompeo        | Mile Pompeo       |
      | Tom Cruise        | Tom Cruise         | Tom Cruise        |
      | Memetjan Peyzulla | Memetjan Peyzulla  | Memetjan Peyzulla |
      | Bill Gates        | SBill Gates        | Bill Gates        |
