package TestCases;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class testScreenshot {
	WebDriver driver;
	
	public void screenshotMethod() {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("/downloads/screenshot.png");
		
		try {
		FileHandler.copy(src, dest);
		}
		catch(IOException e){
			e.printStackTrace();
		}		
		
	}

}

