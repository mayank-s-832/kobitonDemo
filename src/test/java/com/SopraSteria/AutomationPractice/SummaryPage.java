package com.SopraSteria.AutomationPractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.SopraSteria.helpers.BrowserActions;
import com.SopraSteria.helpers.Reporting;

import io.appium.java_client.AppiumDriver;

public class SummaryPage {

	AppiumDriver<WebElement> driver;
	Reporting report;
	BrowserActions browserAction;
	String imgPath="";
	
	@FindBy(how=How.XPATH,using="//a[@title='Proceed to checkout' and @class='button btn btn-default standard-checkout button-medium']")
	WebElement Proceed_To_Checkout;
	//
	public SummaryPage(AppiumDriver<WebElement> driver,Reporting report) {
		this.driver	=	driver;
		this.report	= report;
		PageFactory.initElements(driver, this);
		browserAction	=	new BrowserActions(driver,report);
		imgPath	= report.imagePath;
	}
	
	public void click_Proceed_To_Checkout()
	{
		browserAction.explicitWait(Proceed_To_Checkout);
		browserAction.click("Clicking Proceed to Checkout", imgPath, Proceed_To_Checkout);
	}
}
