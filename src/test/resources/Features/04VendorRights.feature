Feature: Vendor Logins and Perform Actions
  Testing login functionality of Vendor

  Background: Test for Successful Login of Vendor user
    Given user goes to URL
    When user enters username "bidamc2"
    And user enters password "dev.123"
    Then open Dashboard
    And Search Assigned Order

  Scenario: Admin Search Order and Accepts the Order
    Given Search Assigned Order
    When Vendor Choose to Accept Order