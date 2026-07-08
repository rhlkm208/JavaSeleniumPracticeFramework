package TestPractice;

import org.testng.annotations.Test;

public class Base_TestClass extends Base_Test{
	
	
	
	@Test
	public void testLogin() {
		Base_PageClass bt = new Base_PageClass(driver);
		bt.login("username@123", "pwd@123");
	}

}
