package runners;


	
	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(features = {"src//test//resources//Features//order1.feature"}
	,glue = "stepDefs",
	monochrome=true,
	dryRun = false

	)
	public class placeorderrunner1 extends AbstractTestNGCucumberTests {
	}



