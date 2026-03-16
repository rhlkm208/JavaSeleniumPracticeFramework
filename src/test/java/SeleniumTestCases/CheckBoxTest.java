package SeleniumTestCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckBoxTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.tutorialspoint.com/selenium/practice/check-box.php");
    }

    @Test
    public void handleCheckBoxes() {

        // 🔹 1️⃣ Click Single Checkbox
        WebElement singleCheckBox = driver.findElement(By.id("c_bs_1"));
        singleCheckBox.click();

        // 🔹 Verify if selected
        if (singleCheckBox.isSelected()) {
            System.out.println("Single checkbox is selected");
        }

        // 🔹 2️⃣ Select Multiple Checkboxes
        driver.findElement(By.id("c_bs_2")).click();

        // 🔹 3️⃣ Select All Checkboxes dynamically
        List<WebElement> allCheckBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

        for (WebElement checkbox : allCheckBoxes) {
            if (!checkbox.isSelected()) {
                checkbox.click();
            }
        }

        System.out.println("All checkboxes selected successfully");

        // 🔹 4️⃣ Uncheck all checkboxes
        for (WebElement checkbox : allCheckBoxes) {
            if (checkbox.isSelected()) {
                checkbox.click();
            }
        }

        System.out.println("All checkboxes unselected successfully");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
