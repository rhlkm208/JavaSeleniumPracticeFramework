package PracticeTest;

import io.restassured.builder.ResponseSpecBuilder;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class TestAPI {

	public static void main(String[] args) {

		HashMap<String, Integer> inventory = new HashMap<>();

		// 1. put() - Add/Update
		inventory.put("Laptop", 10);
		inventory.put("Mouse", 50);
		inventory.put("Keyboard", 30);
		inventory.put("Tablet", 50);
		inventory.put("Tablet", 60);
		System.out.println("Initial: " + inventory);

		// 8. getOrDefault()
		int tablets = inventory.getOrDefault("Tablet", 0);
		System.out.println("getOrDefault('Tablet', 0): " + tablets);

	}

}
