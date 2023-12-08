package cukeskeleton.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.Logger;

import static org.junit.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;

import org.springframework.beans.factory.annotation.Autowired;

public class SecondStepDef {

    @Autowired
    SharedState sharedState;

    private static Logger logger = LogManager.getLogger(SecondStepDef.class);

    @Given("this is the second Scenario")
    public void thisIsTheSecondScenario() {
        // Write code here that turns the phrase above into concrete actions
        logger.info("the second scenario");
    }

    @Then("the message value is {string}")
    public void the_value_is(String message) {
        assertEquals(message, sharedState.getMessage());
        // Write code here that turns the phrase above into concrete actions
    }
}
