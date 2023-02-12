package com.AmazonAutomation2.QA.TestData;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WorkingWithDataProviderExp1 
{
	
	@DataProvider(name="userinfo")
  public Object[][] workingWithData() 
  {
	  Object[][] userinfo=new Object[6][2];
	  userinfo[0][0]="user1";
	  userinfo[0][1]="poassword1";
	  userinfo[1][0]="user2";
	  userinfo[1][1]="password2";
	  userinfo[2][0]="user3";
	  userinfo[2][1]="password3";
	  userinfo[3][0]="user4";
	  userinfo[3][1]="password4";
	  userinfo[4][0]="user5";
	  userinfo[4][1]="password5";
	  userinfo[5][0]="user6";
	  userinfo[5][1]="password6";
	 return userinfo;
	  
  }
}
