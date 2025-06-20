package stepDefinition;

import StandardUtilitis.IniPageObjectClasses;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ManufacturerSteps extends IniPageObjectClasses  {
	
	
	
	
	
	
	@When("user navigates to the add Manufacturers page under catalog section")
	public void user_navigates_to_the_add_manufacturers_page_under_catalog_section() {
	    
		manufacturerPage().navToManufactyrerspage();
	}

	@When("Add new company in the application")
	public void add_new_company_in_the_application() {
	    
		manufacturerPage().addCompany();
		
	}

	@Then("Verify the company name in the products page manufacturer dropdown")
	public void verify_the_company_name_in_the_products_page_manufacturer_dropdown() {
	   
		manufacturerPage().verificationForCompanyCreation();
		
	}
	
	
	@When("Search the company by using name")
	public void search_the_company_by_using_name() {
	    
		manufacturerPage().searchCompanyWithName();
	}

	@Then("Verify the company name in the table")
	public void verify_the_company_name_in_the_table() {
	   manufacturerPage().verifyTheCompanyTable();
	}


}
