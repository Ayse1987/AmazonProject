package api.stepDef;

import io.cucumber.java.en.Given;
import io.restassured.response.Response;


public class CreateListSteps {
    Response response;
    @Given("send request for create list {string}")
    public void send_request_for_create_list(String string) {


    }
    @Given("Assert list name is {string}")
    public void assert_list_name_is(String string) {

    }

}
