package utils;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManagerNew {
	
	public static ExtentReports extent;
	
	
	public static ExtentReports getExtentReport() {
		
		if(extent==null) {
			
			String reportPath = System.getProperty("user.dir") + "\\reports\\ExtentReport"+System.currentTimeMillis()+".html";
			
			ExtentSparkReporter reporter = new ExtentSparkReporter(reportPath);
			reporter.config().setReportName("Automation Report");
			reporter.config().setDocumentTitle("Selenium Hybrid Framework");
			reporter.config().setTimeStampFormat("dd-MM-yyyy");
			
			extent = new ExtentReports();
			extent.attachReporter(reporter);
			
			extent.setSystemInfo("Tester", "Rahul");
			extent.setSystemInfo("Env", "QA");
			extent.setSystemInfo("OS", "Windows");
			extent.setSystemInfo("Browser", "Chrome");
			
		}
		return extent;
	}
	
}
