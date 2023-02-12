package com.AmazonAutomation2.QA.TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.AmazonAutomation2.QA.BaseClass.BaseClass;
import com.AmazonAutomation2.QA.PageObjects.LoginPageObjects;
import com.AmazonAutomation2.QA.PageObjects.SearchPageObjects;

public class SearchProductsTC extends BaseClass
{
		
		/*
		 * Author: sanka krishna bhaskar
		 * Date Created:-04-12-2022
		 * declaration of class variables  
		 * built id:-
		 * Testcase id:-
		 */
		public LoginPageObjects lpo;
		public SearchPageObjects spo;
		
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
			spo=new SearchPageObjects();
		}
		
		
		/*
		 * Author: sanka krishna bhaskar
		 * Date Created:-04-12-2022
		 * method with functionality of performing search along with login and logout functionality 
		 * built id:-
		 * Testcase id:-
		 */
		@Test
		public void performSearchApplication()
		{
			lpo.launchApplication();
			lpo.loginApplication();
			//spo.performSearchProducts();
			spo.verifyGetItToday();
			lpo.logout();
			driver.quit();
		}
		
		
}
