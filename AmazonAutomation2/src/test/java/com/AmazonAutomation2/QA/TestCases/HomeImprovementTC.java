package com.AmazonAutomation2.QA.TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.AmazonAutomation2.QA.BaseClass.BaseClass;
import com.AmazonAutomation2.QA.PageObjects.HomeImprovementPageObjects;
import com.AmazonAutomation2.QA.PageObjects.LoginPageObjects;

public class HomeImprovementTC extends BaseClass
{
	
	/*
	 * Author: sanka krishna bhaskar
	 * Date Created:-04-12-2022
	 * declaration of class variables  
	 * built id:-
	 * Testcase id:-
	 */
	public LoginPageObjects loginPO;
	public HomeImprovementPageObjects HomeImprovementPO;
	
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
		HomeImprovementPO=new HomeImprovementPageObjects();
	}
	
	/*
	 * Author: sanka krishna bhaskar
	 * Date Created:-04-12-2022
	 * method with functionality searching cleaning and supplies under HomeImprovement category along with login and logout functionality 
	 * built id:-
	 * Testcase id:-
	 */
	@Test
	public void searchUnderHomeImprovements()
	{
		loginPO.launchApplication();
		loginPO.loginApplication();
		HomeImprovementPO.searchForCleaningAndSupplies();
		loginPO.logout();
		driver.quit();
	}
	
}
