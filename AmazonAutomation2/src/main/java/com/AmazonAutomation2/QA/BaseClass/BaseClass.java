package com.AmazonAutomation2.QA.BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	/*
	 * Author: sanka krishna bhaskar
	 * Date:-04-12-2022
	 * declaration of public WebDriver and Properties variables
	 * built id:-
	 */
	public static WebDriver driver;
	public static final String propertyFilePath="D:\\testing tutorials\\SeleniumWorkSpace\\AmazonAutomation2\\src\\main\\java\\com\\AmazonAutomation2\\QA\\Configuration\\Config.properties";
	public static Properties prop;
	
	/*
	 * Author: sanka krishna bhaskar
	 * Date:-04-12-2022
	 * constructor functionality with config.properties file loading functionality
	 * built id:-
	 */
	public BaseClass()
	{
		try
		{
		File fl=new File(propertyFilePath);
		FileInputStream fis=new FileInputStream(fl);
		prop=new Properties();
		prop.load(fis);
		
		}
		catch(FileNotFoundException fnf)
		{
			fnf.printStackTrace();
		}
		catch( IOException io)
		{
			io.printStackTrace();
		}	
	}
	
	/*
	 * Author: sanka krishna bhaskar
	 * Date:-04-12-2022
	 * initialize method driver to specified browser 
	 * built id:-
	 */
	
	@Test
	public void initialize()
	{
		if(prop.getProperty("browserToExecute").equalsIgnoreCase("chrome")==true)
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(prop.getProperty("browserToExecute").equalsIgnoreCase("firefox")==true)
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
	}
}
