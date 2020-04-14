package com.SopraSteria.helpers;

import org.openqa.selenium.interactions.touch.TouchActions;

import com.aventstack.extentreports.Status;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MobileActions {

	AppiumDriver<MobileElement> driver;
	ReportingApp report;
	
	public MobileActions(AppiumDriver<MobileElement> driver,ReportingApp report) {
		this.driver	=	driver;
		this.report	=	report;
	}
	
	public void click(String Details,String filenamePath,MobileElement element)
	{
		try{
			element.click();
			report.logStepToReport(Status.INFO, Details, filenamePath, element);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void setText(String Details,String filenamePath,MobileElement element,String text)
	{
		try{
			element.sendKeys(text);
			report.logStepToReport(Status.INFO, Details, filenamePath, element);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void explicitWait(MobileElement element)
	{
		for(int i=0;i<30;i++)
		{
			try {
				if(element.isDisplayed()&&element.isEnabled())
				{
					break;
				}
				else
				{
					System.out.println("Current wait: "+i);
				}
			} catch (Exception e) {
				System.out.println("Current wait: "+i);
			}
		}
	}
	
	public void scrollDown()
	{
		TouchActions actions = new TouchActions(driver);
		actions.scroll(428, 1851);
	}
}
