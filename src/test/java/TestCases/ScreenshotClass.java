package TestCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ScreenshotClass {
	
	private WebDriver driver;
	ScreenshotClass(WebDriver driver){
	this.driver=driver;
		
	}
	@Test 
	
	public void screenshotMethod() throws IOException
	{
		WebElement element = driver.findElement(By.id("logo"));
		File src = element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("element.png"));

	}
}
