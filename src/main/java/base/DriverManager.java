package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
	
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	
	// Initialize driver
	public static void initDriver() {
		if(driver.get()==null) {
			driver.set(new ChromeDriver());
		}
		
	}
	
	// Initialize driver
	public static WebDriver getDriver() {
		return driver.get(); 
	}
	
	// Quit driver
	public static void quitDriver() {
		if (driver.get()!=null) {
			driver.get().quit();
			driver.remove(); // Important to avoid memory leaks
		}
	}

}
