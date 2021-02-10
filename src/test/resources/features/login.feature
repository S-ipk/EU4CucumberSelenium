@login @smoke
Feature: Users should be able to login

  Background:
    Given the user in on the login page
  @driver @VYT-123
  Scenario: Login as a Driver
    When the user enters the driver information
    Then the user should be able to login
  @sales_manager
  Scenario:Login as Sales Manager
    When the user enters the sales manager information
    Then the user should be able to login
  @store_manager @smoke
  Scenario:Login as Store Manager
    When the user enters the store manager information
    Then the user should be able to login