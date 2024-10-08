package com.project.ex_15092024_Crud.POST.CreateToken;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class BDDStylePOST {
    // POST Request
    // URL - https://restful-booker.herokuapp.com/auth
    // BODY - PAYLOAD - JSON
    // {
    //    "username" : "admin",
    //    "password" : "password123"
    //}
    // HEADER - Content Type -> application/json
    @Test
    public void test_POST(){
        String payload  = "{\n" +
                "                    \"username\" : \"admin\",\n" +
                "                    \"password\" : \"password123\"\n" +
                "                }";
        //  Payload  - String(1%), Hashmap(4%), Classes( 95%)
        RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
                .basePath("/auth").contentType(ContentType.JSON).log().all().body(payload)
                .when().post()
                .then().log().all().statusCode(200);
    }
}
