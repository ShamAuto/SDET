package com.sdettraining.restAssuredemo;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class restDemo_08 {

	public static void main(String[] args) {

		String sRemove="<b>Warning</b>: mysqli::mysqli(): Headers and client library minor version mismatch. Headers:100508 Library:100236 in <b>/home/u942925711/domains/upskills.in/public_html/rest-api/system/library/db/mysqli.php</b> on line <b>7</b>";
		
		Response resp=RestAssured
						.given()
								.baseUri("http://rest-api.upskills.in/api/rest_admin/oauth2/token/client_credentials")
								.accept(ContentType.JSON)
								.header("Authorization","Basic dXBza2lsbHNfcmVzdF9hZG1pbl9vYXV0aF9jbGllbnQ6dXBza2lsbHNfcmVzdF9hZG1pbl9vYXV0aF9zZWNyZXQ=")
						.when()
								.post();
		
		String sBody=resp.body().asString();
		String sBody1=sBody.replace(sRemove, "");
		String[] s=sBody1.split(",");
		String s1=sBody1.split(",")[2].split(":")[2];
		for (String s2:s)
		{
			System.out.println(s2);
		}
		System.out.println(s);
		
		System.out.println(s1);

	}
	
}
