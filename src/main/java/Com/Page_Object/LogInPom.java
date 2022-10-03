package Com.Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LogInPom {
	
	WebDriver driver;     //instance
	
	
	@FindBy(how=How.XPATH,using="//input[@type='text']")
	private WebElement Emailid;
	@FindBy(how=How.XPATH,using="//input[@type='password']")
	private WebElement Password;
	@FindBy(how=How.XPATH,using="//button[@name='login']")
	private WebElement loginbtn;
	
	public LogInPom(WebDriver driver) {
		this.driver=driver;	
	}

	public WebElement getEmailid() {
		return Emailid;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	
	
	
	
	
	
}
