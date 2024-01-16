Feature: Client User Creates an Order
  Testing Order Creation

#  Background: Test for Successful Login
#    Given user goes to URL
#    When user enters username "avclienthb2"
#    And user enters password "dev.1234"
#    Then open Client Dashboard

  Scenario: Select Order Type from Dashboard and Create Order
    Given Client Dashboard items are loaded
    And Client clicks login button from Dashboard
    When Select Residential as Order Type
    And client selects its branch
    And client selects transaction type
    And client selects loan Type
    And client enters loan Number "VAL78549439"
    And Client provides Borrower Info "testBorrower", "borrower11@yopmail.com"
    And Client selects PropertyType
    And Client Enters Complete Property Address "9900 Westheimer rd", "Houston", "Texas", "77042"
    And Client selects the Product
    And Client appends its comment with the default message "Test Appended text"
    And Select any Supporting Document
    And Client selects Continue Button
    And clients selects Payment Method
    And Client confirms Order Creation
    Then Get Client Order Number
    And User logs Out



