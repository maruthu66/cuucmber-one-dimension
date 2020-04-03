package stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources/feature/addTitle.feature",
                  glue ="stepdefinotion",
                   plugin="html:target")
public class TestRunner {

}
