package TestCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@DataProvider(name = "loginData")
	public Object[][] loginData(){
		return new Object[][] {
			
			{"admin", "pwd", "DashboardPage"},
			{"admin1", "pwd1", "HomePage"}
		};
	}

	@Test(dataProvider = "loginData")
	public void TestLoginData(
            String email,
            String password,
            String expectedPage) {
		
		
		System.out.println(email + password + expectedPage );
	}
	
	
}
