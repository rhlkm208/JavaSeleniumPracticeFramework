package PracticeUtility;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

	private static ExtentReports extent;

	public static ExtentReports getExtentReport() {

		if (extent == null) {

			// Timestamp for report
			String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

			// Report path
			String reportPath = System.getProperty("user.dir") + "/reports/ExtentReport_" + timeStamp + ".html";

			// Reporter
			ExtentSparkReporter reporter = new ExtentSparkReporter(reportPath);

			reporter.config().setReportName("Automation Test Report");

			reporter.config().setDocumentTitle("Selenium Hybrid Framework");

			reporter.config().setTimeStampFormat("dd-MM-yyyy HH:mm:ss");

			// Extent object
			extent = new ExtentReports();

			extent.attachReporter(reporter);

			// System info
			extent.setSystemInfo("Tester", System.getProperty("user.name"));

			extent.setSystemInfo("Environment", ConfigReader.getProperty("env"));

			extent.setSystemInfo("Browser", ConfigReader.getProperty("browser"));

			extent.setSystemInfo("OS", System.getProperty("os.name"));

		}

		return extent;
	}

}