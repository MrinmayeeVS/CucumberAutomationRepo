package com.basic.datadrivenSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true,
		dryRun = false,

		features = {"src/test/resources/com/basic/datadrivenFF/"},
		glue = {"com/basic/datadrivenSD/"},

		plugin = {"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-reportDataDriven.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReportDataDriven.html"
		}
		)

public class RunDataDrivenTest {



}
