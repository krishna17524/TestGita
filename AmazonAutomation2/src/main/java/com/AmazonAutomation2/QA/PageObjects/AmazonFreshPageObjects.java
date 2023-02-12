package com.AmazonAutomation2.QA.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.AmazonAutomation2.QA.BaseClass.BaseClass;

public class AmazonFreshPageObjects extends BaseClass
{
	WebDriver driver;
	/*
	 * Author: sanka krishna bhaskar
	 * Date:-04-12-2022
	 * initializing page elements to WebElements inside constructor
	 * built id:-
	 */
	public AmazonFreshPageObjects()
	{
		PageFactory.initElements(driver,this);
	}
	
	/*
	 * Author: sanka krishna bhaskar
	 * Date:-04-12-2022
	 * declaration of page elements and WebElements 
	 * built id:-
	 */
	
	//@FindBy(xpath="")WebElement lk;
	@FindBy(xpath="//a[@href='/fresh?ref_=nav_cs_fresh']//ancestor::div[@id='nav-xshop-container']//child::a[@href='/fresh?ref_=nav_cs_fresh' and contains(text(),'Fresh')]")
	WebElement FreshTab;
	@FindBy(xpath="//ancestor::div[@id='nav-progressive-subnav']//child::div[@id='nav-subnav']//child::a[@aria-label='Past Purchases']//child::span[contains(text(),'Past Purchases')]")
	WebElement pastPurchasesTab;
	@FindBy(xpath="//div[@class='_grocery-message_style_desktopStyle__HRPm4']//child::div[@class='a-alert-content']//child::span")
	WebElement pastPurchasesData;
	
	
	/*
	 * Author: sanka krishna bhaskar
	 * Date:-04-12-2022
	 * method with functionality of past purchases under amazon fresh category
	 * built id:-
	 */
	public void amazonFreshPastPurchasesData()
	{
	
		FreshTab.click();
		pastPurchasesTab.click();
		System.out.println(pastPurchasesData.getText());
		
	}
	
}
