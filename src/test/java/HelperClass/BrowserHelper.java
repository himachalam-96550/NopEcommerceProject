package HelperClass;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class BrowserHelper {

	WebDriver driver;
	
    public void enterUrl(String url)
    {
        driver.navigate().to(url);
    }
    public void goBack()
    {
        driver.navigate().back();
    }
    public void goForward()
    {
        driver.navigate().forward();
    }
    public void refresh()
    {
        driver.navigate().refresh();
    }
    public String getWindowHandle()
    {
        return driver.getWindowHandle();
    }
    public Set<String> getWindowHandles()
    {
        return driver.getWindowHandles();
    }

    public void switchToLastWindow()
    {
        for (String winHandle : getWindowHandles())
        {
            driver.switchTo().window(winHandle);
        }
    }
    
    
	
	
	
	
	
}
