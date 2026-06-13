package TestPractice;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;


public class APIJsonRequest {

	public void HashMapJson() {

	    RestAssured.baseURI = "https://reqres.in/api"; // sample API

	    HashMap<String, Object> map = new HashMap<>();
	    map.put("name", "Rahul");
	    map.put("age", 30);
	    map.put("course", "B.Tech");
	    map.put("mob", 9876543210L); // ✅ use long

	    given()
	        .contentType("application/json") // ✅ IMPORTANT
	        .body(map)
	    .when()
	        .post("/users") // ✅ endpoint required
	    .then()
	    .assertThat().body("data.email", equalTo("rahul@test.com"))
	        .statusCode(201)
	        .log().all();
	}
	
	public void jsonmethod() {
		Response res = given().get("https://reqres.in/api/users/2");
		int id = res.jsonPath().getInt("data_id");
	}

	public static void main(String[] args) {
		
		APIJsonRequest obj = new APIJsonRequest();
		obj.HashMapJson();
		

	}

}
