package utils;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class TestListener implements ITestListener{
	
	ExtentReports extent = ExtentManager.getInstance();
	ExtentTest test;
	
	@Override
	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getName());
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		test.pass("Test Passed");
		
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		test.fail(result.getThrowable());
		
		String path = ScreenshotUtils.capture(result.getName());
		test.addScreenCaptureFromPath(path);
		
	}

	@Override
	public void onFinish(org.testng.ITestContext context) {
		extent.flush();
		
	}
}
