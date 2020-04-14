package com.SopraSteria.AutomationPractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.SopraSteria.helpers.BrowserActions;
import com.SopraSteria.helpers.Reporting;

import io.appium.java_client.AppiumDriver;

public class SignUpDetails {

	AppiumDriver<WebElement> driver;
	Reporting report;
	BrowserActions browserAction;
	String imgPath="";
	
	@FindBy(how=How.ID,using="customer_firstname")
	WebElement FirstName;
	
	@FindBy(how=How.ID,using="customer_lastname")
	WebElement LastName;
	
	@FindBy(how=How.ID,using="passwd")
	WebElement Password;
	
	@FindBy(how=How.ID,using="days")
	WebElement Days;
	
	@FindBy(how=How.ID,using="months")
	WebElement Months;
	
	@FindBy(how=How.ID,using="years")
	WebElement Years;
	
	@FindBy(how=How.ID,using="firstname")
	WebElement AccountFirstName;
	
	@FindBy(how=How.ID,using="lastname")
	WebElement AccountLastName;
	
	@FindBy(how=How.ID,using="address1")
	WebElement Address;
	
	@FindBy(how=How.ID,using="city")
	WebElement City;
	
	@FindBy(how=How.ID,using="phone_mobile")
	WebElement MobilePhone;
	
	@FindBy(how=How.ID,using="submitAccount")
	WebElement Register;
	
	@FindBy(how=How.ID,using="id_state")
	WebElement State;
	
	@FindBy(how=How.ID,using="postcode")
	WebElement Postcode;
	
	//
	
	public SignUpDetails(AppiumDriver<WebElement> driver,Reporting report) {
		this.driver	=	driver;
		this.report	= report;
		PageFactory.initElements(driver, this);
		browserAction	=	new BrowserActions(driver,report);
		imgPath	= report.imagePath;
	}
	public void signUp(String firstName,String lastName,String password,String days,String months,String years,String address,String city,String state,String mobilePhone,String postcode)
	{
		browserAction.explicitWait(FirstName);
		browserAction.setText("Setting First Name", imgPath, FirstName, firstName);
		browserAction.setText("Setting Last Name", imgPath, LastName, lastName);
		browserAction.setText("Setting Password", imgPath, Password, password);
		browserAction.selectFromDD("Selecting Date", imgPath, Days, days);
		browserAction.selectFromDD("Selecting Month", imgPath, Months, months);
		browserAction.selectFromDD("Selecting Years", imgPath, Years, years);
		browserAction.setText("Setting Address", imgPath, Address, address);
		browserAction.setText("Setting City", imgPath, City, city);
		browserAction.selectFromDD("Setting State", imgPath, State, state);
		System.out.println(State.getText());
		browserAction.setText("Setting PostCode", imgPath, Postcode, postcode);
		browserAction.setText("Setting MobilePhone", imgPath, MobilePhone, mobilePhone);
		browserAction.click("Clicking Register", imgPath, Register);
		
	}
	
}
