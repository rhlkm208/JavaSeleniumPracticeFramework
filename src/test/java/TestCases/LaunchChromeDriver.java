package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchChromeDriver {
	private static WebDriver driver;
	
 // private By A = By.xpath("//*[@id='abc']");
  
  public static void initDriver() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
  }
  
  @Test
  public static void Launch() {
	  initDriver();
	  driver.get("https://www.flipkart.com/");
  }

	public static void main(String[] args) {
		
		/*
		 * initDriver(); driver.get("https://www.flipkart.com/");
		 * driver.manage().window().maximize(); driver.close();
		 */
		
		  ChromeDriver driver = new ChromeDriver();
		  driver.get("https://www.flipkart.com/"); driver.manage().window().maximize();
		  driver.close();
		 
		
		
		
		
		

	}

}
