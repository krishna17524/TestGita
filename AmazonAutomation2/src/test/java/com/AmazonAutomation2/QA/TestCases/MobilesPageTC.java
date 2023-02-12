package com.AmazonAutomation2.QA.TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.AmazonAutomation2.QA.BaseClass.BaseClass;
import com.AmazonAutomation2.QA.PageObjects.LoginPageObjects;
import com.AmazonAutomation2.QA.PageObjects.MobilesPageObjects;

public class MobilesPageTC extends BaseClass
{
	/*
	 * Author: sanka krishna bhaskar
	 * Date Created:-04-12-2022
	 * declaration of class variables  
	 * built id:-
	 * Testcase id:-
	 */
	public LoginPageObjects loginPO;
	public MobilesPageObjects MobilesPO;
  
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
	  MobilesPO=new MobilesPageObjects();
	}
  
	/*
	 * Author: sanka krishna bhaskar
	 * Date Created:-04-12-2022
	 * method with functionality of searching mobiles under mobiles category along with login and logout functionality 
	 * built id:-
	 * Testcase id:-
	 */
	@Test
	public void mobilesPageSearch()
	{
	  loginPO.launchApplication();
	  loginPO.loginApplication();
	  MobilesPO.performSearchMobilesProducts();
	  loginPO.logout();
	  driver.quit();
	}
  
  
}
