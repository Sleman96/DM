Feature: Test the logout functionality
@firefox
  Scenario: Logout

    Given user open website DM

    When click on login button from the top right corner
    And enter DM account "slemanalhasan"
    And enter the password "123456Aa@@"
    And click on login button
    Then user will be on the dashboard "https://hub.dm.gov.ae/link/Dashboard"

    When user click on profile
    And click on logout button
    Then user will be on home page
    And there will be login option