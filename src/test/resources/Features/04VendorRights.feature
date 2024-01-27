Feature: Vendor Logins and Perform Actions
  Testing login functionality of Vendor

  Scenario: Test for Successful Login of Vendor user
    Given user goes to URL
    When user enters UserName "newVendor45"
    And user enters Password "dev.123"
    Then click Login to access user Dashboard

  Scenario: Vendor Search Order and Accepts the Order
    Given user looks for Assigned Order
    And Order is Accepted by Vendor
    Then Vendor sets Inspection for Property Investigation
    And Mark Inspection as done
    And Vendor attaches Appraisal Report
    And User logs Out

    #Admin Complete Further Steps

 Scenario: Admin user re-logins to view Order Activities
    Given user goes to URL
    When user enters UserName "adminuser"
    And user enters Password "dev.123"
    Then click Login to access user Dashboard

  Scenario: Admin Review Vendor Report and Complete Order
    Given Search Client Order
    When Admin Reviews Appraisal Report provided by Vendor
    Then Go Back to View Order Page
    And User logs Out



