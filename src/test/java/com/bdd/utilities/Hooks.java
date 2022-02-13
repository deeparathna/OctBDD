package com.bdd.utilities;

import com.bdd.stepdefinition.TestExecutor;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends TestExecutor{
	
	
	@Before(order=1)
	public void validatebeforescenario()
	{
		System.out.println("Pre condition1");
	}
	
	
	@Before(order=2)
	public void preconditionscenario()
	{
		System.out.println("Pre condition2");
	}
	
	
	
	@After(order=1)
	public void postcondition()
	{
		System.out.println("post condition1");
	}
	
	
	
	
	@After(order=2)
	public void postcondition1()
	{
		System.out.println("post condition2");
	}
	
	@Before("@Smoke")
	public void preconditionsmoke()
	{
		System.out.println("pre condition for smoke");
	}
	
	
	@After("@Smoke")
	public void postconditionsmoke()
	{
		System.out.println("post condition for smoke");
	}
	
	@Before("@test")
	public void preconditiontest()
	{
		System.out.println("pre condition for test");
	}
	
	@After("@test")
	public void postconditiontest()
	{
		System.out.println("post condition for test");
	}


}
