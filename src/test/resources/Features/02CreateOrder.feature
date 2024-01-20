Feature: Client User Creates an Order
  Testing Order Creation

 Background: Creating Order by Selecting from Dashboard
    Given Back to Home Page
    When Client Dashboard items are loaded
    Then Client choose to Create Order from Dashboard

  Scenario: Client Fills Order Creation Data - Invalid Data
    Given Residential Order Type is selected
    When client selects it Branch
    And Transaction type is selected
    And Loan type is selected
    And Loan number is provided "Loan123"
    And Borrower Information added "testBorrower", "borrower11yopmail.com"
    And Property Type is chosen
    And Property Address Details are Provided as "9900 Westheimer rd", "karachi", "Texas", "000"
    And Product is chosen
    And select any Supporting Document
    Then client selects Continue Button


  Scenario: Client Fills Order Creation Data - Correct Data
    Given Residential Order Type is selected
    When client selects it Branch
    And Transaction type is selected
    And Loan type is selected
    And Loan number is provided "VAL1234567"
    And Borrower Information added "testBorrower", "borrower11@yopmail.com"
    And Property Type is chosen
    And Property Address Details are Provided as "9900 Westheimer rd", "Houston", "Texas", "77042"
    And Product is chosen
    And select any Supporting Document
    Then client selects Continue Button
    And client makes Payment
    And Order Confirmation is made
    And Order is Created and Viewed
    And User logs Out