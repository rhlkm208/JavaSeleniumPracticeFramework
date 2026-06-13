package utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactoryNew {
	
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	
	public static WebDriver getDriver() {
		return driver.get();
	}

	
	public static void initDriver(String browser) {
		String browser1 = ConfigReaderNew.getProperty(browser);
		if(browser1.equalsIgnoreCase("chrome")) {
			driver.set(new ChromeDriver());
		}
		else if(browser1.equalsIgnoreCase("firefox")) {
			driver.set(new FirefoxDriver());
		}
		else if(browser1.equalsIgnoreCase("Edge")) {
			driver.set(new EdgeDriver());
		}
		else {
			throw new IllegalArgumentException("Invalid Driver");
		}
	}
	
	public static void quitDriver() {
		if(driver.get()!=null) {
			driver.get().quit();
			driver.remove();
		}
	}
}
