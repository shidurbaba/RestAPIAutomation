package muskesapiTutorial;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;


public class Put_RestAPI {

    //this is the tutorial example from Mukesh's video
    // https://www.youtube.com/watch?v=7RUzarUREpo
    @Test
    public void test1(){
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", "123");
        jsonObject.put("title", "marverHeroesStudioIncorporated");
        jsonObject.put("author", "Stan Lee");
        jsonObject.put("publisher", "Marverl Studio Productions");

        request.body(jsonObject.toJSONString());
        Response response = request.put("http://localhost:3000/posts/123");

        int code = response.getStatusCode();

        System.out.println("My reponse : " + code);


    }



}
