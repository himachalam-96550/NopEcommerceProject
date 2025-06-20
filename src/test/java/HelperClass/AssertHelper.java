package HelperClass;

import org.testng.Assert;

public class AssertHelper {

	
	 
	 public void assertTheTwoString(String expected, String actual)
	 {
		 
		 Assert.assertEquals(expected, actual);
	 }
	 
	 public void assertTwoNumbers(int num1, int num2) {
		 
		 Assert.assertEquals(num1, num2);
	 }
	
	public void assertContainsString(String actualText, String expectedtext) {
		
		try {
		Assert.assertTrue(actualText.contains(expectedtext));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
