package com.basic.shareDataSD;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ShareDataStepDef_1 {

	WebDriver driver;
	
	public ShareDataStepDef_1(SharedClass share) {
		// TODO Auto-generated constructor stub
		driver = share.setUp();
	}

	@And("^User enters user \"([^\"]*)\" surname$")
	public void user_enters_user_surname(String surName) throws InterruptedException{

		driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys(surName);
		Thread.sleep(1000);
	}

	@Then("^User checks user \"([^\"]*)\" first name is present$")
	public void user_checks_user_first_name_is_present(String firstName) throws InterruptedException{

		String userNameActual = driver.findElement(By.xpath("//*[@name='firstname']")).getAttribute("value");
		Assert.assertEquals(firstName, userNameActual);
		Thread.sleep(1000);
	}

	@And("^User checks user \"([^\"]*)\" surname is present$")
	public void user_checks_user_surname_is_present(String surName) throws InterruptedException{

		String surNameActual = driver.findElement(By.xpath("//*[@name='lastname']")).getAttribute("value");
		Assert.assertEquals(surName, surNameActual);
		Thread.sleep(1000);
	}

	@Then("^User mobile field should be blank$")
	public void user_mobile_field_should_be_blank() throws InterruptedException{

		String mobileNoActual = driver.findElement(By.xpath("//*[@name='reg_email__']")).getAttribute("value");
		Assert.assertEquals("", mobileNoActual);
		Thread.sleep(1000);
	}


}
