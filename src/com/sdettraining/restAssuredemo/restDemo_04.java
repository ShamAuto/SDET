package com.sdettraining.restAssuredemo;

import com.sdettraining.pojoclass.AuthRequest;
import com.sdettraining.pojoclass.AuthResponse;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;

public class restDemo_04 {

	public static void main(String[] args) {

		AuthRequest authRequest = new AuthRequest();
		authRequest.setUsername("admin");
		authRequest.setPassword("password123");
		AuthResponse authResponse = new AuthResponse();

		Header acceptHeader = new Header("Content-Type", "application/json");
		Response response = RestAssured.given().header(acceptHeader).body(authRequest)
				.post("https://restful-booker.herokuapp.com/auth");
		response.body().prettyPrint();

		response.jsonPath().get("token");
		String tokenvalue = authResponse.getToken();
		System.out.println(tokenvalue);

	}
}
