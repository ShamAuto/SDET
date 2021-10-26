package com.sdettraining.restAssuredemo;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;
public class restDemo_02 {


	    public static void main(String[] args) {
	        
	        Header headers=new Header("accept", "application/json"); 
	        Response response=RestAssured.given().header(headers).get("https://restful-booker.herokuapp.com/booking/1");
	       System.out.println(response.getBody().asString());
	        /*String resbody=response.getBody().print();
            System.out.println(resbody);*/
	    }
	}


