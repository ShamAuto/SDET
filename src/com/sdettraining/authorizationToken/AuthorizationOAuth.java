package com.sdettraining.authorizationToken;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sdettraining.util.Util;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class AuthorizationOAuth {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

		/*
		 * String
		 * sRemove="<b>Warning</b>: mysqli::mysqli(): Headers and client library minor version mismatch. Headers:100508 Library:100236 in <b>/home/u942925711/domains/upskills.in/public_html/rest-api/system/library/db/mysqli.php</b> on line <b>7</b>"
		 * ; Response resp=RestAssured //GIVEN .given() .baseUri(
		 * "http://rest-api.upskills.in/api/rest_admin/oauth2/token/client_credentials")
		 * .accept(ContentType.JSON) .header(
		 * "Authorization","Basic dXBza2lsbHNfcmVzdF9hZG1pbl9vYXV0aF9jbGllbnQ6dXBza2lsbHNfcmVzdF9hZG1pbl9vYXV0aF9zZWNyZXQ="
		 * ) //WHEN .when() .post(); String sBody=resp.body().asString();
		 * 
		 * sBody=sBody.replace(sRemove, ""); System.out.println(sBody);
		 * ObjectMapper obj = new ObjectMapper(); TokenResponse tokenResponse =
		 * obj.readValue(sBody, TokenResponse.class); String accesstoken =
		 * tokenResponse.data.access_token;
		 * System.out.println("the access token is :- " + accesstoken);
		 */

		System.out.println(AuthorizationOAuth.getToken());
	}

	public static String getToken() throws JsonParseException, JsonMappingException, IOException {
		/*
		 * String sRemove =
		 * "<b>Warning</b>: mysqli::mysqli(): Headers and client library minor version mismatch. Headers:100508 Library:100236 in <b>/home/u942925711/domains/upskills.in/public_html/rest-api/system/library/db/mysqli.php</b> on line <b>7</b>"
		 * ;
		 */
		Response resp = RestAssured

				.given().baseUri(Util.configReader("auth.url")).accept(ContentType.JSON)
				.header("Authorization", "Basic " + Util.configReader("token.value")).when()
				.post("/oauth2/token/client_credentials");
		String sBody = resp.body().asString();

		sBody = sBody.replace(Util.configReader("sRemove"), "");
		System.out.println(sBody);
		ObjectMapper obj = new ObjectMapper();
		TokenResponse tokenResponse = obj.readValue(sBody, TokenResponse.class);
		String accesstoken = tokenResponse.data.access_token;
		// System.out.println("the access token is :- " + accesstoken);
		return accesstoken;
	}
}
