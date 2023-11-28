package com.test.Runnerclass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/com/test/featurefile", glue= {"com.test.stepdefinition"},
monochrome=true,plugin= {"pretty", "html:target/cucumber/cucumber-reports.html"},dryRun=false,tags="@Given")

public class RunnerClass extends AbstractTestNGCucumberTests
{

}
