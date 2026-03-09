package driverLaunch;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    // ThreadLocal container — class level
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void initDriver(String browser) {

        // NO local variable — directly set into ThreadLocal
        if (browser.equalsIgnoreCase("chrome")) {
            driver.set(new ChromeDriver());

        } else if (browser.equalsIgnoreCase("firefox")) {
            driver.set(new FirefoxDriver());

        } else if (browser.equalsIgnoreCase("edge")) {
            driver.set(new EdgeDriver());

        } else {
            throw new IllegalArgumentException("Invalid browser: " + browser);
        }

        // Common config — called ONCE after driver is set
        configureDriver();
    }

    // Reusable — no duplication
    private static void configureDriver() {
        driver.get().manage().window().maximize();
        driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void quitDriver() {
        if (driver.get() != null) {  // ← Correct null check
            driver.get().quit();
            driver.remove();
        }
    }
}
