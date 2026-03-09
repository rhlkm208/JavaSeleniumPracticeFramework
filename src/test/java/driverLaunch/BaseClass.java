package driverLaunch;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass {

    @Parameters("browser")
    @BeforeMethod
    public void browserLaunch(@Optional("chrome") String browser) {
        DriverFactory.initDriver(browser);
        DriverFactory.getDriver().get("https://testautomationpractice.blogspot.com/");
    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}