package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReaderNew {

	private static Properties prop;
	
	static {
		loadProperties();
	}
	
	private static void loadProperties() {
		
		prop = new Properties();
		
		String configPath = System.getProperty("user.dir")+File.separator+"src/test/resources/config.properties";
		
		try (
		FileInputStream fis = new FileInputStream(configPath)){
		prop.load(fis);
		}
		catch(IOException e) {
			e.printStackTrace();
			throw new RuntimeException("congig file not found");
		}
	}
	
	public static String getProperty(String key) {
		return prop.getProperty(key);
	}
	
}
