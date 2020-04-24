package com.basic.shareDataSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true,
		dryRun = false,

		features = {"src/test/resources/com/basic/shareDataFF/"},
		glue = {"com/basic/shareDataSD/"},

		plugin = {"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-reportShareData.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReportShareData.html"
		}
		)

public class RunShareDataTest {



}