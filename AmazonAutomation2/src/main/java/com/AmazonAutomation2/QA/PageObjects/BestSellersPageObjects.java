package com.AmazonAutomation2.QA.PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.AmazonAutomation2.QA.BaseClass.BaseClass;

public class BestSellersPageObjects extends BaseClass
{
  
	public BestSellersPageObjects()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//div[@class='nav-fill']//child::div[@id='nav-xshop-container']//child::a[contains(text(),'Best Sellers')]")
	WebElement bestSellersTab;
	@FindBy(xpath="//a[contains(text(),'Electronics')]//parent::div[@role='treeitem']//child::a[contains(text(),'Electronics')]")
	WebElement electronicSubCategory;
	@FindBy(xpath="//div[@id='nav-iss-attach']//ancestor::div[@class='nav-fill']//child::div[@class='nav-search-field ']//child::input[@id='twotabsearchtextbox']")
	WebElement searchTextBox;
	@FindBy(xpath="//div[@class='nav-search-submit nav-sprite']//child::input[@id='nav-search-submit-button']")
	WebElement searchButton;
	@FindBy(xpath="//span[@data-component-type='s-result-info-bar']//child::div[@class='a-section a-spacing-small a-spacing-top-small']//child::span[contains(text(),'results for')]")
	WebElement results;
	@FindBy(xpath="//div[@class='a-section a-spacing-small a-spacing-top-small']")
	private WebElement searchResutsMessage;
	@FindBy(xpath="//div[@id='p_36-title']//following-sibling::ul[@aria-labelledby='p_36-title']//child::span[contains(text(),'Under ₹1,000')]")
	WebElement price;
	boolean actualResult;
	boolean expectedResult;
	String isMessageDisplayed;
	@FindBy(xpath="//span[@class='a-dropdown-container']//child::select")
	WebElement sortByDropDown;
	
	
	
	public void populateElectronicSearch(String searchKeyWord)
	{
		bestSellersTab.click();
		electronicSubCategory.click();
		searchTextBox.sendKeys(searchKeyWord);
		searchButton.click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Select select=new Select(sortByDropDown);
		select.selectByVisibleText("Price: Low to High");
		WebElement currentSelection=select.getFirstSelectedOption();
		String currentSelected=currentSelection.getText();
		System.out.println(currentSelected);
		searchTextBox.clear();
		//Assert.assertEquals(currentSelected,"Price: Low to Highjjhh","Test case failed");
//		System.out.println("Expected Result is matched With Actual Result");
//		Assert.assertEquals(isResultsMessageDisplayed, false);
//		
//		}
//		catch(NoSuchElementException obj)
//		{
//			System.out.println("Expected Result is not matched With Actual Result");
//		}
		
	}

}
