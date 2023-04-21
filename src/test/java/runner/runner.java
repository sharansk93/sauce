package runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions(features="src/test/java/feature/sauce.feature",
glue="com.stepdefinition",plugin="json:target/sauce.json")
public class runner {

}
