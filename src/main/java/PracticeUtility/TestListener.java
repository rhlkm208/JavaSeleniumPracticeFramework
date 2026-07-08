package PracticeUtility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import utils.DriverFactory;


public class TestListener implements ITestListener {
	ExtentReports extent = ExtentManager.getExtentReport();
	ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {

		test.pass("Test Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.fail(result.getThrowable());

		String ScreenshotPath = ScreenshotUtil.captureScreenshot(DriverFactory.getDriver(), result.getMethod().getMethodName());
		
		try {
			test.addScreenCaptureFromPath(ScreenshotPath);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();

	}

}
