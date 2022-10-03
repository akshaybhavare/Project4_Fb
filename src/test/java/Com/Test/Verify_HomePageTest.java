package Com.Test;

import org.openqa.selenium.support.PageFactory;

import Com.Page_Object.HomePagePom;
import Com.Utility.BaseClass;
import Com.Utility.Library;

public class Verify_HomePageTest extends BaseClass{
	
	public void test_homepage() {
		
		HomePagePom hp=PageFactory.initElements(driver, HomePagePom.class);
//		hp.getfild1().sendKeys(config.getUsername_Stage());
//		hp.getfild2().sendKeys(config.getPasswored_Stage());
		
		Library.custom_Sendkeys(hp.getfild1(), config.getUsername_Stage(), "Fild_1");
		Library.custom_Sendkeys(hp.getfild2(), config.getPasswored_Stage(), "Fild_2");
		
		
		
		
		
		/*
		String data=excel.getStringData("Login", 0, 0);
		System.out.println(data);
		*/
	}
	
	

}
