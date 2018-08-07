package com.capg.loginpage.selenium_test_loginpage_test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"feature"},
		glue= {"com.capg.loginpage.stepdefinition"},
		tags= {"@execute"}
	)

public class loginpagetest {


	
}

