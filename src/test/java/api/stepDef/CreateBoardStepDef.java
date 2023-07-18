package api.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import ui.utilities.ConfigReader;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class CreateBoardStepDef  extends TestBaseApi {
    Response response;
    JsonPath json;

    @Given("send request for create {string} board")
    public void send_request_for_create_board(String boardName) {
        setup();
        spec.pathParams("parametre1",1,"parametre2","boards");

        HashMap<String,String>requestBody=new HashMap<>();

        requestBody.put("name",boardName);
        requestBody.put("key", ConfigReader.getProperty("key"));
        requestBody.put("token",ConfigReader.getProperty("token"));

        response=given().
                contentType("application/json").
                spec(spec).body(requestBody).when().
                post("/{parametre1}/{parametre2}");

        response.prettyPrint();



    }
    @And("Assert status code is {int}")
    public void assertStatusCodeIs(int statusCode) {
        Assert.assertEquals(statusCode,response.getStatusCode());

    }

    @Then("Assert board name is {string}")
    public void assert_board_name_is(String boardName) {
        json=response.jsonPath();
        Assert.assertEquals(boardName,json.getString("name"));

    }


}
