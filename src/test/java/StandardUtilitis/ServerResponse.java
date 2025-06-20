package StandardUtilitis;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServerResponse {

	
	  public static WebDriver driver;
	  
	  public WebDriver launchBrowser() {
		  
		  
		  WebDriverManager.chromedriver().setup(); 
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  return driver;
		  }
		

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		ServerResponse.driver = driver;
	}
	  
	  
	 
	
}
