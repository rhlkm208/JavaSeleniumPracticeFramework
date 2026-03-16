package SeleniumTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DatePicker {

    public WebDriver driver;

    @FindBy(id = "txtDate")
    WebElement DateTextBox;

    @FindBy(className = "ui-datepicker-year")
    WebElement YearDropDown;

    @FindBy(className = "ui-datepicker-month")
    WebElement MonthDropdown;

    @FindBy(xpath = "//table[@class='ui-datepicker-calendar']//a[text()='8']")
    WebElement DateSelect;

    // ✅ Default constructor (implicitly present)
    public DatePicker() {
        // TestNG is happy now
    }

    @BeforeMethod
    public void browserLaunch() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        

        // ✅ Initialize PageFactory AFTER driver is created
        PageFactory.initElements(driver, this);
    }

    @Test
    public void DateSelection() {

        DateTextBox.click();

        Select year = new Select(YearDropDown);
        year.selectByValue("2027");

        Select month = new Select(MonthDropdown);
        month.selectByValue("4");

        DateSelect.click();

        // For input box → getAttribute("value"), NOT getText()
        String DOB = DateTextBox.getAttribute("value");
        Assert.assertEquals(DOB, "08/05/2027");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
