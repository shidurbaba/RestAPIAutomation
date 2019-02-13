package muskesapiTutorial;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;


public class Delete_RestAPI {

    //this is the tutorial example from Mukesh's video
    // https://www.youtube.com/watch?v=7RUzarUREpo
    @Test
    public void test1(){
        RequestSpecification request = RestAssured.given();

        Response response = request.delete("http://localhost:3000/posts/103");

        int code = response.getStatusCode();

        System.out.println("My reponse : " + code);


    }



}
