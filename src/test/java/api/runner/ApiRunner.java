package api.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},


        tags = "@getRequest",

        features="src/test/resources/apiFeatures",

        glue="api/stepDef",

        dryRun=false

)
public class ApiRunner {

}
