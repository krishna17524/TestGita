package com.AmazonAutomation2.QA.TestCases;

import org.testng.annotations.Test;
import com.AmazonAutomation2.QA.TestData.WorkingWithDataProviderExp1;

public class TestDataTC
{
	
	
  @Test(dataProvider="userinfo", dataProviderClass=WorkingWithDataProviderExp1.class)
  public void userInfo(Object username,Object password)
  {
	  System.out.println("username = "+username);
	  System.out.println("password = "+password);
	  System.out.println("***************************");
  }
}
