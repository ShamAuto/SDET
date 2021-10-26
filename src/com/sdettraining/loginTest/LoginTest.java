package com.sdettraining.loginTest;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sdettraining.authorizationToken.AuthorizationOAuth;
import com.sdettraining.loginTestPojo.LoginResponse;
import com.sdettraining.util.LogDemo_01;
import com.sdettraining.util.Util;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class LoginTest {
	static ObjectMapper obj = new ObjectMapper();
      
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		new LogDemo_01();
		String sRemoveLogin = "<b>Warning</b>: mysqli::mysqli(): Headers and client library minor version mismatch. Headers:100508 Library:100236 in <b>/home/u942925711/domains/upskills.in/public_html/rest-api/system/library/db/mysqli.php</b> on line <b>7</b>";
		File jsonFile = new File(System.getProperty("user.dir") + "/TestData/LoginData.json");

		Response resp1 = RestAssured

				.given().baseUri(Util.configReader("auth.url")).accept(ContentType.JSON)
				.contentType(ContentType.JSON).header("Authorization", "Bearer " + AuthorizationOAuth.getToken())
				.body(jsonFile).when().post("/login");

		String sloginBody = resp1.body().asString();

		LogDemo_01.applog().debug(sloginBody);
		String sLoginBodyresponse = sloginBody.replace(sRemoveLogin, "");
		LogDemo_01.applog().debug(sLoginBodyresponse);
		LoginResponse loginResponse = obj.readValue(sLoginBodyresponse, LoginResponse.class);
		LogDemo_01.applog().debug("Success       :-"+loginResponse.getSuccess());
		LogDemo_01.applog().debug("User_id       :-"+loginResponse.getData().getUser_id());
		LogDemo_01.applog().debug("User_group_id :-"+loginResponse.getData().getUser_group_id());
		LogDemo_01.applog().debug("Username      :-"+loginResponse.getData().getUsername());
		LogDemo_01.applog().debug("Firstname     :-"+loginResponse.getData().getFirstname());
		LogDemo_01.applog().debug("Lastname      :-"+loginResponse.getData().getLastname());
		LogDemo_01.applog().debug("Email         :-"+loginResponse.getData().getEmail());
		LogDemo_01.applog().debug("Ip            :-"+loginResponse.getData().getIp());
		LogDemo_01.applog().debug("Status        :-"+loginResponse.getData().getStatus());
		LogDemo_01.applog().debug("Date_added    :-"+loginResponse.getData().getDate_added());
		LogDemo_01.applog().debug("User_group    :-"+loginResponse.getData().getUser_group());
		LogDemo_01.applog().debug("Success       :-"+loginResponse.getSuccess());
	}

}
