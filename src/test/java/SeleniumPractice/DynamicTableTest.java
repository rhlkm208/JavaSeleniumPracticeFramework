package SeleniumPractice;

import org.testng.annotations.Test;

public class DynamicTableTest extends BaseTest{

//	public DynamicTablePage ele;
	
	@Test
	public void verifyDynamicTable() {
		DynamicTablePage ele = new DynamicTablePage(driver);
		ele.navigateToDynamicWebTablePage();
		ele.printTableHeader();
		ele.printTableData("Doe", "jdoe@hotmail.com");
		
	}

	
}
