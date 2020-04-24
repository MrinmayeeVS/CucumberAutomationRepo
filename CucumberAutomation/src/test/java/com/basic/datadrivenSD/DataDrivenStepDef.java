package com.basic.datadrivenSD;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class DataDrivenStepDef {

	WebDriver driver;

	@Given("^User need to be on Facebook login page$")
	public void user_need_to_be_on_Facebook_login_page(){

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
	}

	@When("^User enters user \"([^\"]*)\" first name$")
	public void user_enters_user_first_name(String firstName) throws InterruptedException{

		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys(firstName);
		Thread.sleep(1000);
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

	@Then("^Close browser$")
	public void close_browser(){

		driver.close();
		driver=null;
	}

}
