package com.bdd.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Demosite extends TestExecutor{
	
	
	@Given("Launch chrome browser and open URL {string}")
	public void launch_chrome_browser_and_open_URL(String url) {
	    
        System.setProperty("Webdriver.chrom.driver","C:\\Users\\friends\\eclipse-workspace\\SeleniumProject\\Exe\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

	@When("user clicks the firstname and enter the value {string}")
	public void user_clicks_the_firstname_and_enter_the_value(String firstName) throws IOException {
	 reg.enterFristname(firstName);
	}

	@When("user clicks the lastname and enter the value {string}")
	public void user_clicks_the_lastname_and_enter_the_value(String lastName) throws IOException {
	  reg.enterLastname(lastName);  
	}

	@When("user clicks the address and enter the values {string}")
	public void user_clicks_the_address_and_enter_the_values(String Address) throws IOException {
	  reg.enteraddress(Address);
	}

	@When("user clicks the emailaddress and enter the value {string}")
	public void user_clicks_the_emailaddress_and_enter_the_value(String emailid) throws IOException {
	   reg.enteremail(emailid);
	}

	@When("user clicks the phone and enter the value {string}")
	public void user_clicks_the_phone_and_enter_the_value(String phone) throws IOException {
	    reg.enterphonenum(phone);
	}

	@Then("user validate the page title as {string}")
	public void user_validate_the_page_title(String value) {
	  com.validatePageTitle(value);
	}



}
