package Com.Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;

public class Library {
	public static ExtentTest test;
	public static void custom_Sendkeys(WebElement element, String value, String fieldname) {
		element.sendKeys(value);
	}
	
	public static void custom_Click(WebElement element, String fieldname) {
		element.click();
	}
	
	public static void custom_dropDown(WebElement element, String test) {
		Select s=new Select(element);
		s.selectByVisibleText(test);		
	}
	
//	Action
//	doubleclick
//	draganddrop
//	copypest
//	alert
//	ChildWindow handling
//	Assert / hard Assert
//	Screenshot
	
	
	
	
	
}
