package TestPractice;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class TestListener implements ITestListener  {
	
	ExtentReports extent = TestExtentReport.getExtent();
	ExtentTest test;
	
	
	@Override
	public void onTestStart(ITestResult result) {
		
	}

}
