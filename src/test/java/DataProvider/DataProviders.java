package DataProvider;

import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider(name = "excelData")
    public static Object[][] getExcelData() {

        String path = "src/test/resources/testdata.xlsx";
        return ExcelUtils.getExcelData(path, "Sheet1");
    }
    
    @DataProvider(name = "jsonData")
    public static Object[][] getJsonData() {

        String path = "src/test/resources/testdata.json";
        return JsonUtils.getJsonData(path);
    }
}