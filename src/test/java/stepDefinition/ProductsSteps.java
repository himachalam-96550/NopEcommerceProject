package stepDefinition;

import StandardUtilitis.IniPageObjectClasses;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductsSteps extends IniPageObjectClasses {

	@When("user navigates to the add products page under catalog section")
	public void user_navigates_to_the_add_products_page_under_catalog_section() {

		productPageObjects().navigateToProductsPage();

	}

	@When("Add a new product to the application.")
	public void add_a_new_product_to_the_application() throws InterruptedException {

		productPageObjects().addNewProduct();

	}

	@Then("Verify the success message after added to the application.")
	public void verify_the_success_message_after_added_to_the_application() {

	}

	// Search Product
	@When("user search with {string} and enter the search button")
	public void user_search_with_and_enter_the_search_button(String name) {
	   
		
		productPageObjects().searchByProductName(name);
	}
	
	@Then("Verify the search result in the table as per the given data.")
	public void verify_the_search_result_in_the_table_as_per_the_given_data() {
	   
		productPageObjects().VerifyTheTableData("Nikon D5500 DSLR - Black");
		
	}
	
	@When("Search category name as {string} and company name as {string} and click search button")
	public void search_category_name_as_and_company_name_as_and_click_search_button(String category , String compname ) {
	    
		productPageObjects().searchcompanyNameWithCategory(category, compname);
		
	}

	@Then("Verify the search result in the table and verify the stock of the product.")
	public void verify_the_search_result_in_the_table_and_verify_the_stock_of_the_product() {
	   
		productPageObjects().verifyTheSearchResultByCompaney();
	}
}
