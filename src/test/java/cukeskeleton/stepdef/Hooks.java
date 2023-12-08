package cukeskeleton.stepdef;

import io.cucumber.java.Scenario;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Hooks {
    //example of how to use hooks, note these can be tagged/ordered and also "after"

    private static Logger logger = LogManager.getLogger(Hooks.class);

    @BeforeAll
    public static void beforeAllScenarios() {
        logger.info("Before all scenarios");
    }

    @Before
    public void beforeScenario(Scenario scenario) {
        // Typically would put test setup activities in here (e.g. set up data
        logger.info("Before scenario {}", scenario.getName());
    }
}
