Feature: Client User Creates an Order
  Testing Order Creation

  Background: Test for Successful Login
    Given user goes to URL
    When user enters username "avclienthb2"
    And user enters password "dev.1234"
    Then open Client Dashboard

  Scenario: Select Order Type from Dashboard and Create Order
    Given Client Dashboard items are loaded
    And Client clicks login button from Dashboard
    When Select Residential as Order Type
    And client selects its branch
    And client selects transaction type




