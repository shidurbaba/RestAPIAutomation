package stepDef;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;

public class StepDefinitions {
    JSONObject jsonObject;
    RequestSpecification request;
    Response response;
    @Given("^I am able to initialize header as \"([^\"]*)\" and header value as \"([^\"]*)\"$")
    public void iAmAbleToInitializeHeaderAsAndHeaderValueAs(String arg0, String arg1) throws Throwable {
        request = RestAssured.given();
        request.header(arg0, arg1);
        jsonObject = new JSONObject();
    }

    @Then("^I am able to put id as \"([^\"]*)\" and id# as \"([^\"]*)\"$")
    public void i_am_able_to_put_id_as_and_id_as(String arg1, String arg2) throws Throwable {
        jsonObject.put(arg1, arg2);
    }

    @Then("^I am able to put author as \"([^\"]*)\" and name of the author as \"([^\"]*)\"$")
    public void i_am_able_to_put_author_as_and_name_of_the_author_as(String arg1, String arg2) throws Throwable {
        jsonObject.put(arg1, arg2);
    }

    @Then("^I am able to put title as \"([^\"]*)\" and title name as \"([^\"]*)\"$")
    public void i_am_able_to_put_title_as_and_title_name_as(String arg1, String arg2) throws Throwable {
       jsonObject.put(arg1,arg2);
    }

    @Then("^I am able to put publisher as \"([^\"]*)\" and publisher name as \"([^\"]*)\"$")
    public void i_am_able_to_put_publisher_as_and_publisher_name_as(String arg1, String arg2) throws Throwable {
       jsonObject.put(arg1,arg2);
    }


    @Then("^I should get a response back from the backend$")
    public void iShouldGetAResponseBackFromTheBackend() throws Throwable {
         response = request.post("http://localhost:3000/posts");
            int code = response.getStatusCode();
        System.out.println("My reponse : " + code);
    }
}
