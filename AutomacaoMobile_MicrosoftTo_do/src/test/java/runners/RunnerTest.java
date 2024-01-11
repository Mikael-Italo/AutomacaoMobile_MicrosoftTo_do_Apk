package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
	
	@RunWith(Cucumber.class)
	@CucumberOptions(
	        features = "classpath:features",
	        glue= {"stepDefinitions"},
	        tags = "@Login",
	        plugin = {"pretty", "html:target/cucumber-reports"},
	        monochrome = true,
	        dryRun = false
	        )

public class RunnerTest {

}
