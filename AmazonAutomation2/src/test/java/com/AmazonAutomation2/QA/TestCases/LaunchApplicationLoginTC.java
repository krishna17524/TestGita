package com.AmazonAutomation2.QA.TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.AmazonAutomation2.QA.BaseClass.BaseClass;
import com.AmazonAutomation2.QA.PageObjects.LoginPageObjects;

public class LaunchApplicationLoginTC extends BaseClass
{
	/*
	 * Author: sanka krishna bhaskar
	 * Date Created:-04-12-2022
	 * declaration of class variables  
	 * built id:-
	 * Testcase id:-
	 */
	public LoginPageObjects lpo;
	
	/*
	 * Author: sanka krishna bhaskar
	 * Date Created:-04-12-2022
	 * initializing variables inside method  
	 * built id:-
	 * Testcase id:-
	 */
	@BeforeMethod
	@Test
	public void createObjects()
	{
		lpo=new LoginPageObjects();
	}
	
	/*
	 * Author: sanka krishna bhaskar
	 * Date Created:-04-12-2022
	 * method with functionality of  login and logout
	 * built id:-
	 * Testcase id:-
	 */
	@Test
	public void performLaunchLoginApplication()
	{
		lpo.launchApplication();
		driver.manage().window().maximize();
		lpo.loginApplication();
		lpo.logout();
		driver.quit();
	}
	
}
