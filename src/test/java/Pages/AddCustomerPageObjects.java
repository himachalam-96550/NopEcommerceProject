package Pages;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

import ReadTestData.LoginTestData;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddCustomerPageObjects extends BaseObjectsClass {

	public AddCustomerPageObjects() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='Email']")
	public WebElement usernameelement;

	@FindBy(xpath = "//input[@id='Password']")
	public WebElement passwordelement;

	@FindBy(xpath = "//button[.='Log in']")
	public WebElement loginbbutton;

	@FindBy(xpath = "(//table[contains(@class,'table table-bordered')])[2]/tbody/tr/td")
	public List<WebElement> tabledata;

	@FindBy(xpath = "//ul[contains(@class,'nav nav-pills nav-sidebar')]/li[4]")
	public WebElement customersmenu;

	@FindBy(xpath = "//ul[contains(@class,'nav nav-pills nav-sidebar')]/li[4]//ul/li[1]/a")
	public WebElement customersoption;

	@FindBy(xpath = "(//h1[normalize-space(.=' Customers')])[2]/following::a[1]")
	public WebElement addbtn;

	@FindBy(id = "Email")
	public WebElement emailele;

	@FindBy(id = "Password")
	public WebElement Passwordele;

	@FindBy(id = "FirstName")
	public WebElement FirstNameele;

	@FindBy(id = "LastName")
	public WebElement LastNameele;

	@FindBy(id = "Gender_Male")
	public WebElement Gender_Maleele;

	@FindBy(id = "DateOfBirth")
	public WebElement DateOfBirthele;

	@FindBy(id = "Company")
	public WebElement Companyele;

	@FindBy(id = "SelectedCustomerRoleIds")
	public WebElement dropdownele;

	@FindBy(id = "AdminComment")
	public WebElement textarea;

	@FindBy(xpath = "//div[@class='float-right']/button[normalize-space(.=' Save')][1]")
	public WebElement savebtn;

	@FindBy(xpath = "//div[normalize-space(.=' The new customer has been added successfully.')]")
	public WebElement toastmessageele;

	@FindBy(id = "SearchEmail")
	public WebElement searchemailele;

	@FindBy(id = "SearchFirstName")
	public WebElement searchFirstName;

	@FindBy(id = "SearchLastName")
	public WebElement searchlastName;

	@FindBy(id = "search-customers")
	public WebElement searchBtn;

	@FindBy(xpath = "//table[@id='customers-grid']//tbody/tr[1]/td[2]")
	public WebElement tableFirstrowColumn;

	@FindBy(xpath = "//table[@id='customers-grid']//tbody/tr[1]/td[3]")
	public WebElement tableFirstName;

	@FindBy(xpath = "//table[@id='customers-grid']//tbody/tr[1]/td[7]/a")
	public WebElement tableFirstrowEditBtn;
	
	//products
	
	/*
	 * @FindBy(xpath = "(//ul/li//p[normalize-space(text()='Catalog')])[2]") private
	 * WebElement catalofBtn;
	 * 
	 * 
	 * @FindBy(xpath = "(//ul/li//p[normalize-space(text()=' Products')])[3]")
	 * private WebElement productsBtn;
	 * 
	 * @FindBy(xpath =
	 * "(//h1[normalize-space(.='Products')])[2]/following::a[normalize-space(.=' Add new')][1]"
	 * ) private WebElement addNewBtn;
	 * 
	 * @FindBy(id ="Name") private WebElement produceNameField;
	 * 
	 * @FindBy(id = "ShortDescription") private WebElement shortDiscription;
	 * 
	 * @FindBy(id = "tinymce") private WebElement fullDiscription;
	 */

	
	 
	public void searchByEmail() throws InterruptedException {

		inputhelper.getElementAndEnterData(searchemailele, "kiyjcycyhjc676008@gmail.com");
		Thread.sleep(2000);
		inputhelper.getElementAndClick(searchBtn);
		Thread.sleep(2000);

	}

	public void editUserWithEmail() throws InterruptedException {

		this.searchByEmail();
		Thread.sleep(2000);
		inputhelper.getElementAndClick(tableFirstrowEditBtn);
		Thread.sleep(2000);
		inputhelper.getElementAndEnterData(LastNameele, "Test1234");
		inputhelper.getElementAndClick(savebtn);

	}

	public void searchByFirstName() throws InterruptedException {

		inputhelper.getElementAndEnterData(searchFirstName, "Virat");
		Thread.sleep(2000);
		inputhelper.getElementAndClick(searchBtn);

	}

	public void verifyTableData() throws InterruptedException {

		String tabletext = tableFirstrowColumn.getText();
		Thread.sleep(3000);
		// asserthelper.assertTheTwoString(tabletext, "kiyjcycyhjc676008@gmail.com");

	}

	public void verifyTableDataForFirstName() throws InterruptedException {

		Thread.sleep(3000);
		String tabletext = tableFirstName.getText();
		String[] names = tabletext.split(" ");
		String firstname = names[0];

		// asserthelper.assertTheTwoString(firstname, "Virat");

	}

	public void addcustomer() {

		inputhelper.getElementAndClick(addbtn);

		String name = inputhelper.generateRandomString(10);
		String email = name + "@gmail.com";
		inputhelper.getElementAndEnterData(emailele, email);
		inputhelper.getElementAndEnterData(Passwordele, "12345");
		inputhelper.getElementAndEnterData(FirstNameele, name);
		inputhelper.getElementAndEnterData(LastNameele, "suman123");
		inputhelper.getElementAndClick(Gender_Maleele);
		inputhelper.getElementAndEnterData(DateOfBirthele, "06/05/1995");
		inputhelper.getElementAndEnterData(Companyele, "RIT");
		inputhelper.getElementAndEnterData(textarea, "Testing the add new customer functionality");
		inputhelper.getElementAndClick(savebtn);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

	public void loginfunction(String username, String pwd) {
        
		  LoginTestData loginData = null ;
		 ObjectMapper objectMapper = new ObjectMapper();
	        try {
	            File jsonFile = new File("C:\\Users\\River\\eclipse-workspace\\com.org.nopcommerse\\TestDataFile\\LoginTestData.json");
	            loginData = objectMapper.readValue(jsonFile, LoginTestData.class);
	            System.out.println("Email: " + loginData.getLoginData().getEmail());
	            System.out.println("Password: " + loginData.getLoginData().getPassword());
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        
	        
			/*
			 * inputhelper.getElementAndClear(usernameelement);
			 * inputhelper.getElementAndEnterData(usernameelement, username);
			 * inputhelper.getElementAndClear(passwordelement);
			 * inputhelper.getElementAndEnterData(passwordelement, pwd);
			 */
	        String email = loginData.getLoginData().getEmail();
	       String password = loginData.getLoginData().getPassword();
	        
	        inputhelper.getElementAndClear(usernameelement);
			inputhelper.getElementAndEnterData(usernameelement,email);
			inputhelper.getElementAndClear(passwordelement);
			inputhelper.getElementAndEnterData(passwordelement, password);
	}

	public void clickLogin() {

		
		inputhelper.getElementAndClick(loginbbutton);
	
		JavascriptExecutor js = (JavascriptExecutor)driver;

		WebElement shadowHost = driver.findElement(By.cssSelector("shadow-host-selector"));


		js.executeScript(
		    "return arguments[0].shadowRoot.querySelector('input[type=checkbox]').click();",
		    shadowHost
		);

		


	}
	public WebDriver launchBrowser() {
		  WebDriverManager.chromedriver().setup();
		  driver.get("http://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		  return driver;  		  
	}
		 
		 
		 

		public void navigateToAddCustomerPage() {
			inputhelper.getElementAndClick(customersmenu);
			inputhelper.getElementAndClick(customersoption);
		}
	
	
	
	 

	
	/*
	 * public void navigateToProductsPage() {
	 * 
	 * inputhelper.getElementAndClick(catalofBtn);
	 * inputhelper.getElementAndClick(productsBtn); }
	 * 
	 * 
	 * public void addNewProduct() {
	 * 
	 * 
	 * inputhelper.getElementAndClick(addNewBtn);
	 * inputhelper.getElementAndEnterData(produceNameField, "Ridder KeyBoard");
	 * inputhelper.getElementAndEnterData(shortDiscription,
	 * "This is a Ridder KeyBoard with good quality"); }
	 */
	
	
}
