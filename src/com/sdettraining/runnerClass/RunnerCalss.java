package com.sdettraining.runnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (
	        features = "./src/com/sdettraining/feature"
	        ,glue = {"com.sdettraining.setpdefination"}
	        ,tags = {"@RetailLoginTest", "@RetailRegistrationTest"})

	public class RunnerCalss {
}



