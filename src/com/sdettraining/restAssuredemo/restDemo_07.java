package com.sdettraining.restAssuredemo;

import java.io.File;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class restDemo_07 {

	public static void main(String[] args) {

		File jsonFile = new File(System.getProperty("user.dir") + "/TestData/Auth.json");

		RestAssured
		//GIVEN
			.given()
				.baseUri("https://restful-booker.herokuapp.com/auth")
				.contentType(ContentType.JSON)
				.body(jsonFile)
		//WHEN
			.when()
				.post()
		//THEN
			.then()
				.assertThat()
				.statusCode(200)
				.body("token.length()", Matchers.is(15));

	}
}
