package com.SopraSteria.AutomationPractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.SopraSteria.helpers.BrowserActions;
import com.SopraSteria.helpers.Reporting;

import io.appium.java_client.AppiumDriver;

public class OrderPage {

	AppiumDriver<WebElement> driver;
	Reporting report;
	BrowserActions browserAction;
	String imgPath="";
	
	@FindBy(how=How.NAME,using="processAddress")
	WebElement Proceed_to_Checkout;
	//
	
	public OrderPage(AppiumDriver<WebElement> driver,Reporting report) {
		this.driver	=	driver;
		this.report	= report;
		PageFactory.initElements(driver, this);
		browserAction	=	new BrowserActions(driver,report);
		imgPath	= report.imagePath;
	}
	
	public void clickProceedToCheckout()
	{
		browserAction.explicitWait(Proceed_to_Checkout);
		browserAction.click("Click Proceed To Checkout", imgPath, Proceed_to_Checkout);
	}
}
