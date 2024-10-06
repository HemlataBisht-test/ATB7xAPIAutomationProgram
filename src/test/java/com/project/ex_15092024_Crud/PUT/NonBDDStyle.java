package com.project.ex_15092024_Crud.PUT;

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
    public void get_token(){

    }
    public void get_bookingid(){

    }

    @Test
    public void test_put_positive_tc(){
        // POST - Auth - token
        String token ="c8b53e70bcc2ef5";
        String bookingid= "2593";
        String payloadPUT= "{\n" +
                "    \"firstname\" : \"Hemlata\",\n" +
                "    \"lastname\" : \"Bisht\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : false,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2024-01-01\",\n" +
                "        \"checkout\" : \"2024-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Lunch\"\n" +
                "}";
        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("/booking/"+bookingid);
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.cookie("token",token);
        requestSpecification.body(payloadPUT).log().all();

        response = requestSpecification.when().put();

        // Verification
        validatableResponse =response.then().log().all();
        validatableResponse.statusCode(200);

    }


//    public void get_token(){
//
//    }
//
//    public void get_booking_id(){
//        return bookingid;
//    }
}
