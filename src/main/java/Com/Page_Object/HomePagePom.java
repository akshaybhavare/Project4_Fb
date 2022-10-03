package Com.Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Com.Utility.BaseClass;

public class HomePagePom extends BaseClass{
	
	WebDriver driver;
	
	@FindBy(how=How.XPATH, using="")
	private WebElement fild1;
	@FindBy(how=How.XPATH,using="")
	private WebElement fild2;
	
	public HomePagePom(WebDriver driver) {
		this.driver=driver;
		
	}
	
	
	public WebElement getfild1() {
		return fild1;
	}
	
	public WebElement getfild2() {
		return fild1;
		
	}

}
