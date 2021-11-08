package com.sdettraining.runnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @author 01983O744
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions (
	        features = "./src/com/sdettraining/feature"
	        ,glue = {"com.sdettraining.appiumsetpdefination"}
	        ,tags = {"@ApiDemosApplication"}
            ,plugin = {"html:target/site/cucumber-pretty"})

	public class RunnerCalss {
	
}



