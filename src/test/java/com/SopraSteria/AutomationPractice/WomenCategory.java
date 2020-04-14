package com.SopraSteria.AutomationPractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.SopraSteria.helpers.BrowserActions;
import com.SopraSteria.helpers.Reporting;

import io.appium.java_client.AppiumDriver;

public class WomenCategory {
	AppiumDriver<WebElement> driver;
	Reporting report;
	BrowserActions browserAction;
	String imgPath="";

	@FindBy(how = How.XPATH,using = "(//a[@title='Faded Short Sleeve T-shirts'])[2]")
	WebElement Tshirts;
	
	public WomenCategory(AppiumDriver<WebElement> driver,Reporting report) {
		this.driver	=	driver;
		this.report	= report;
		PageFactory.initElements(driver, this);
		browserAction	=	new BrowserActions(driver,report);
		imgPath	= report.imagePath;
	}
	
	public void clickTshirts()
	{
		browserAction.click("Clicking Tshirts", imgPath, Tshirts);
	}
}
