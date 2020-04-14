package com.SopraSteria.AutomationPractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.SopraSteria.helpers.BrowserActions;
import com.SopraSteria.helpers.Reporting;

import io.appium.java_client.AppiumDriver;

public class TshirtPage {

	AppiumDriver<WebElement> driver;
	Reporting report;
	BrowserActions browserAction;
	String imgPath="";
	
	@FindBy(how=How.XPATH,using="//button[@name='Submit']")
	WebElement Add_To_Cart;
	
	@FindBy(how=How.XPATH,using="//div[@class='button-container']//span[contains(text(),'Proceed to checkout')]")
	WebElement Proceed_To_Checkout;
	
	
	public TshirtPage(AppiumDriver<WebElement> driver,Reporting report) {
		this.driver	=	driver;
		this.report	= report;
		PageFactory.initElements(driver, this);
		browserAction	=	new BrowserActions(driver,report);
		imgPath	= report.imagePath;
	}
	
	public void addtoCart()
	{
		browserAction.explicitWait(Add_To_Cart);
		browserAction.click("Clicking Add to Cart", imgPath, Add_To_Cart);
		browserAction.explicitWait(Proceed_To_Checkout);
		browserAction.click("Clicking Proceed to Checkout", imgPath, Proceed_To_Checkout);
	}
}
