Feature: This is a manufacturer page tests

  @addmanufatureres
  Scenario: Add new manufacturer to the application
    Given User launch the browser
    When Login to the application
    And user navigates to the add Manufacturers page under catalog section
    And Add new company in the application
    Then Verify the company name in the products page manufacturer dropdown
  
    @searchbyname
    Scenario: Add new manufacturer to the application
    Given User launch the browser
    When Login to the application
    And user navigates to the add Manufacturers page under catalog section
    And Search the company by using name
    Then Verify the company name in the table
    