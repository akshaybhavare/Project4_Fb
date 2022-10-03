package Com.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static ConfigDataProvider config;
	public static ExcelDataProvider excel;
	
	@BeforeSuite()
		public void BS() throws Exception {
		config=new ConfigDataProvider();
		excel=new ExcelDataProvider();
		}
	@Parameters({"Envoirment"})
	@BeforeMethod
	public void SetUp(String Envoirment) {
		if(Envoirment.equalsIgnoreCase(config.getStage_Url())) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(config.getStage_Url());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	else if(Envoirment.equalsIgnoreCase(config.getLive_Url())) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(config.getLive_Url());
	}
	}
	@AfterMethod
	public void tearDown() {
//		driver.close();
	}
}
