package Com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com.Page_Object.LogInPom;
import Com.Utility.BaseClass;
import Com.Utility.Library;

public class Verify_LogInTest extends BaseClass{
	@Test
	public void verify_loginwithValidCredentials() throws Exception {
		LogInPom login=PageFactory.initElements(driver, LogInPom.class);
//		login.getEmailid().sendKeys(config.getUsername_Stage());
//		login.getPassword().sendKeys(config.getPasswored_Stage());
//		login.getLoginbtn().click();
		Library.custom_Sendkeys(login.getEmailid(), config.getUsername_Stage(), "Emailid_Filed");
		Library.custom_Sendkeys(login.getPassword(), config.getPasswored_Stage(), "Passwpred_Filed");
		
//		String aaaa=getData("Login", 0, 0);
//		System.out.println(aaaa);
	}
//	public static String getData(String sheetname, int row, int cell) throws IOException {
//		File file=new File("C:\\Users\\LENOVO\\eclipse-workspace\\Project4_Fb\\TestData\\Data1.xlsx");
//		FileInputStream fis=new FileInputStream(file);
//		XSSFWorkbook wb=new XSSFWorkbook(fis);
//		String data=wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
//		return data;
//	}

}
