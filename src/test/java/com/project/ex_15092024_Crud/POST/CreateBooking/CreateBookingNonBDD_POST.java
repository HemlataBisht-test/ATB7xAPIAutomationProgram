package com.project.ex_15092024_Crud.POST.CreateBooking;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class CreateBookingNonBDD_POST {
RequestSpecification r= RestAssured.given();
    // POST Request
    // URL - https://restful-booker.herokuapp.com/booking
    // BODY - PAYLOAD - JSON
    // {
    //    "firstname" : "Jim",
    //    "lastname" : "Brown",
    //    "totalprice" : 111,
    //    "depositpaid" : true,
    //    "bookingdates" : {
    //        "checkin" : "2018-01-01",
    //        "checkout" : "2019-01-01"
    //    },
    //    "additionalneeds" : "Breakfast"
    //}'
    // HEADER - Content Type -> application/json

    @Test
    public void test_NonBDD_POST(){
    String  payload ="{\n" +
                "    \"firstname\" : \"Jim\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";
    r.baseUri("https://restful-booker.herokuapp.com");
    r.basePath("/booking");
    r.contentType(ContentType.JSON).log().all();
    r.body(payload);

        Response response = r.when().post();
        ValidatableResponse validatableResponse =response.then().log().all();
        validatableResponse.statusCode(200);

    }

}
