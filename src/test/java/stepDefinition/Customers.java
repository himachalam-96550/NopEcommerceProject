package stepDefinition;

import org.openqa.selenium.WebDriver;


import Pages.AddCustomerPageObjects;
import StandardUtilitis.IniPageObjectClasses;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Customers extends IniPageObjectClasses{






	@Given("User launch the browser")
	public void user_launch_the_browser() {

		customerPageObjects().launchBrowser();
		
	}

	@When("Login to the application")
	public void login_to_the_application() {

		customerPageObjects().loginfunction("admin@yourstore.com", "admin");
		customerPageObjects().clickLogin();

	}

	@When("user navigates to the add new customer page")
	public void user_navigates_to_the_add_new_customer_page() {

		customerPageObjects().navigateToAddCustomerPage();

	}

	@When("user will add a customer to the application")
	public void user_will_add_a_customer_to_the_application() {

		customerPageObjects().addcustomer();

	}

	@Then("Verify the user added customer is on table")
	public void verify_the_user_added_customer_is_on_table() {



	}


	// Search User


	@Then("Search the customer with help of email id and verify")
	public void search_the_customer_with_help_of_email_id_and_verify() throws InterruptedException {
		
		customerPageObjects().searchByEmail();
		customerPageObjects().verifyTableData();
	}

	@Then("Search the customer with help of first name and verify")
	public void search_the_customer_with_help_of_first_name_and_verify() throws InterruptedException {
	  
		customerPageObjects().searchByFirstName();
		customerPageObjects().verifyTableDataForFirstName();
	}


	@Then("Edit customer details and verify")
	public void edit_customer_details_and_verify() throws InterruptedException {
	   
		customerPageObjects().editUserWithEmail();
		
	
	}

	// Products Page
	
	
	/*
	 * @When("user navigates to the add products page under catalog section") public
	 * void user_navigates_to_the_add_products_page_under_catalog_section() {
	 * 
	 * //productPageObjects().navigateToProductsPage();
	 * customerPageObjects().navigateToProductsPage();
	 * 
	 * 
	 * }
	 * 
	 * @When("Add a new product to the application.") public void
	 * add_a_new_product_to_the_application() {
	 * 
	 * //productPageObjects().addNewProduct();
	 * customerPageObjects().addNewProduct();
	 * 
	 * }
	 * 
	 * @Then("Verify the success message after added to the application.") public
	 * void verify_the_success_message_after_added_to_the_application() {
	 * 
	 * }
	 */
	
	

}
