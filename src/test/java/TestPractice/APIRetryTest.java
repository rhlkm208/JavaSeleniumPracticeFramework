package TestPractice;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APIRetryTest {

	private static final int MAX_RETRY = 3;

	public Response executeApiWithRetry() {
		int count = 0;
		Response response = null;
		boolean success = false;

		// Set your base URI globally or locally
		RestAssured.baseURI = "https://api.example.com";

		while (count < MAX_RETRY && !success) {
			count++;
			System.out.println("Attempt " + count + " execution started...");

			try {
				// Execute the API request
				response = 
						RestAssured
						.given()
						.header("Content-Type", "application/json") // .body(yourBody) // Add body if it's a POST/PUT request
						.when()
						.get("/your-endpoint"); // Or .post(), .put(), etc.

				int statusCode = response.getStatusCode();
				System.out.println("Received Status Code: " + statusCode);

				// Check if it's a client error (4xx) or server error (5xx)
				if (statusCode >= 400 && statusCode < 500) {
					System.out.println("Error encountered (" + statusCode + "). Retrying...");
					// Optional: Add a short pause (e.g., 1-2 seconds) before retrying
					Thread.sleep(1000);
				} else {
					// Success! (Usually 200, 201, etc.)
					System.out.println("API call successful!");
					success = true;
				}

			} catch (Exception e) {
				System.out.println("Request failed due to network exception: " + e.getMessage());
				// Loop continues to retry if an exception occurs (like a timeout)
			}
		}

		if (!success) {
			System.out.println("API failed completely after " + MAX_RETRY + " attempts.");
		}

		return response; // Returns final response object back to your test
	}

	public static void main(String[] args) {
		APIRetryTest tester = new APIRetryTest();
		tester.executeApiWithRetry();
	}
}