Feature: Google search functionality
  Agile story: As a user , when I am on the google search page, I should
  be able to search whatever i want, and see relevant information

  Background:
    Given User is on google home page


  Scenario: User search title verification
    When User search for apple
    Then User should be able to see apple in  the title


  @googleDataTable
  Scenario: Google homepage footer links verification
    Given User is on google home page
    Then User should see the flowing links
      | Advertising               |
      | Business                  |
      |Carbon neutral since 2007  |
      | How Search Works          |
      | Privacy                   |
      | Terms                     |