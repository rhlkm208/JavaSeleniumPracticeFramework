package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DynamicTablePage extends BasePage {

	private WebDriver driver;
	private By dynamicWebTableLink = By.xpath("//a[@href='/tables']");
	private By firstDynamicTableHeader = By.xpath("//table[@id='table1']/thead");
	private By firstDynamicTableData = By.xpath("//table[@id='table1']/tbody/tr");

	public DynamicTablePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		this.wait = new CommonWait(driver);
	}

	public void navigateToDynamicWebTablePage() {
		driver.findElement(dynamicWebTableLink).click();
	}

	public void printTableHeader() {
		String header = wait.waitForPresenceOfElement(firstDynamicTableHeader).getText();
		System.out.println(header);
	}

	public void printTableData(String lastNameOfRow, String emailOfRow) {

		List<WebElement> rows = driver.findElements(firstDynamicTableData);

		for (WebElement row : rows) {

			List<WebElement> cols = row.findElements(By.tagName("td"));
			String lastName = cols.get(0).getText();

			if (lastName.equals(lastNameOfRow)) {
				String email = cols.get(2).getText();
				System.out.println(email);
				cols.get(5).findElement(By.linkText("edit")).click();
				break;
			}
		}
	}
}
