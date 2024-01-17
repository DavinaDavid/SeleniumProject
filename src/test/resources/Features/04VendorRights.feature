Feature: Vendor Logins and Perform Actions
  Testing login functionality of Vendor

  Scenario: Test for Successful Login of Vendor user
    Given user goes to URL
    When user enters username "bidamc2"
    And user enters password "dev.123"
    Then open Dashboard

  Scenario: Vendor Search Order and Accepts the Order
    Given Search Assigned Order
    And Vendor Choose to Accept Order
    Then Vendor sets Inspection
    And Marked Order as Inspected
    And Vendor submits Appraisal Report
    And User logs Out

    #Admin Complete Further Steps

 Scenario: Test for Successful Login of Admin user
    Given user goes to URL
    When user enters username "amsadmin"
    And user enters password "VLDir@23"
    Then open Dashboard

  Scenario: Admin Review Vendor Report and Complete Order
    Given  Search Client Order
#        And Vendor submits Appraisal Report
#        And Go Back to View Order Page
    When Admin Reviews Order


