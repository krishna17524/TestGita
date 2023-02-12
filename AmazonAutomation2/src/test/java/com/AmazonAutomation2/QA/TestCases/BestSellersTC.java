package com.AmazonAutomation2.QA.TestCases;

import org.junit.Ignore;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.AmazonAutomation2.QA.BaseClass.BaseClass;
import com.AmazonAutomation2.QA.PageObjects.BestSellersPageObjects;
import com.AmazonAutomation2.QA.PageObjects.LoginPageObjects;
import com.AmazonAutomation2.QA.TestData.*;
public class BestSellersTC extends BaseClass
{
	LoginPageObjects loginPO;
	BestSellersPageObjects bestSellersPO;
	
	@BeforeMethod
	@Test
	public void createObjects()
	{
		loginPO=new LoginPageObjects();
		bestSellersPO=new BestSellersPageObjects();
	}
	
	@Ignore
	@Test(priority=1)
	public void searchBestSellers()
	{
		loginPO.launchApplication();
		loginPO.loginApplication();
		//bestSellersPO.populateElectronicSearch();
		loginPO.logout();
	}
	
	@Test(dataProvider="searchProduct", dataProviderClass=SearchDataProvider.class)
	public void populatePriceSearch(String searchKeyWord)
	{
		loginPO.launchApplication();
		loginPO.loginApplication();
		bestSellersPO.populateElectronicSearch(searchKeyWord);
		//bestSellersPO.populatePriceSearch();
		loginPO.logout();
	}
}
