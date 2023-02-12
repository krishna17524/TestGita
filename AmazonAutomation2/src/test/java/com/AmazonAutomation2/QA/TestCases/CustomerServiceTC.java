package com.AmazonAutomation2.QA.TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.AmazonAutomation2.QA.BaseClass.BaseClass;
import com.AmazonAutomation2.QA.PageObjects.CustomerServicePageObjects;
import com.AmazonAutomation2.QA.PageObjects.LoginPageObjects;
import com.AmazonAutomation2.QA.TestData.CustomerAddressDataProvider;
import com.AmazonAutomation2.QA.Utilities.ITestListenerClass;


@Listeners({ITestListenerClass.class})
public class CustomerServiceTC extends BaseClass
{
	/*
	 * Author: sanka krishna bhaskar
	 * Date Created:-04-12-2022
	 * declaration of class variables  
	 * built id:-
	 * Testcase id:-
	 */
	public LoginPageObjects loginPO;
	public CustomerServicePageObjects customerServicePO;
	
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
		customerServicePO=new CustomerServicePageObjects();
	}
	
	/*
	 * Author: sanka krishna bhaskar
	 * Date Created:-04-12-2022
	 * method with functionality of adding new address along with login and logout functionality 
	 * built id:-
	 * Testcase id:-
	 */
	@Test(priority=1,dataProvider="customeraddress",dataProviderClass=CustomerAddressDataProvider.class)
	public void performAddNewAddress(String name,String mobile,String pincode,String address1,String address2,String landmark)
	{
		loginPO.launchApplication();
		loginPO.loginApplication();
		customerServicePO.addNewAddress(name,mobile,pincode,address1,address2,landmark);
//		SoftAssert softAssert=new SoftAssert();
//		softAssert.assertAll();
		loginPO.logout();
		
	}
	
}
