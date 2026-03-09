package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ElementsActionsClass {
	WebDriver driver;
	
	public void SeleniumActionsClass() {
	    	
	 SeleniumActions actions = new SeleniumActions(driver);

	 // Using By
	 actions.click(By.id("loginBtn"));

	 // Using WebElement
	 WebElement submit = driver.findElement(By.id("submitBtn"));
	 actions.click(submit);
	 
	}

	
	public void ActionsClass() {
		WebElement menu = driver.findElement(By.id("menu"));
		Actions actions = new Actions(driver);
		actions.moveToElement(menu).perform();
		 
		WebElement source = driver.findElement(By.id("source"));
		WebElement target = driver.findElement(By.id("target"));
		actions.dragAndDrop(source, target).perform();
	}
	
	

	}

