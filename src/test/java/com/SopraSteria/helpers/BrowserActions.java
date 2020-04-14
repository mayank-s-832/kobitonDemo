package com.SopraSteria.helpers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;

import io.appium.java_client.AppiumDriver;

public class BrowserActions {

	AppiumDriver<WebElement> driver;
	Reporting report;
	
	public BrowserActions(AppiumDriver<WebElement> driver,Reporting report) {
		this.driver	=	driver;
		this.report	=	report;
	}
	
	public void click(String Details,String filenamePath,WebElement element)
	{
		try{
			element.click();
			report.logStepToReport(Status.INFO, Details, filenamePath, element);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void setText(String Details,String filenamePath,WebElement element,String text)
	{
		try{
			element.sendKeys(text);
			report.logStepToReport(Status.INFO, Details, filenamePath, element);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void explicitWait(WebElement element)
	{
		WebDriverWait wait	=	new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void selectFromDD(String Details,String filenamePath,WebElement element,String value)
	{
		Select sel	=	new Select(element);
		sel.selectByValue(value);
		report.logStepToReport(Status.INFO, Details, filenamePath, element);
	}
}
