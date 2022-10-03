package Com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
	// ExtentSparkReporter
	// ExtentReports

public class ExtentReportGenrator {
	
	public static ExtentReports extent;
	public static ExtentReports gerReport() {
		String path="C:\\Users\\LENOVO\\eclipse-workspace\\Project4_Fb\\Reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Test Report");
		reporter.config().setReportName("FB Report");
		reporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Project name", "FB test");
		extent.setSystemInfo("QA", "PQR");
		return extent;
		
	}
}
