package PracticeUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	private static Properties prop;
	
	static {
		prop = new Properties();
		String Env = System.getProperty("env", "qa");
		
		String path = System.getProperty("user.dir")+ "/src/test/resources/" + Env+ ".properties";
		try {
			FileInputStream fis = new FileInputStream(path);
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String getProperty(String key) {
		return prop.getProperty(key);
	}

}
