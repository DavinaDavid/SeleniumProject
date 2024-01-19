Feature: Admin Logins and Assign Order to Vendor
  Testing login functionality of Admin

Background: Test for Successful Login of Admin user
    Given user goes to URL
    When user enters UserName "amsadmin"
    And user enters Password "VLDir@23"
    Then click Login to access user Dashboard


    Scenario: Admin Search Order and Assign to Vendor
        Given Search Client Order
        When Select Assign to AMC via Actions
        And AMC is Selected
        Then AMC is Assigned
        And Go Back to View Order Page
        And User logs Out


