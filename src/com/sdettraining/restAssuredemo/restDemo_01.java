package com.sdettraining.restAssuredemo;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import io.restassured.RestAssured;
import io.restassured.config.RestAssuredConfig;
import io.restassured.response.Response;
public class restDemo_01 {


	    public static void main(String[] args) {
	        System.out.println("started");
	        assertThat(RestAssured.config(), instanceOf(RestAssuredConfig.class));
	        System.out.println("ended");
	         
	        Response response=RestAssured.given().get("https://restful-booker.herokuapp.com/ping");
	        System.out.println(response.getBody().asString());
	        
	    }
	}


