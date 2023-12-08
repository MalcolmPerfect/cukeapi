package cukeapi;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", plugin = { "pretty",
        "json:target/cucumber.json" }, snippets = CucumberOptions.SnippetType.CAMELCASE, glue = "cukeapi.stepdef")
public class CucumberTest {

}
