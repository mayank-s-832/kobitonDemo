package com.SopraSteria.Kobiton.Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;

public class GoogleSearch {

	public void googleSearch(AppiumDriver<WebElement> driver)
	{
		 try {
			 String text="Kobiton";
			driver.get("http://www.google.com");
			 System.out.println("URL Opened!");
			 
			 WebDriverWait wait	=	new WebDriverWait(driver, 100);
			 
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
			 driver.findElement(By.name("q")).sendKeys(text);
			 
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Google Search']")));
			 driver.findElement(By.xpath("//button[@aria-label='Google Search']")).click();
			 
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='main']//div[contains(text(),'Kobiton')]")));
			 driver.findElement(By.xpath("//div[@id='main']//div[contains(text(),'"+text+"')]")).click();
			 
			 Thread.sleep(6000);
			 String title	=	driver.getTitle();
			 System.out.println("Title: "+title);
		} catch (Exception e) {
			e.printStackTrace();
		}
//		 driver.quit();
	}
}
