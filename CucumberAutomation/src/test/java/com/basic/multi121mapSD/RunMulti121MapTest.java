package com.basic.multi121mapSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true,
		dryRun = false,

		features = {"src/test/resources/com/basic/multi121mapFF/"},
		glue = {"com/basic/multi121mapSD/"},

		plugin = {"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-reportMulti121.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReportMulti121.html"
		}
		)

public class RunMulti121MapTest {



}
