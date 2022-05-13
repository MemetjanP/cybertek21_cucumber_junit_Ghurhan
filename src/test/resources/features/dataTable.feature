Feature: Simple example of how dataTables work

  @dataTable
  Scenario: User should be able to all 12 months in months dropdown
    Given User is on the dropdown page of practice tool
    Then User should see below info in month dropdown
      | January   |
      | February  |
      | March     |
      | April     |
      | Maay       |
      | June      |
      | July       |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |




  Scenario: User should be able to login with correct credentials
    Given User is on the login page of SmartBear
    When User enters below info
      | username | Tester |
      | password | test   |
    Then User should see title changed to Web Orders



  Scenario: Something happens

    # Given User does something
    Then USER SHOULD SEE BELOW WORDS DISPLAYED
      | apple      |
      | Kiwi       |
      | Orange     |
      | Broccoli   |
      | Watermelon |

       # to organize pipelines ( make it more clean )--> option + command + L



