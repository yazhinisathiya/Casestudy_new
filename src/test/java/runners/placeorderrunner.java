package runners;


	
	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(features = {"src//test//resources//Features//Order.feature"}
	,glue = "stepDefs",
	monochrome=true,
	dryRun = false

	)
	public class placeorderrunner extends AbstractTestNGCucumberTests {
	}


