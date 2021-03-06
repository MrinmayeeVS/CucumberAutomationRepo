package com.basic.shareDataSD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class SharedClass {
	
	WebDriver driver;
	
	@Before
	public WebDriver setUp() {
		
		if(driver == null) {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		}
		return driver;
	}
	
	@After
	public void tearDown() {
		driver.close();
		driver = null;
	}

}
