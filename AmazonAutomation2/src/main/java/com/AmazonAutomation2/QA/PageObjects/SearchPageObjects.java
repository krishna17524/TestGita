package com.AmazonAutomation2.QA.PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.AmazonAutomation2.QA.BaseClass.BaseClass;

import io.netty.channel.pool.FixedChannelPool.AcquireTimeoutAction;

public class SearchPageObjects extends BaseClass
{
	/*
	 * Author: sanka krishna bhaskar
	 * Date:-04-12-2022
	 * initializing page elements to WebElements inside constructor
	 * built id:-
	 */
	public SearchPageObjects()
	{
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * Author: sanka krishna bhaskar
	 * Date:-04-12-2022
	 * declaration of page elements and WebElements 
	 * built id:-
	 */
	@FindBy(xpath="//div[@id='nav-iss-attach']//ancestor::div[@class='nav-fill']//child::div[@class='nav-search-field ']//child::input[@id='twotabsearchtextbox']")
	WebElement searchTextBox;
	@FindBy(xpath="//div[@class='nav-search-submit nav-sprite']//child::input[@id='nav-search-submit-button']")
	WebElement searchButton;
	@FindBy(xpath="//li[@aria-label='Get It in 2 Days']//descendant::input[@type='checkbox']//following-sibling::i[@class='a-icon a-icon-checkbox']//parent::label")
	private WebElement getItInTwoDays;
	////li[@aria-label='Get It in 2 Days']//descendant::input[@type='checkbox']//following-sibling::i[@class='a-icon a-icon-checkbox']//parent::label
	////li[@aria-label='Get It in 2 Days']//descendant::input[@type='checkbox']
	////li[@aria-label='Get It in 2 Days']//descendant::input[@type='checkbox']//following-sibling::i[@class='a-icon a-icon-checkbox']
	@FindBy(xpath="//span[text()='Prime Reading Eligible']//preceding-sibling::div//descendant::i[@class='a-icon a-icon-checkbox']")
	WebElement primeReadingCheckBox;
//	@FindBy(xpath="//span[text()='Get It in 2 Days']//preceding-sibling::div//descendant::i[@class='a-icon a-icon-checkbox']")
//	WebElement getItInTwoDays;

	/*
	 * Author: sanka krishna bhaskar
	 * Date:-04-12-2022
	 * method performing normal search functionality
	 * built id:-
	 */
	public void performSearchProducts()
	{
		searchTextBox.sendKeys(prop.getProperty("searchKeyWord"));
		searchButton.click();
	}
	
	public void verifyGetItToday()
	{
		searchTextBox.sendKeys(prop.getProperty("searchKeyWord"));
		searchButton.click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//		primeReadingCheckBox.click();
//		boolean value1=primeReadingCheckBox.isEnabled();
//		if(value1==true)
//		{
//			System.out.println("check box prime is checked");
//		}
//		else
//		{
//			System.out.println("check box prime is not checked");
//		}
		getItInTwoDays.click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		boolean value=getItInTwoDays.isEnabled();
		if(value==true)
		{
			System.out.println("check box is checked");
		}
		else
		{
			System.out.println("check box is not checked");
		}
		//WebElement checkBox=getItTodayCheckBox.
		//String currentselection=
	}
	

}
