package Com.Utility;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelDataProvider {
	public static XSSFWorkbook wwwb;
	public ExcelDataProvider() throws IOException {
		String path="C:\\Users\\LENOVO\\eclipse-workspace\\Project4_Fb\\TestData\\Data1.xlsx";
		File file=new File(path);
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wwwb=new XSSFWorkbook(fis);
	}
	public String getStringData(String sheetname, int row, int column) {
		return wwwb.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
	}

	

}
