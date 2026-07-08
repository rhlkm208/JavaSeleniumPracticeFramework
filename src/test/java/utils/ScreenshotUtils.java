package utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import base.DriverManager;

public class ScreenshotUtils {
	
	public static String capture(String testName) {
		TakesScreenshot ts = (TakesScreenshot) DriverManager.getDriver();
	File Source = ts.getScreenshotAs(OutputType.FILE);
	String path = "screenshots/" + testName+ ".png";
	File Target = new File(path);
	
	try {
		FileHandler.copy(Source, Target);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return path;
	}

}