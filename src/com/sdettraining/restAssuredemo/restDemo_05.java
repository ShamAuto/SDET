package com.sdettraining.restAssuredemo;

import java.io.File;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;

public class restDemo_05 {

	public static void main(String[] args) {

	//	AuthResponse authResponse = new AuthResponse();
		File jsonFile = new File(System.getProperty("user.dir") + "/TestData/Auth.json");

		Header acceptHeader = new Header("Content-Type", "application/json");
		Response response = RestAssured.given().header(acceptHeader).body(jsonFile)
				.post("https://restful-booker.herokuapp.com/auth");
		response.body().prettyPrint();

		String token = response.jsonPath().get("token");
		System.out.println(token);
	/*	String tokenvalue = authResponse.getToken();
		System.out.println(tokenvalue);*/

	}
}
