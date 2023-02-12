package com.AmazonAutomation2.QA.TestData;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CustomerAddressDataProvider 
{
  
	
	@DataProvider(name="customeraddress")
  public Object[][] Address() 
  {
		Object[][] addressData=new Object[2][6];
	  try
	  {
	  
	  addressData[0][0]="bala krishna";
	  addressData[0][1]="89989980987";
	  addressData[0][2]="500090";
	  addressData[0][3]="main road,  mani konda";
	  addressData[0][4]=" beside park";
	  addressData[0][5]="opp sai ramtemple";
	  addressData[1][0]="kedhar krishna";
	  addressData[1][1]="89989980900";
	  addressData[1][2]="500090";
	  addressData[1][3]="main road, palame";
	  addressData[1][4]=" beside durga temple";
	  addressData[1][5]="opp human temple";
	  }
	  catch(ArrayIndexOutOfBoundsException obj)
	  {
		obj.printStackTrace(); 
	  }
	  return addressData; 
	  
  }
}
