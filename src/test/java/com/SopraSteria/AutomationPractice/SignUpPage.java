package com.SopraSteria.AutomationPractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.SopraSteria.helpers.BrowserActions;
import com.SopraSteria.helpers.Reporting;
import com.SopraSteria.helpers.TimeFunctions;

import io.appium.java_client.AppiumDriver;

public class SignUpPage {
	AppiumDriver<WebElement> driver;
	Reporting report;
	BrowserActions browserAction;
	String imgPath="";
	
	@FindBy(how=How.XPATH,using="//button[@id='SubmitCreate']")
	WebElement SignUp;
	
	@FindBy(how=How.XPATH,using="//input[@id='email_create']")
	WebElement createEmail;
	
	//
	
	//SubmitCreate
	
	public SignUpPage(AppiumDriver<WebElement> driver,Reporting report) {
		this.driver	=	driver;
		this.report	= report;
		PageFactory.initElements(driver, this);
		browserAction	=	new BrowserActions(driver,report);
		imgPath	= report.imagePath;
	}
	
	public void signUp()
	{
		String email=new TimeFunctions().getCurrentTimeStamp()+"@gmail.com";
		browserAction.explicitWait(createEmail);
		browserAction.setText("Entering Email", imgPath, createEmail, email);
		browserAction.click("Clicking SignUp", imgPath, SignUp);
		
	}
}
