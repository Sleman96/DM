
Feature: Test the login functionality
  @firefox
  Scenario: To login with valid email and valid password

    Given user open website DM

    When click on login button from the top right corner
    And enter DM account "slemanalhasan"
    And enter the password "123456Aa@@"
    And click on login button

    Then user will be on the dashboard "https://hub.dm.gov.ae/link/Dashboard"
    And will see the logged user name displayed as "Welcome Username"
    And the dashboard will contain the tab "My Dashboard"
    And the dashboard will contain the tab "My Profile"
    And the dashboard will contain the tab "My Payments"
    And the dashboard will contain the tab "All Services"
    And the dashboard will contain the tab "Favorite Services"

    And will see the summary of the request submitted by him