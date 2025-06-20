package Pages;




import org.openqa.selenium.WebDriver;

import HelperClass.AssertHelper;
import HelperClass.BrowserHelper;
import HelperClass.CalendarHelper;
import HelperClass.GenralHelper;
import HelperClass.InputHelper;
import StandardUtilitis.ServerResponse;


public class BaseObjectsClass extends ServerResponse {

	
	public static WebDriver driver;
	public static AssertHelper asserthelper = new AssertHelper();
	public static BrowserHelper browserhelper = new BrowserHelper();
	public static CalendarHelper calendarhelper = new CalendarHelper();
	public static InputHelper inputhelper = new InputHelper();
	public static GenralHelper generalHelper = new GenralHelper();

	
	

	
	
}
