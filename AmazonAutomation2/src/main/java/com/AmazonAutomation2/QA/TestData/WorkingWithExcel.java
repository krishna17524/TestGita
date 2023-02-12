package com.AmazonAutomation2.QA.TestData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.AmazonAutomation2.QA.BaseClass.BaseClass;

@Test
public class WorkingWithExcel extends BaseClass
{
	
  @Test(priority=1)
  public void dataFromExcel()
  {
	  
	  File fl;
	  FileInputStream fis=null;
	  XSSFWorkbook xlsxWorkbook=null;
	  HSSFWorkbook xlsWorkbook=null;
	  
	  fl=new File(prop.getProperty("excelData"));
	  try {
		fis=new FileInputStream(fl);
	  	} 
	  catch (FileNotFoundException e1) 
	  	{
		// TODO Auto-generated catch block
		e1.printStackTrace();
	  	}
	 int indexOfDot =prop.getProperty("excelData").indexOf(".");
	String extensionOfFile=prop.getProperty("excelData").substring(indexOfDot+1);
	//extensionOfFile.equalsIgnoreCase("xlsx")
	  if(prop.getProperty("excelData").endsWith(".xlsx"))
	  {
		  try {
			xlsxWorkbook=new XSSFWorkbook(fis);
			XSSFSheet sheet=xlsxWorkbook.getSheet("USERDATA");
			int noOFRows=sheet.getLastRowNum();
			for(int i=1;i<=noOFRows;i++)
			{
				XSSFRow rw=sheet.getRow(i);
				XSSFCell username=rw.getCell(0);
				XSSFCell id=rw.getCell(1);
				XSSFCell designation=rw.getCell(2);
				XSSFCell division=rw.getCell(3);
				System.out.println("username = "+username);
				System.out.println("id ="+id);
				System.out.println("designation ="+designation);
				System.out.println("division"+division);
				System.out.println("****************************");
			}
			System.out.println("no of rows ="+noOFRows);
		  	  }
		  catch (IOException e) 
		     {
			// TODO Auto-generated catch block
			e.printStackTrace();
		    }
		  finally 
		  {
			  try {
				xlsxWorkbook.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }
		  
	  }//end of if 
	  else if(extensionOfFile.equalsIgnoreCase("xls"))
			  {
		  try {
			  xlsWorkbook=new HSSFWorkbook(fis);
				HSSFSheet sheet=xlsWorkbook.getSheet("USERDATA");
				int noOFRows=sheet.getLastRowNum();
				for(int i=0;i<=noOFRows;i++)
				{
					HSSFRow rw=sheet.getRow(i);
					HSSFCell username=rw.getCell(0);
					HSSFCell id=rw.getCell(1);
					HSSFCell designation=rw.getCell(2);
					HSSFCell division=rw.getCell(3);
					
					System.out.println(username);
					System.out.println(id);
					System.out.println(designation);
					System.out.println(division);
				}
				System.out.println("no of rows ="+noOFRows);
			  	  }
			  catch (IOException e) 
			     {
				// TODO Auto-generated catch block
				e.printStackTrace();
			    }
		  finally 
		  {
			  try {
				xlsWorkbook.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }
			  
		  
			  }//end of else if
  }
}
