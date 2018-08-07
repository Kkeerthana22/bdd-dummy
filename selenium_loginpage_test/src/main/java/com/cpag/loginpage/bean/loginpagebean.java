package com.cpag.loginpage.bean;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginpagebean {

	
	@FindBy(how=How.ID,id="username")
	private WebElement username;
	
	@FindBy(how=How.ID,id="password")
	private WebElement password;
	
	@FindBy(how=How.ID,id="submit")
	private WebElement submit;

	public void submit() {
		submit.click();
	}

	

	public String getUsername() {
		return username.getAttribute("value");
	}

	public void setUsername(String username) {
		this.username.sendKeys(username);
	}

	public String getPassword() {
		return password.getAttribute("value");
	}

	public void setPassword(String password) {
		this.password.sendKeys(password);
	}
	
}
