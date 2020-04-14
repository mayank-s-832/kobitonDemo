package com.SopraSteria.BrowserStackApp;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.SopraSteria.helpers.MobileActions;
import com.SopraSteria.helpers.ReportingApp;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePageBrowserStack {
	AppiumDriver<MobileElement> driver;
	ReportingApp report;
	MobileActions mobileActions;
	String imgPath="";
	
	@FindBy(how = How.XPATH,using	=	"//XCUIElementTypeButton[@name='Text']")
	MobileElement Text;
	
	@FindBy(how = How.XPATH,using	=	"//XCUIElementTypeApplication[@name='Sample iOS']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField")
	MobileElement TextEntered;
	
	@FindBy(how = How.XPATH,using	=	"//XCUIElementTypeButton[@name='Return']")
	MobileElement Enter;
	
	@FindBy(how = How.XPATH,using	=	"//XCUIElementTypeButton[@name='Back']")
	MobileElement Back;
	
	@FindBy(how = How.XPATH,using	=	"//XCUIElementTypeButton[@name='Alert']")
	MobileElement Alert;
	
	@FindBy(how = How.XPATH,using	=	"//XCUIElementTypeButton[@name='OK']")
	MobileElement OK;
	
	@FindBy(how = How.XPATH,using	=	"//XCUIElementTypeButton[@name='Web View']")
	MobileElement Webview;
	
	public HomePageBrowserStack(AppiumDriver<MobileElement> driver,ReportingApp report) {
		this.driver	=	driver;
		this.report	=	report;
		PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
		mobileActions	=	new MobileActions(driver, report);
		imgPath		=	report.imagePath;
	}
	
	public void performAction(String text)
	{
		
		mobileActions.explicitWait(Alert);
		mobileActions.click("Clicking Alert Menu", imgPath, Alert);
		mobileActions.explicitWait(OK);
		mobileActions.click("Clicking OK", imgPath, OK);
		
		mobileActions.explicitWait(Text);
		mobileActions.click("Clicking Text", imgPath, Text);
		
		mobileActions.explicitWait(TextEntered);
		mobileActions.setText("Ëntering Text", imgPath, TextEntered, text);
		mobileActions.click("Clicking Return", imgPath, Enter);
		mobileActions.click("Clicking Web view", imgPath, Webview);
		
	}
}
