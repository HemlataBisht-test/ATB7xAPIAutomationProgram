package com.project.ex_15092024_Crud.POST.CreateBooking;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class CreateBookingBDD_POST {
    // POST Request
    // URL - https://restful-booker.herokuapp.com/booking
    // BODY - PAYLOAD - JSON
   /* {
        "firstname" : "Jim",
            "lastname" : "Brown",
            "totalprice" : 111,
            "depositpaid" : true,
            "bookingdates" : {
        "checkin" : "2018-01-01",
                "checkout" : "2019-01-01"
    },
        "additionalneeds" : "Breakfast"
    } */
    // HEADER - Content Type -> application/json

    @Test
    public void test_CreateBooking_POST(){
        String payload="{\n" +
                "    \"firstname\" : \"Jim\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}'";
        RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
                .basePath("/booking").contentType(ContentType.JSON).log().all()
                .when().body(payload).post()
                .then().log()
                .all().statusCode(200);

    }
}
