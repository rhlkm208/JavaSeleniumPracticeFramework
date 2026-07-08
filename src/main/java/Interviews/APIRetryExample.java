package Interviews;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APIRetryExample {
	
	private static final int maxretry = 3;
	private static final int retrydelay = 2000;
	
	public static Response executeWithRetry(String endpoint) {

		int attempt =0;
		Response response = null;
		
		while(attempt<maxretry) {
			attempt++;
			
			response = RestAssured
                    .given()
                    .header("Content-Type", "application/json")
                    .when()
                    .get(endpoint);
			
			int statusCode = response.getStatusCode();
			
			System.out.println("Attempt : " + attempt +
                    " | Status Code : " + statusCode);
			
			    if (statusCode == 401 ||statusCode == 402 ||
	                statusCode == 403 ||statusCode == 404) 
			    {

	                System.out.println("Transient Failure Detected. Retrying...");

	                try {
	                    Thread.sleep(retrydelay);
	                } catch (InterruptedException e) {
	                    Thread.currentThread().interrupt();
	                }

	            } else {
	                // Permanent success/failure, stop retrying
	                break;
	            }
	        }

	        return response;
	    }
			
	
	public static void main(String[] args) {

        Response response =
                executeWithRetry("https://api.example.com/users");

        System.out.println("Final Status Code : "
                            + response.getStatusCode());
    }
}
