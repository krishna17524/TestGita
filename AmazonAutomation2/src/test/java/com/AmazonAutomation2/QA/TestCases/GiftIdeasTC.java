package com.AmazonAutomation2.QA.TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.AmazonAutomation2.QA.BaseClass.BaseClass;
import com.AmazonAutomation2.QA.PageObjects.GiftIdeasPageObjects;
import com.AmazonAutomation2.QA.PageObjects.LoginPageObjects;

public class GiftIdeasTC extends BaseClass
{	
		/*
		 * Author: sanka krishna bhaskar
		 * Date Created:-04-12-2022
		 * declaration of class variables  
		 * built id:-
		 * Testcase id:-
		 */
		public LoginPageObjects loginPO;
		public GiftIdeasPageObjects giftIdeasPO;
		
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
			giftIdeasPO=new GiftIdeasPageObjects();
		}
		
		/*
		 * Author: sanka krishna bhaskar
		 * Date Created:-04-12-2022
		 * method with functionality of populating gifts under women sub category along with login and logout functionality 
		 * built id:-
		 * Testcase id:-
		 */
		@Test
		public void giftIdeasForWomen()
		{
			loginPO.launchApplication();
			loginPO.loginApplication();
			giftIdeasPO.giftIdeasForWomen();
			loginPO.logout();
			driver.quit();
		}
}
