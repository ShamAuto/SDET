package com.sdettraining.authorizationToken;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sdettraining.basetest.BaseTest;
import com.sdettraining.util.Util;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class AuthToken extends BaseTest {

	public static String getToken() throws JsonParseException, JsonMappingException, IOException {
		Response resp = RestAssured.given().baseUri(Util.configReader("auth.url")).accept(ContentType.JSON)
				.header("Authorization", "Basic " + Util.configReader("token.value")).when()
				.post("/oauth2/token/client_credentials");
		String sBody = resp.body().asString();
		sBody = sBody.replace(Util.configReader("sRemove"), "");
		System.out.println(sBody);
		ObjectMapper obj = new ObjectMapper();
		TokenResponse tokenResponse = obj.readValue(sBody, TokenResponse.class);
		String accesstoken = tokenResponse.data.access_token;
		System.out.println("the access token is :- " + accesstoken);
		applog.info("the access token is :- " + accesstoken);
		return accesstoken;
	}

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		AuthToken.getToken();
	}
}
