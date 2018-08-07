package com.capg.seleniumbdd.BDD_with_selenium;

import static org.junit.Assert.*;

import java.util.logging.Logger;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleloginTest {
	
	static Logger logger = Logger.getLogger("AlertExamp.class");
	static WebDriver driver;
	
	@Before
		public  void init() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Srinivas-BDD\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	    	
@Test
public  void GoogleloginTest() {
	
	try {
		
		login_using_credentials_username_and_password();
		username_and_password_matches();
		homepage_display();
	} catch (Throwable e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

	@Given("^login using credentials username and password$")
	public static void login_using_credentials_username_and_password() throws Throwable {
		try {
			
		
		driver.get("https://github.com/login");
		Thread.sleep(2000);
		
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@When("^username and password matches$")
	public void username_and_password_matches() throws Throwable {
	   
		driver.findElement(By.name("login")).sendKeys("keerthihope22@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Keerthan@22");
		
	}

	@Then("^homepage display$")
	public void homepage_display() throws Throwable {
		driver.findElement(By.name("commit")).sendKeys(Keys.ENTER);
		Alert alert=driver.switchTo().alert();
		logger.info(alert.getText());
		alert.accept();
		logger.info("done");
	    
	}


}
