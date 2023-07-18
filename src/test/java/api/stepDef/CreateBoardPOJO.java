package api.stepDef;

import api.trellopojos.CreatedBoard;
import api.trellopojos.RequestPojo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import ui.utilities.ConfigReader;

import static io.restassured.RestAssured.given;

public class CreateBoardPOJO extends TestBaseApi{

    Response response;
    CreatedBoard createdBoard;


    @Given("POST request for create board {string} with Pojo")
    public void postRequestForCreateBoardWithPojo(String boardName) {
        RequestPojo requestPojo=new RequestPojo(boardName, ConfigReader.getProperty("key"),ConfigReader.getProperty("token"));

     setup();
     spec.pathParams("param1",1,"param2","boards");

     response=given().contentType("application/json").
             spec(spec).body(requestPojo).
             when().post("/{param1}/{param2}");
     response.prettyPrint();

    }
    @Given("get response with pojo")
    public void get_response_with_pojo() {
        //jasonschema2pojo
        createdBoard=response.as(CreatedBoard.class);

    }
    @Then("assert response {string}")
    public void assertResponse(String boardName) {
        createdBoard=response.as(CreatedBoard.class);
        System.out.println(createdBoard.getPrefs().getComments());
    }



}
