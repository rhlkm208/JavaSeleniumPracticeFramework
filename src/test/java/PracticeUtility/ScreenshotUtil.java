package PracticeUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtil {
	

	public static String captureScreenshot(WebDriver driver, String methodName) {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir") +"/src/test/resources/" + methodName + "_" +System.currentTimeMillis() + ".png";
		File dest = new File(path);
		
		try {
			FileHandler.copy(src, dest);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	return path;
	}

}
