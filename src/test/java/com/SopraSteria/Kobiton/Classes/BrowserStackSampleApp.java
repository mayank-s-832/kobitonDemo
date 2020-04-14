package com.SopraSteria.Kobiton.Classes;

import com.SopraSteria.BrowserStackApp.HomePageBrowserStack;
import com.SopraSteria.helpers.ReportingApp;
import com.aventstack.extentreports.Status;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class BrowserStackSampleApp {
	AppiumDriver<MobileElement> driver;
	ReportingApp report;
	
	public BrowserStackSampleApp(AppiumDriver<MobileElement> driver) {
		this.driver	=	driver;
	}
	
	public void initiateBrowserStackApp()
	{
		try {
			report		=	new ReportingApp(driver,"Android");
			report.createTest("BrowserStackApp");
			report.logStepToReport(Status.INFO, "App Opened", report.imagePath, null);
			System.out.println("Application Opened");
			new HomePageBrowserStack(driver, report).performAction("TEXT");
			report.logStepToReport(Status.INFO, "Test Case Complete", report.imagePath, null);
			report.endTestCase();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
