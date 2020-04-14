package com.SopraSteria.AutomationPractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.SopraSteria.helpers.BrowserActions;
import com.SopraSteria.helpers.Reporting;

import io.appium.java_client.AppiumDriver;

public class HomePage {
	AppiumDriver<WebElement> driver;
	Reporting report;
	BrowserActions browserAction;
	String imgPath="";
	
	@FindBy(how=How.XPATH,using	= "//div[@id='block_top_menu']//div[@class='cat-title']")
	WebElement Categories;
	
	@FindBy(how=How.XPATH,using="//ul[@class='sf-menu clearfix menu-content']//a[@title='Women']")
	WebElement WomenCategories;
	
	public HomePage(AppiumDriver<WebElement> driver,Reporting report) {
		this.driver	=	driver;
		this.report	= report;
		PageFactory.initElements(driver, this);
		browserAction	=	new BrowserActions(driver,report);
		imgPath	= report.imagePath;
	}
	
	public void clickCategory()
	{
		try {
			browserAction.explicitWait(Categories);
			browserAction.click("Clicking Categories", imgPath, Categories);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void clickWomenCategories()
	{
		try {
			browserAction.explicitWait(WomenCategories);
			browserAction.click("Clicking Women Categories", imgPath,WomenCategories);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void clickWomen()
	{
		clickCategory();
		clickWomenCategories();
	}
}
