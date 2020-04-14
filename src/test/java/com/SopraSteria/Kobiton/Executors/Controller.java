package com.SopraSteria.Kobiton.Executors;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;

import com.Kobiton.DevicesConfig.AndroidAppDevicesConfig;
import com.Kobiton.DevicesConfig.AndroidWebDevicesConfig;
import com.Kobiton.DevicesConfig.IOSAppDevicesConfig;
import com.Kobiton.DevicesConfig.IOSWebDevicesConfig;
import com.SopraSteria.Kobiton.Classes.AuttomationPractice;
import com.SopraSteria.Kobiton.Classes.BrowserStackSampleApp;
import com.SopraSteria.Kobiton.Classes.DictionaryApp;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class Controller {

	public AppiumDriver<WebElement> webdriver;
	public AppiumDriver<MobileElement> mobileDriver;
	public void execute(String kobitonServerUrl)
	{
		try {
			webdriver	=new AppiumDriver<WebElement>(new URL(kobitonServerUrl), new IOSWebDevicesConfig().iPhone6sPlus());
			new AuttomationPractice(webdriver).initiateAutomationPractice();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		webdriver.quit();
	}
	public void appExecute(String kobitonServerUrl)
	{
		try {
			mobileDriver	=new AndroidDriver<>(new URL(kobitonServerUrl), new AndroidAppDevicesConfig().Xperia10Plus());
			new DictionaryApp(mobileDriver).initiateDictionaryApp();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void appExecuteiOS(String kobitonServerUrl)
	{
		try {
			mobileDriver	=new IOSDriver<>(new URL(kobitonServerUrl), new IOSAppDevicesConfig().Iphone6sPlus());
			new BrowserStackSampleApp(mobileDriver).initiateBrowserStackApp();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void startExecution(String executionOn) {
		if(executionOn.equals("browser"))
		{
			this.execute(Executor.kobitonServerUrl);
		}
		else if(executionOn.equals("android app"))
		{
			this.appExecute(Executor.kobitonServerUrl);
		}
		else
		{
			this.appExecuteiOS(Executor.kobitonServerUrl);
		}
		
	}
}
