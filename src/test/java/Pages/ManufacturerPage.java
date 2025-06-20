package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ManufacturerPage extends BaseObjectsClass {

	
	public ManufacturerPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//ul/li//p[normalize-space(text()='Catalog')])[2]")
	private WebElement catalofBtn;

	@FindBy(xpath = "(//ul[@class='nav nav-treeview'])[1]/li//p[.=' Manufacturers']")
	private WebElement manufacturerselement;
	
	
	@FindBy(id = "search-manufacturers")
	private WebElement manufacturesearchBtn;
	
	@FindBy(xpath = "//select[@id='SearchManufacturerId']")
	private WebElement manufacturingdd;
	
	@FindBy(xpath = "//a[normalize-space(.)='Add new']")
	private WebElement companyaddbtm;
	
	@FindBy(id = "SearchManufacturerName")
	private WebElement companynameinput;

	@FindBy(id = "tinymce")
	private WebElement companyDescription;
	//Description_ifr
	
	@FindBy(xpath = "//button[normalize-space(.)='Save']")
	private WebElement companySaveBtn;
	
	@FindBy(xpath = "(//ul/li//p[normalize-space(text()=' Products')])[3]")
	private WebElement productsBtn;
	
	 @FindBy(id = "SearchManufacturerId") 
	  private WebElement manufactururedd;
	 
	 @FindBy(id = "SearchManufacturerName") 
	  private WebElement manufacturerNameInput;
	 
	 @FindBy(xpath = "//table[@id='manufacturers-grid']/tbody/tr[1]/td[2]") 
	  private WebElement companyNameVerification;
	 
	public void verifyTheCompanyTable() {
		
		String text = companyNameVerification.getText();
		asserthelper.assertTheTwoString(text, "Orange");
	}
	
	public void addCompany() {
		
		inputhelper.getElementAndClick(companyaddbtm);
		inputhelper.getElementAndEnterData(companynameinput,"Orange");
		
		driver.switchTo().frame("Description_ifr");
		inputhelper.getElementAndEnterData(companyDescription,"This is Orange Brand for Laptops");
		driver.switchTo().defaultContent();
		inputhelper.getElementAndClick(companySaveBtn);	
	}
	 public void searchCompanyWithName() {
		 
			inputhelper.getElementAndEnterData(companynameinput,"Goa");
			inputhelper.getElementAndClick(manufacturesearchBtn);	
	   }
	
	public void navToManufactyrerspage() {
		
		inputhelper.getElementAndClick(catalofBtn);
		inputhelper.getElementAndClick(manufacturerselement);
	}
	
	public void verificationForCompanyCreation() {
		
		inputhelper.getElementAndClick(productsBtn);
		Select sc1= new Select(manufacturingdd);
		List<WebElement> options = sc1.getOptions();
		
		for(WebElement ele : options) {
			
			String text = ele.getText();
			
			if(text.equals("Orange")) {
				
				System.out.println("Test Pass");
			}
			
			
		}

		
	}
	
	

    









}
