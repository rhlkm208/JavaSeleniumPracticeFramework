package TestPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTestCasesPractice {

	protected WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/menu.php#");
	}
	
	@Test
	public void ActionClass() {
		
		WebElement ele = driver.findElement(By.xpath(""));
		
		Actions ac = new Actions(driver);
		ac.clickAndHold(ele).build().perform();
		
		ac.doubleClick(ele).build().perform();
		ac.contextClick(ele).build().perform();
		
		WebElement src = driver.findElement(By.xpath(""));
		WebElement des = driver.findElement(By.xpath(""));
		
		ac.dragAndDrop(src, des).build().perform();
		
		ac.keyDown(Keys.SHIFT);
		
		
	}
		

	@AfterMethod
	public void tearDown() {
		
	}
	

}
