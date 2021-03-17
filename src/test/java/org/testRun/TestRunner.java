package org.testRun;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\login.feature", glue = "org.stepdefn", dryRun = false, monochrome = true)

public class TestRunner {

}
