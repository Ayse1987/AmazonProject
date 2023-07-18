package api.stepDef;

import api.trellopojos.RequestPojo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import ui.utilities.ConfigReader;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class GetBoardPOJOSteps extends TestBaseApi{

    Response response;
    JsonPath jsonPath;
    CreateBoardPOJO createBoardPOJO;
   // RequestPojo requestPojo;

    @Given("GET request for board created on Trello with id {string}")
    public void get_request_for_board_created_on_trello_with_id(String id) {
        setup();
        spec.pathParams("parametre1","boards","parametre2","Mb4ZFKOh").
               queryParams("key", ConfigReader.getProperty("key"),"token",ConfigReader.getProperty("token"));



       // String url="https://api.trello.com/1/boards/Mb4ZFKOh/?key=51ece39c5b63ea6a0f9d3eaf4c1b0596&token=94b94de31099560834c336891817008002d429d78a2f40cd7c38987d56a52d2c";
        response=given().contentType("application/json").spec(spec).
                when().get("/{parametre1}/{parametre2}")
               .then().contentType(ContentType.JSON)
                .extract()
               .response();

        response.prettyPrint();



    }
    @Given("get response")
    public void get_response() {

    }
    @Then("assert that board name is {string}")
    public void assert_that_board_name_is(String string) {

    }




}
