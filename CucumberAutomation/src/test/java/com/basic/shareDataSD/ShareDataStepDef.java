package com.basic.shareDataSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


public class ShareDataStepDef {

	WebDriver driver;
	
	public ShareDataStepDef(SharedClass share) {
		// TODO Auto-generated constructor stub
		driver = share.setUp();
	}

	@Given("^User need to be on Facebook login page$")
	public void user_need_to_be_on_Facebook_login_page(){

		driver.get("https://www.facebook.com/");
	}

	@When("^User enters user \"([^\"]*)\" first name$")
	public void user_enters_user_first_name(String firstName) throws InterruptedException{

		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys(firstName);
		Thread.sleep(1000);
	}


}
