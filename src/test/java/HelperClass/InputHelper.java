package HelperClass;

import java.util.Random;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputHelper {

	
	 public void getElementAndEnterData(WebElement element, String text)
	 { 
	     element.clear();
	     element.sendKeys(text);
	 }	
	 
    public void getElementAndClickWithJs(WebDriver driver,WebElement element) {
	 
    	 JavascriptExecutor executor = (JavascriptExecutor)driver;
    	 executor.executeScript("arguments[0].click();", element);
    }
 

    public void getElementAndClick (WebElement element) {
   	 
   	         element.click();
   }

    public void getElementAndClear(WebElement element)
    {
        element.click();
        element.clear();
    }
    
    
	 public  String generateRandomString(int length) {
	        
		  String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		 StringBuilder sb = new StringBuilder(length);
	        Random random = new Random();
	        for (int i = 0; i < length; i++) {
	            int randomIndex = random.nextInt(CHARACTERS.length());
	            sb.append(CHARACTERS.charAt(randomIndex));
	        }
	        return sb.toString();
	    }
}
