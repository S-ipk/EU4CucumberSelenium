@title
Feature: Navigation Menu

  Scenario:Navigating Fleet --Vehicles
    Given the user in on the login page
    And the user enters the sales manager information
    When the user navigates Fleet, Vehicles
    Then the user should be see Vehicles page title
  @db
  Scenario:Navigating Marketing -- Campaigns
    Given the user in on the login page
    And the user enters the sales manager information
    When the user choose Marketing,Campaigns
    Then the user should be see Campaigns page title

  Scenario:Navigating Activities -- Calendar Events
    Given the user in on the login page
    And the user enters the sales manager information
    When the user choose Activities,Calendar Events
    Then the user should be see Calendars page title