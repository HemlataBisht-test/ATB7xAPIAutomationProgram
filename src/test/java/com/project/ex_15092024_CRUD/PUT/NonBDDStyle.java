package com.project.ex_15092024_CRUD.PUT;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class NonBDDStyle {
    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;
    Response response;
    //6118
    //Token
    //Payload
    //    "firstname" : "Hemlata",
    //    "lastname" : "Bisht",
    //    "totalprice" : 111,
    //    "depositpaid" : true,
    //    "bookingdates" : {
    //        "checkin" : "2018-01-01",
    //        "checkout" : "2019-01-01"
    //    },
    //    "additionalneeds" : "Breakfast"
    //}

    // POST - Auth - token
    // POST - Booking ID
    // PUT - token and BookingID
    @Test
    public void test_put_positive_tc(){
        // POST - Auth - token
        String payload_token="\"firstname\": \"Jim\",\n" +
                "        \"lastname\": \"Brown\"";
        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath();
        requestSpecification.contentType(ContentType.JSON);
    }


//    public void get_token(){
//
//    }
//
//    public void get_booking_id(){
//        return bookingid;
//    }
}
