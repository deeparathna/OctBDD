package com.bdd.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bdd.stepdefinition.TestExecutor;

public class RegisterationPage extends TestExecutor {
	
	
	
	public String Fristname = "//input[@placeholder='First Name']";
	public String Lastname = "//input[@placeholder='Last Name']";
	public String Address = "//textarea[@ng-model='Adress']";
	public String emailid = "//input[@type='email']";
	public String phonenum = "//input[@type='tel']";
	
	
	public void enterFristname(String fristName) throws IOException  {
		
		com.enterValue(By.xpath(reg.Fristname), fristName);
	
	}
	
	public void enterLastname(String lastName) throws IOException  {
		
		 com.enterValue(By.xpath(Lastname), lastName);
	}
	
	public void enteraddress(String Addresss) throws IOException  {
		
		  com.enterValue(By.xpath(Address), Addresss);
					
	}
	
	public void enteremail(String emailId) throws IOException {
		
		 com.enterValue(By.xpath(emailid), emailId);
			
		
	}
	
	public void enterphonenum(String phone) throws IOException {
	
		com.enterValue(By.xpath(phonenum), phone);
		
	
	}

}
