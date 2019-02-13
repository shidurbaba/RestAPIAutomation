package muskesapiTutorial;

import com.qa.mukeshbase.BaseClass;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;


public class Post_RestAPI extends BaseClass {

    //this is the tutorial example from Mukesh's video
    // https://www.youtube.com/watch?v=7RUzarUREpo
    @Test
    public void test1(){
        logger = reporter.createTest("Posting RESTAPI Demo");

        logger.info("Intializing");
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");

        logger.info("Adding new values using jsonObject.put");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", "573");
        jsonObject.put("title", "TestNG");
        jsonObject.put("author", "Peris");
        jsonObject.put("publisher", "QA tester XML");

        logger.pass("Added new values successfully");

        request.body(jsonObject.toJSONString());

        logger.info("Getting a response");
        Response response = request.post("http://localhost:3000/posts");

        logger.info("Fetching response code");
        int code = response.getStatusCode();

        System.out.println("My reponse : " + code);
        logger.pass("My reponse : " + code);

    }



}
