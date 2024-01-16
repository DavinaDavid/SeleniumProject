Feature: Client Login
  Testing login functionality

#  Scenario Outline: Test for Un-Successful Login -Invalid Informations
#    Given user goes to URL
#    When user enters username <Users>
#    And user enters password <Pass>
#    Then open Client Dashboard
#    Examples:
#      | Users         | Pass        |
#      | "avclienthb2" | "client123" |
#      | "client"      | "dev.1234"  |
#      | "clientuser"  | "client123"   |


  Scenario: Test for Successful Login
    Given user goes to URL
    When user enters username "avclienthb2"
    And user enters password "dev.1234"
    Then open Client Dashboard



#Scenario: Test for Un-Successful Login -Invalid Username
#    Given user goes to URL
#    When user enters username "admin"
#    And user enters password "VLDir@23"
#    Then open Dashboard
#
#  Scenario: Test for Un-Successful Login -Invalid Password
#    Given user goes to URL
#    When user enters username "amsadmin"
#    And user enters password "admin123"
#    Then open Dashboard
#
#  Scenario: Test for Un-Successful Login -Invalid Informations
#    Given user goes to URL
#    When user enters username "adminuser"
#    And user enters password "admin123"
#    Then open Dashboard