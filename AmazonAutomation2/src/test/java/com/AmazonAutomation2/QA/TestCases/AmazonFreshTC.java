package com.AmazonAutomation2.QA.TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.AmazonAutomation2.QA.BaseClass.BaseClass;
import com.AmazonAutomation2.QA.PageObjects.AmazonFreshPageObjects;
import com.AmazonAutomation2.QA.PageObjects.LoginPageObjects;

public class AmazonFreshTC extends BaseClass

{	
	/*
	 * Author: sanka krishna bhaskar
	 * Date Created:-04-12-2022
	 * declaration of class variables  
	 * built id:-
	 * Testcase id:-
	 */
	public LoginPageObjects loginPO;
	public AmazonFreshPageObjects freshPO;
	
	
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
		loginPO=new LoginPageObjects();
		freshPO=new AmazonFreshPageObjects();
	}
	
	/*
	 * Author: sanka krishna bhaskar
	 * Date Created:-04-12-2022
	 * method with functionality of populating  past-purchases data under amazon fresh along with login and log out functionality 
	 * built id:-
	 * Testcase id:-
	 */
	@Test
	public void amazonFreshPastPurchasesData()
	{
		loginPO.launchApplication();
		loginPO.loginApplication();
		freshPO.amazonFreshPastPurchasesData();
		loginPO.logout();
		driver.quit();
	}
	
	
}
