Feature: This is a product feature of nop commerce application

  @add
  Scenario: Add new product to the application
    Given User launch the browser
    When Login to the application
    And user navigates to the add products page under catalog section
    And Add a new product to the application.
    Then Verify the success message after added to the application.

  @search
  Scenario: Search The Product By Name in the application
    Given User launch the browser
    When Login to the application
    And user navigates to the add products page under catalog section
    And user search with "Nikon D5500 DSLR - Black" and enter the search button
    Then Verify the search result in the table as per the given data.

  @manufatureresearch
  Scenario: Search the products by the manufacturer companey name and category
    Given User launch the browser
    When Login to the application
    And user navigates to the add products page under catalog section
    And Search category name as "All" and company name as "HP" and click search button
    Then Verify the search result in the table and verify the stock of the product.
