package com.AmazonAutomation2.QA.TestData;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SearchDataProvider
{
	
	
  @DataProvider(name="searchProduct")
  @Test
  public Object[] provideProducts()
  {
	  Object[] search=new Object[5];
	  search[0]="pen";
	  search[1]="phone";
	  search[2]="electronic cigar";
	  search[3]="bike";
	  search[4]="ear phones";
	  return search;
  }
}
