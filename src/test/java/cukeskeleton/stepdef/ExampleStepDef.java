package cukeskeleton.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import cukeskeleton.CucumberSpringConfiguration;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = { CucumberSpringConfiguration.class })
public class ExampleStepDef {

    private static Logger logger = LogManager.getLogger(ExampleStepDef.class);

    @Autowired
    SharedState sharedState;

    @Given("this is the first Scenario")
    public void thisIsTheFirstScenario() {
        logger.info("Running first scenario");

    }

    @When("we run cucumber")
    public void weRunCucumber() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        logger.debug("second step def");
    }

    @Then("this scenario is executed")
    public void thisScenarioIsExecuted() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        logger.error("oops an error");
    }

    @When("the message {string} is specified")
    public void the_value_is_specified(String message) {
        sharedState.setMessage(message);
        // Write code here that turns the phrase above into concrete actions
    }

}
