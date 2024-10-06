package com.project.ex_15092024_Crud.Testing;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

@Test
public class Test001 {
    public void test_get(){
        RestAssured.given().baseUri("https://api.zippopotam.us")
                .basePath("/IN/560037")
                .when().log().all().get()
                .then().log().all().statusCode(200);
    }
}
