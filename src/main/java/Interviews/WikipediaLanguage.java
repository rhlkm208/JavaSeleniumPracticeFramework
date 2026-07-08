package Interviews;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WikipediaLanguage {
	
	protected WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
	}
	
	@Test
	public void wikipediaLangTest() {
		
		List<WebElement> lang = driver.findElements(By.xpath("//nav[@class='central-featured']//strong"));
		
		System.out.println(lang);
		
		for(WebElement language:lang) {
			System.out.println(language.getText());
		}
		
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
			
	}

}
