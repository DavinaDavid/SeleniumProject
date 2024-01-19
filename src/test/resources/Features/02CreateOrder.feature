Feature: Client User Creates an Order
  Testing Order Creation

  Scenario: Creating Order by Selecting from Dashboard
    Given Client Dashboard items are loaded
    When Client choose to Create Order from Dashboard


#  Scenario: Client Fills Order Creation Data - Incomplete and Invalid Data
#    Given Residential Order Type is selected
#    And client selects its branch
#    And client selects transaction type
#    And client selects loan Type
#    And client enters loan Number ""
#    And Client provides Borrower Info "testBorrower", "borrower11"
#    And Client selects PropertyType
#    And Client Enters Complete Property Address "9900 Westheimer rd", "Karachi", "Texas", "12345"
#    And Client selects the Product
#    And Select any Supporting Document
#    And Client selects Continue Button


  Scenario: Client Fills Order Creation Data - Correct Data
    Given Residential Order Type is selected
    When client selects it Branch
    And Transaction and Loan type is selected
    And Loan number is provided "VAL1234567"
    And Borrower Information added "testBorrower", "borrower11@yopmail.com"
    And Property Type is chosen
    And Property Address Details are Provided as "9900 Westheimer rd", "Houston", "Texas", "77042"
    And Product is chosen
    And select any Supporting Document
    And Client selects Continue Button
    Then client makes Payment
    And Order Confirmation is made
    And Order is Created and Viewed
    And User logs Out