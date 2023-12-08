package cukeapi.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

import java.net.URI;
import java.util.Map;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import cukeapi.CucumberSpringConfiguration;
import io.cucumber.spring.CucumberContextConfiguration;
import static io.restassured.RestAssured.*;
import io.restassured.response.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

@CucumberContextConfiguration
@ContextConfiguration(classes = { CucumberSpringConfiguration.class })
public class PostcodeStepDef {

    private static Logger logger = LogManager.getLogger(PostcodeStepDef.class);

    @Autowired
    APISharedState sharedState;

    @When("request postcode {string} from {string}")
    public void requestPostcodeFromPostcodesIo(String postCode, String url) {
        logger.info("Requesting postcode {}", postCode);
        sharedState.setResponse(get(sharedState.getBaseURL() + url + "/{PostCode}", postCode));

    }

    @Then("the status is {int}")
    public void theStatusIs(int status) {
        assertEquals(sharedState.getResponse().statusCode(), status);
    }

    @Then("the result payload includes the data")
    public void theResultPayloadIncludesTheData(Map<String, String> expectedValues) {
        expectedValues.forEach((k, v) -> sharedState.getResponse().then().assertThat().body(k, equalTo(v)));
    }

    @Given("the base url {string}")
    public void theBaseUrl(String baseURL) {
        sharedState.setBaseURL(baseURL);
    }

}
