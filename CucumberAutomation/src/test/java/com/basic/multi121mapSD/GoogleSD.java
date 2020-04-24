package com.basic.multi121mapSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class GoogleSD {

	WebDriver driver;
	
	@Given("^User need to be on google page$")
	public void user_need_to_be_on_google_page(){

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.co.in");
	}

	@When("^User enters search string$")
	public void user_enters_search_string() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("Selenium");
		Thread.sleep(1000);
	}
}
