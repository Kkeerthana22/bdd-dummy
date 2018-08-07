package com.capg.loginpage.stepdefinition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cpag.loginpage.bean.loginpagebean;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginpagestepdefinition {

	private WebDriver driver;
	private loginpagebean pageBean ;
	@Before
	public void testpage() {
	
	
		System.setProperty("webdriver.chrome.driver", "D:\\Srinivas-BDD\\Selenium\\chromedriver.exe");}
	
			

	@Given("^login using credentials username and password$")
	public void login_using_credentials_username_and_password() throws Throwable {
		driver = new ChromeDriver();
		driver.get("http://localhost:8081/selenium_loginpage_html/loginpage.html");
		driver.manage().window().maximize();
		pageBean= new loginpagebean();
		PageFactory.initElements(driver, pageBean);
		
	}
	

	@When("^username and password matches$")
	public void username_and_password_matches() throws Throwable {
	   pageBean.setUsername("keerthana");
	   pageBean.setPassword("karnati123");
	   pageBean.submit(); 
	}

	@Then("^submit button is clicked$")
	public void submit_button_is_clicked() throws Throwable {
	 
	   assertEquals("Google", driver.getTitle());
	   driver.close();
	   
	}

	
}
