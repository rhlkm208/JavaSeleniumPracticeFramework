package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	// ── Single Properties instance ────────────────────
	private static Properties properties;

	// ── Load properties on class load ─────────────────
	static {
		loadProperties();
	}

	// ── Load correct env file ──────────────────────────
	private static void loadProperties() {

		properties = new Properties();

		// Step 1 — Read env from system property
		// -Denv=qa passed in maven command
		// Default to qa if not passed
		String env = System.getProperty("env", "qa");

		System.out.println("Environment : " + env);

		// Step 2 — Build file path
		String filePath = "src/test/resources/config/" + env + ".properties";

		System.out.println("Loading file: " + filePath);

		// Step 3 — Load file
		try (FileInputStream fis = new FileInputStream(filePath)) {

			properties.load(fis);
			System.out.println("Config loaded ✅");

		} catch (IOException e) {
			throw new RuntimeException("File not found: " + filePath + " ❌", e);
		}
	}

	// ── Get any property by key ────────────────────────
	public static String get(String key) {

		// Step 1 — Check system property first
		// -Dbrowser=firefox overrides file value
		String systemValue = System.getProperty(key);

		if (systemValue != null && !systemValue.isEmpty()) {
			System.out.println(key + " from system: " + systemValue);
			return systemValue;
		}

		// Step 2 — Read from properties file
		String fileValue = properties.getProperty(key);

		if (fileValue == null) {
			throw new RuntimeException("Key not found: " + key + " ❌");
		}

		return fileValue;
	}

	// ── Specific getters ──────────────────────────────

	public static String getBrowser() {
		return get("browser");
	}

	public static String getUrl() {
		return get("url");
	}

	public static String getUsername() {
		return get("username");
	}

	public static String getPassword() {
		return get("password");
	}

	public static int getImplicitWait() {
		return Integer.parseInt(get("implicit.wait"));
	}

	public static int getExplicitWait() {
		return Integer.parseInt(get("explicit.wait"));
	}

	public static String getEnv() {
		return get("env");
	}

}