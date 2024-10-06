package com.project.ex_15092024_Crud.GET;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class NonBddStyleGET {
   static RequestSpecification r= RestAssured.given();

    public static void main(String[] args) {
        //  r.useRelaxedHTTPSValidation("TLS""); - HTTPs related issued
        r.baseUri("https://api.zippopotam.us/");
        test_non_bdd_1();
        test_non_bdd_2();

    }
    private static void test_non_bdd_1(){
        r.basePath("/IN/263621");
        r.when().get();
        r.then().log().all().statusCode(404);
    }
    private static void test_non_bdd_2(){
        r.basePath("/IN/263");
        r.when().get();
        r.then().log().all().statusCode(200);
    }
}
