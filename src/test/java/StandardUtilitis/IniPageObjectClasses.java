package StandardUtilitis;



import Pages.AddCustomerPageObjects;
import Pages.ManufacturerPage;
import Pages.ProductsPage;


public class IniPageObjectClasses {

	
	public AddCustomerPageObjects customerPageObjects() {
		  
        
		  return new AddCustomerPageObjects();
	   }

	  
	public ManufacturerPage manufacturerPage() {
		  
		  return new ManufacturerPage();
	  }
	
	  public ProductsPage productPageObjects() {
		  
		  return new ProductsPage();
	  }
	  
	
	  
 
}
