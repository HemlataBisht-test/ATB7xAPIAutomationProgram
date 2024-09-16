package com.project.ex_15092024_CRUD.POST.CreateToken;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class NonBDDStylePOST {
    RequestSpecification r= RestAssured.given();
    // POST Request
    // URL - https://restful-booker.herokuapp.com/auth
    // BODY - PAYLOAD - JSON
    // {
     //   "username" : "admin",
     //  "password" : "password123"    }
    // HEADER - Content Type -> application/json
    @Test
    public void test_NonBdd_Post(){
        String payload= "{\n" +
                "        \"username\" : \"admin\",\n" +
                "       \"password\" : \"password123\"\n" +
                "    }";
        r.baseUri("https://restful-booker.herokuapp.com");
        // Given : Request Specification
        r.basePath("/auth");
        r.contentType(ContentType.JSON).log().all();
        r.body(payload);

        //When : Response
       Response response= r.when().post();

        //Then : Validation of response
        ValidatableResponse validatableResponse =response.then().log().all();
        validatableResponse.statusCode(200);



    }


}
