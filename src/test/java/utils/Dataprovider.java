package utils;

import org.testng.annotations.DataProvider;

public class Dataprovider {

    @DataProvider(name = "excelData")
    public Object[][] getExcelData() {
        String path = System.getProperty("user.dir") + "/src/test/resources/TestData.xlsx";
        return ExcelReader.getTestData(path, "Sheet1");
    }
}
