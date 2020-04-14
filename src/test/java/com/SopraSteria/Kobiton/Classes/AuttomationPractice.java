package com.SopraSteria.Kobiton.Classes;

import java.util.HashMap;

import org.openqa.selenium.WebElement;

import com.SopraSteria.AutomationPractice.CarrierPage;
import com.SopraSteria.AutomationPractice.HomePage;
import com.SopraSteria.AutomationPractice.OrderPage;
import com.SopraSteria.AutomationPractice.PaymentPage;
import com.SopraSteria.AutomationPractice.SignUpDetails;
import com.SopraSteria.AutomationPractice.SignUpPage;
import com.SopraSteria.AutomationPractice.SummaryPage;
import com.SopraSteria.AutomationPractice.TshirtPage;
import com.SopraSteria.AutomationPractice.WomenCategory;
import com.SopraSteria.helpers.ExcelUtils;
import com.SopraSteria.helpers.Reporting;
import com.aventstack.extentreports.Status;

import io.appium.java_client.AppiumDriver;

public class AuttomationPractice {
	
	AppiumDriver<WebElement> driver;
	Reporting report;
	
	public AuttomationPractice(AppiumDriver<WebElement> driver) {
		this.driver	=	driver;
	}
	
	public void initiateAutomationPractice()
	{
		try 
		{
			report	=	new Reporting(driver, "iOS");
			
			report.createTest("Automation_Practice");
			HashMap<String, String> dataMap	=	new ExcelUtils().getData();
			driver.get("http://automationpractice.com/index.php");
			report.logStepToReport(Status.INFO, "URL Opened", report.imagePath, null);
			System.out.println("URL Opened");
			
			new HomePage(driver,report).clickWomen();
			new WomenCategory(driver,report).clickTshirts();
			
			System.out.println("Tshirt Clicked!");
			new TshirtPage(driver,report).addtoCart();
			new SummaryPage(driver,report).click_Proceed_To_Checkout();
			new SignUpPage(driver, report).signUp();
			new SignUpDetails(driver, report).signUp("Samridhi", "Srivastava", "Samridhi@657", "10", "7", "2007", "Noida", "Noida", "2", "4527194690","34621");
			report.logStepToReport(Status.INFO, "URL Opened", report.imagePath, null);
			System.out.println("SignUp Complete!");
			new OrderPage(driver, report).clickProceedToCheckout();
			new CarrierPage(driver, report).clickProceedToCheckout();
			new PaymentPage(driver, report).payment();
			report.endTestCase();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
