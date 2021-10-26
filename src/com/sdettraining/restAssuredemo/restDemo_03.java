package com.sdettraining.restAssuredemo;
import com.sdettraining.pojoclass.BookingDates;
import com.sdettraining.pojoclass.BookingResponse;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;
public class restDemo_03 {

 
	    public void main(String[] args) {
	     
	        Header acceptHeader=new Header("accept", "application/json");
	        Response response = RestAssured.given().header(acceptHeader).get("https://restful-booker.herokuapp.com/booking/1");
	        response.body().prettyPrint();
	        BookingResponse bookingResponse =response.as(BookingResponse.class);
	        System.out.println("Firstname:-"+bookingResponse.getFirstname());
	        System.out.println("Lastname :-"+bookingResponse.getLastname());
	        System.out.println("Totalprice :-"+bookingResponse.getTotalprice());
	        System.out.println("Depositpaid :-"+bookingResponse.isDepositpaid());
	        System.out.println("Additionalneeds :-"+bookingResponse.getAdditionalneeds());
	        BookingDates bookingdates = bookingResponse.getBookingdates();
	         System.out.println("checkin :-"+bookingdates.getCheckin());
	         System.out.println("checkout :-"+bookingdates.getCheckout());
	        
	    }
	}


