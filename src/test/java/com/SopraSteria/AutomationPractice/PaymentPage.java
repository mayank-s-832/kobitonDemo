package com.SopraSteria.AutomationPractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.SopraSteria.helpers.BrowserActions;
import com.SopraSteria.helpers.Reporting;

import io.appium.java_client.AppiumDriver;

public class PaymentPage {
	AppiumDriver<WebElement> driver;
	Reporting report;
	BrowserActions browserAction;
	String imgPath="";
	
	@FindBy(how=How.CLASS_NAME,using="bankwire")
	WebElement Bankwire;
	
	@FindBy(how=How.XPATH,using="//p[@id='cart_navigation']//button")
	WebElement CartNavigation;
	
	@FindBy(how=How.XPATH,using="//p[@class='cheque-indent']//strong")
	WebElement PaymentConfirm;
	
	//
	
	public PaymentPage(AppiumDriver<WebElement> driver,Reporting report) {
		this.driver	=	driver;
		this.report	= report;
		PageFactory.initElements(driver, this);
		browserAction	=	new BrowserActions(driver,report);
		imgPath	= report.imagePath;
	}
	
	public void payment()
	{
		try {
			browserAction.explicitWait(Bankwire);
			browserAction.click("Clicking Bankwire", imgPath, Bankwire);
			browserAction.explicitWait(CartNavigation);
			browserAction.click("Clicking CartNavigation", imgPath, CartNavigation);
			Thread.sleep(10000);
			report.verifyCondition(true, PaymentConfirm.getText(), PaymentConfirm.getText());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
