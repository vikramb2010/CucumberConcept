package Cucumber;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import cucumber.api.junit.Cucumber.Options;

//import org.junit.runner.RunWith;

	@RunWith(Cucumber.class)//
	@Cucumber.Options(
			format = {"pretty", "vikram:target/cucumber.vikram"},
			features = {"src/cucumber/"}
				)	
	public class CucumberRunner {	
	}

