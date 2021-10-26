package com.sdettraining.loginTest;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sdettraining.authorizationToken.AuthorizationOAuth;
import com.sdettraining.loginTestPojo.LoginResponse;
import com.sdettraining.util.Util;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class LoginOutTest {
	static ObjectMapper obj = new ObjectMapper();

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

		String sRemoveLogin = "<b>Warning</b>: mysqli::mysqli(): Headers and client library minor version mismatch. Headers:100508 Library:100236 in <b>/home/u942925711/domains/upskills.in/public_html/rest-api/system/library/db/mysqli.php</b> on line <b>7</b>";
		File jsonFile = new File(System.getProperty("user.dir") + "/TestData/LoginData.json");

		Response resp1 = RestAssured

				.given().baseUri(Util.configReader("auth.url")).accept(ContentType.JSON).contentType(ContentType.JSON)
				.header("Authorization", "Bearer " + AuthorizationOAuth.getToken()).body(jsonFile).when()
				.post("/login");

		String sloginBody = resp1.body().asString();

		System.out.println(sloginBody);
		String sLoginBodyresponse = sloginBody.replace(sRemoveLogin, "");
		System.out.println(sLoginBodyresponse);
		LoginResponse loginResponse = obj.readValue(sLoginBodyresponse, LoginResponse.class);
		System.out.println("Success       :-" + loginResponse.getSuccess());
		System.out.println("User_id       :-" + loginResponse.getData().getUser_id());
		System.out.println("User_group_id :-" + loginResponse.getData().getUser_group_id());
		System.out.println("Username      :-" + loginResponse.getData().getUsername());
		System.out.println("Firstname     :-" + loginResponse.getData().getFirstname());
		System.out.println("Lastname      :-" + loginResponse.getData().getLastname());
		System.out.println("Email         :-" + loginResponse.getData().getEmail());
		System.out.println("Ip            :-" + loginResponse.getData().getIp());
		System.out.println("Status        :-" + loginResponse.getData().getStatus());
		System.out.println("Date_added    :-" + loginResponse.getData().getDate_added());
		System.out.println("User_group    :-" + loginResponse.getData().getUser_group());
		
		
		Response resp2 = RestAssured

				.given().baseUri(Util.configReader("auth.url")).accept(ContentType.JSON).contentType(ContentType.JSON)
				.header("Authorization", "Bearer " + AuthorizationOAuth.getToken()).body(jsonFile).when()
				.post("/logout");

		String sloginBody2 = resp2.body().asString();

		System.out.println(sloginBody2);
	}

}
