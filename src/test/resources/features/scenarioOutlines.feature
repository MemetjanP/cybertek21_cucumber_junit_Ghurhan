Feature: SmartBear order feature

  Scenario Outline: User is ordering a product from Order page
    Given User is logged into SmartBear Tester account and on Order page
    When User fills out the form as followed from the table below
#    And User selects "<product>" from product dropdown
#    And User enters "<quantity>" to quantity
#    And User enters "<expectedName>" to customer name
#    And User enters "<street>" to street
    And User enters "<city>" to city
    And User enters "<state>" to state
    And User enters "<zip>" to zip
    And User selects "<cardType>" as card type
    And User enters "<card number>" to card number
    And User enters "<expiration date>" to expiration date
    And User clicks process button
    Then User verifies "<actualName>" is in the list



    Examples:

      | product | quantity | expectedName | street | city | state | zip | cardType | card number | expiration date |actualName|