package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import HelperClass.GenralHelper;
import io.cucumber.core.gherkin.Argument;

public class ProductsPage extends BaseObjectsClass {

	public ProductsPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//ul/li//p[normalize-space(text()='Catalog')])[2]")
	private WebElement catalofBtn;

	@FindBy(xpath = "(//ul/li//p[normalize-space(text()=' Products')])[3]")
	private WebElement productsBtn;

	@FindBy(xpath = "(//h1[normalize-space(.='Products')])[2]/following::a[normalize-space(.=' Add new')][1]")
	private WebElement addNewBtn;

	@FindBy(id = "Name")
	private WebElement produceNameField;

	@FindBy(id = "ShortDescription")
	private WebElement shortDiscription;

	@FindBy(id = "tinymce")
	private WebElement fullDiscription;

	@FindBy(id = "Sku")
	private WebElement skuDiscription;

	@FindBy(xpath = "//label[.='Categories']/following::div[4]")
	private WebElement categoriesInput;

	@FindBy(xpath = "(//ul/li/input[@type='search'])[1]")
	private WebElement categoriesdd;

	@FindBy(xpath = "//ul[@id='select2-SelectedCategoryIds-results']/li[4]")
	private WebElement dropdowncategoried;

	@FindBy(id = "SelectedManufacturerIds_listbox")
	private WebElement manufacturinginput;

	@FindBy(xpath = "//select[@id='SearchManufacturerId']")
	private WebElement manufacturingdd;

	@FindBy(id = "ProductTags")
	private WebElement productTagsinputs;

	@FindBy(id = "Gtin")
	private WebElement tinInput;

	@FindBy(id = "ManufacturerPartNumber")
	private WebElement partnumberinput;

	@FindBy(xpath = "//select[@id='SelectedCustomerRoleIds']")
	private WebElement customerrolldd;

	@FindBy(id = "AvailableStartDateTimeUtc")
	private WebElement startdate;

	@FindBy(id = "AvailableEndDateTimeUtc")
	private WebElement enddate;

	@FindBy(id = "SearchProductName")
	private WebElement searchInput;

	@FindBy(id = "search-products")
	private WebElement searchBtn;

	@FindBy(xpath = "//table[@id='products-grid']/tbody/tr[1]/td[3]")
	private WebElement tableRow;

	
	  @FindBy(id = "SearchCategoryId") 
	  private WebElement categorydd;
	  
	  @FindBy(id = "SearchManufacturerId") 
	  private WebElement manufactururedd;
	 
	  @FindBy(xpath = "//table[@id='products-grid']/tbody/tr[1]/td[6]")
	  private WebElement tablerowstock;

	
	  
	  public void searchByProductName(String name) {

		inputhelper.getElementAndEnterData(searchInput, name);
		inputhelper.getElementAndClick(searchBtn);

	}

	public void VerifyTheTableData(String actdata) {

		String expdata = tableRow.getText();
		asserthelper.assertTheTwoString(actdata, expdata);

	}

	public void navigateToProductsPage() {

		inputhelper.getElementAndClick(catalofBtn);
		inputhelper.getElementAndClick(productsBtn);
	}

	public void addNewProduct() throws InterruptedException {

		inputhelper.getElementAndClick(addNewBtn);
		inputhelper.getElementAndEnterData(produceNameField, "Ridder KeyBoard");
		 inputhelper.getElementAndEnterData(shortDiscription, "This is a RidderKeyBoard with good quality");
		
		driver.switchTo().frame("FullDescription_ifr");
		inputhelper.getElementAndEnterData(fullDiscription,"This is a Ridder KeyBoard with good quality with AI smart features");
				
		driver.switchTo().defaultContent();
		inputhelper.getElementAndEnterData(skuDiscription, "Demo1");

		Thread.sleep(3000);
		

		inputhelper.getElementAndClick(dropdowncategoried);
		inputhelper.getElementAndClick(produceNameField);

		Thread.sleep(3000);

		inputhelper.getElementAndClick(manufacturinginput);
		inputhelper.getElementAndClick(manufacturingdd);

		Select sc1 = new Select(customerrolldd);
		sc1.selectByIndex(1);
		inputhelper.getElementAndEnterData(startdate, "5/1/2024 12:00 AM");
		inputhelper.getElementAndEnterData(enddate, "5/3/2024 12:00 AM");
		
		}

	
	
	public void searchcompanyNameWithCategory(String catname, String compname ) {
		
		Select sc = new Select(categorydd);
		sc.selectByIndex(2);
		generalHelper.wait(3000);
		Select sc1= new Select(manufacturingdd);
		sc1.selectByValue("2");
		generalHelper.wait(3000);
		inputhelper.getElementAndClick(searchBtn);
	
	}
	
	public void verifyTheSearchResultByCompaney() {
		
		String text = tablerowstock.getText();
		System.out.println(text);
		
	}
}
