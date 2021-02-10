Feature: Login as different users


  Scenario: login as driver user
    Given the user in on the login page
    When the user logs in using "User10" and "UserUser123"
    Then the user should be able to login
    And the title contains "Dashboard"


