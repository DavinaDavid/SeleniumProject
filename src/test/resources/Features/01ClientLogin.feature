Feature: Client Logins Credential Verification
  Testing login functionality

  Scenario Outline: Test for Un-Successful Login -Invalid Informations
    Given user goes to URL
    When user enters UserName <Users>
    And user enters Password <Pass>
    Then click Login to lead me to Client Dashboard
    Examples:
      | Users         | Pass        |
      | "avclienthb2" | "client123" |
      | "client"      | "dev.1234"  |
      | "clientuser"  | "client123" |


  Scenario: Test for Successful Login
    Given user goes to URL
    When user enters UserName "avclienthb2"
    And user enters Password "dev.1234"
    Then click Login to lead me to Client Dashboard
