Feature: This is a customer page feature

  @sanity
  Scenario: To add a new customer in the application
    Given User launch the browser
    When Login to the application
    And user navigates to the add new customer page
    And user will add a customer to the application
    Then Verify the user added customer is on table

  @sanity
  Scenario: To search the customer with Email Id
    Given User launch the browser
    When Login to the application
    And user navigates to the add new customer page
    Then Search the customer with help of email id and verify

  @sanity
  Scenario: To search the customer with First Name
    Given User launch the browser
    When Login to the application
    And user navigates to the add new customer page
    Then Search the customer with help of first name and verify

  @Edituser
  Scenario: Edit customer details with Email id
    Given User launch the browser
    When Login to the application
    And user navigates to the add new customer page
    Then Edit customer details and verify
