package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Features/"},
glue ={"TestDefinitions"})
//tags ="@smoke",
       // plugin = {"json:target/cucumber.json","html:target/cucumber-html-report.html"})

public class WebRunner {
}
