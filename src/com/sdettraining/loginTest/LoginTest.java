package com.sdettraining.loginTest;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.sdettraining.authorizationToken.AuthToken;
import com.sdettraining.basetest.BaseTest;
import com.sdettraining.loginTestPojo.LoginResponse;
import com.sdettraining.util.Util;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class LoginTest  extends BaseTest{
	//static ObjectMapper obj = new ObjectMapper();
      
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		//new LogDemo_01();
		applog.debug("*************Login Test Started***************");
		//String sRemoveLogin = "<b>Warning</b>: mysqli::mysqli(): Headers and client library minor version mismatch. Headers:100508 Library:100236 in <b>/home/u942925711/domains/upskills.in/public_html/rest-api/system/library/db/mysqli.php</b> on line <b>7</b>";
		File jsonFile = new File(System.getProperty("user.dir") + "/TestData/LoginData.json");

		Response resp1 = RestAssured

				.given().baseUri(Util.configReader("auth.url")).accept(ContentType.JSON)
				.contentType(ContentType.JSON).header("Authorization", "Bearer " + AuthToken.getToken())
				.body(jsonFile).when().post("/login");

		String sloginBody = resp1.body().asString();

		applog.debug(sloginBody);
		String sLoginBodyresponse = sloginBody.replace(Util.configReader("sRemoveLogin"), "");
		applog.debug(sLoginBodyresponse);
		LoginResponse loginResponse = obj.readValue(sLoginBodyresponse, LoginResponse.class);
		applog.debug("Success       :-"+loginResponse.getSuccess());
		applog.debug("User_id       :-"+loginResponse.getData().getUser_id());
		applog.debug("User_group_id :-"+loginResponse.getData().getUser_group_id());
		applog.debug("Username      :-"+loginResponse.getData().getUsername());
		applog.debug("Firstname     :-"+loginResponse.getData().getFirstname());
		applog.debug("Lastname      :-"+loginResponse.getData().getLastname());
		applog.debug("Email         :-"+loginResponse.getData().getEmail());
		applog.debug("Ip            :-"+loginResponse.getData().getIp());
		applog.debug("Status        :-"+loginResponse.getData().getStatus());
		applog.debug("Date_added    :-"+loginResponse.getData().getDate_added());
		applog.debug("User_group    :-"+loginResponse.getData().getUser_group());
		applog.debug("Success       :-"+loginResponse.getSuccess());
		applog.debug("*************Login Test End***************");
	}

}
