package TestPractice;

import java.io.FileInputStream;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TestExtentReport {

	private static ExtentReports extent;

	public static ExtentReports getExtent() {

		if (extent == null) {

			String file = "/Reports/extentReport.html";
			ExtentSparkReporter reporter = new ExtentSparkReporter(file);

			reporter.config().setReportName("Rahul");
			reporter.config().setDocumentTitle("QA Automation Report");
			reporter.config().setTimeStampFormat("dd-mm-yyyy");

			extent = new ExtentReports();
			extent.attachReporter(reporter);
			extent.setSystemInfo("Tester", System.getProperty("QA_Name"));
			extent.setSystemInfo("Environment", System.getProperty("env"));
		}
		return extent;
	}

}
