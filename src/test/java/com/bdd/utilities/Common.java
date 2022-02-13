package com.bdd.utilities;

import org.openqa.selenium.By;

import com.bdd.stepdefinition.TestExecutor;

public class Common extends TestExecutor {
	
	public void enterValue(By loc,String value)
	{
		try
		{
			driver.findElement(loc).click();
			driver.findElement(loc).clear();
			driver.findElement(loc).sendKeys(value);
		}
		
		catch(Exception e)
		{
			System.out.println("Error occured" + e);
		}
		
}
	
	public void validatePageTitle (String value) 
	{
		 String title = driver.getTitle();
		   if(title.contains(value))
		   {
			   System.out.println("Navigate to "+value+"page");
		   }
		}
	 
	}

