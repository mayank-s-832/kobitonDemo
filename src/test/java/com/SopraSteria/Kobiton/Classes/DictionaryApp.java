package com.SopraSteria.Kobiton.Classes;

import com.SopraSteria.EnglishDictionary.HomePage;
import com.SopraSteria.EnglishDictionary.SearchWord;
import com.SopraSteria.helpers.ReportingApp;
import com.aventstack.extentreports.Status;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class DictionaryApp {
	AppiumDriver<MobileElement> driver;
	ReportingApp report;
	
	public DictionaryApp(AppiumDriver<MobileElement> driver) {
		this.driver	=	driver;
	}
	
	public void initiateDictionaryApp()
	{
		try {
			report		=	new ReportingApp(driver,"Android");
			report.createTest("Oxford_Dictionary");
			report.logStepToReport(Status.INFO, "App Opened", report.imagePath, null);
			System.out.println("Application Opened");
			new HomePage(driver, report).openWordOfDay();
			new SearchWord(driver, report).searchWord("Positive");
			report.logStepToReport(Status.INFO, "Test Case Complete", report.imagePath, null);
			report.endTestCase();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
