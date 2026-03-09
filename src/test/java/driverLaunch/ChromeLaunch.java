package driverLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeLaunch {
	
	
	
	public static void main(String args[]) {
	//	System.setProperty("", null);
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.get("abc.com");
	    driver.findElement(By.xpath("Test")).sendKeys("Hello");
	    	driver.findElement(By.xpath("Test")).sendKeys("password");
	        driver.findElement(By.xpath("Hello")).click();
	}

}
