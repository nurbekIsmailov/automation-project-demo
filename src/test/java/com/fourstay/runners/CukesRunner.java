package com.fourstay.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = "html:target/cucumber-reports",
		features = "src/test/resources/features", 
		glue = "com/fourstay/step_definitions", 

		tags = "@Staytest_125"
		dryRun = false
		
		/* clean version
		 * changed dryRun to false
		 * changed tag to Staytest_125
		 */
		
		// new push
		)
public class CukesRunner {

}
