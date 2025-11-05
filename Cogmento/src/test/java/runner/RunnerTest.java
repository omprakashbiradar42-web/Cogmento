package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features= 
			{
				"src/test/java/featureFiles/TC_001_ContactPageCogmentoCRM.feature",
				"src/test/java/featureFiles/TC_002_DealsPageCogmentoCRM.feature"
				},
		
		glue="stepDefinitions",
		dryRun=false,
		monochrome=true,
		plugin="com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		
		)


public class RunnerTest{

}
