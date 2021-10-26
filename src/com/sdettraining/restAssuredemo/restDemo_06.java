package com.sdettraining.restAssuredemo;
import java.io.File;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;
public class restDemo_06 {

      
	   public static void main(String[] args) {
		   
	  
		   File jsonFile=new File(System.getProperty("user.dir")+"/TestData/Auth.xml");
		   
	        Header acceptHeader=new Header("Content-Type", "application/xml");
	        Response response = RestAssured.given().header(acceptHeader).body(jsonFile).post("https://restful-booker.herokuapp.com/auth");
	        response.body().prettyPrint();    
	   response.jsonPath().get("token");
	  
	        
	    }
}


