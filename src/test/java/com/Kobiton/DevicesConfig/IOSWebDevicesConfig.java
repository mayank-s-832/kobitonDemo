package com.Kobiton.DevicesConfig;

import org.openqa.selenium.remote.DesiredCapabilities;

public class IOSWebDevicesConfig {

	public DesiredCapabilities iPhoneXS()
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		// The generated session will be visible to you only. In case you want this session available for other users, please assign this device to specific group. 
		capabilities.setCapability("sessionName", "Automation test session");
		capabilities.setCapability("sessionDescription", "");
		capabilities.setCapability("deviceOrientation", "portrait");
		capabilities.setCapability("captureScreenshots", true);
		capabilities.setCapability("browserName", "safari");
		capabilities.setCapability("deviceGroup", "KOBITON");
		// For deviceName, platformVersion Kobiton supports wildcard
		// character *, with 3 formats: *text, text* and *text*
		// If there is no *, Kobiton will match the exact text provided
		capabilities.setCapability("deviceName", "iPhone XS");
		capabilities.setCapability("platformVersion", "13.3.1");
		capabilities.setCapability("platformName", "iOS");
		return capabilities;
	}
	
	public DesiredCapabilities iPhone8()
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		// The generated session will be visible to you only. In case you want this session available for other users, please assign this device to specific group. 
		capabilities.setCapability("sessionName", "Automation test session");
		capabilities.setCapability("sessionDescription", "");
		capabilities.setCapability("deviceOrientation", "portrait");
		capabilities.setCapability("captureScreenshots", true);
		capabilities.setCapability("browserName", "safari");
		capabilities.setCapability("deviceGroup", "KOBITON");
		// For deviceName, platformVersion Kobiton supports wildcard
		// character *, with 3 formats: *text, text* and *text*
		// If there is no *, Kobiton will match the exact text provided
		capabilities.setCapability("deviceName", "iPhone 8");
		capabilities.setCapability("platformVersion", "13.3.1");
		capabilities.setCapability("platformName", "iOS");
		return capabilities;
	}
	
	public DesiredCapabilities iPhone6sPlus()
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		// The generated session will be visible to you only. In case you want this session available for other users, please assign this device to specific group. 
		capabilities.setCapability("sessionName", "Automation test session");
		capabilities.setCapability("sessionDescription", "");
		capabilities.setCapability("deviceOrientation", "portrait");
		capabilities.setCapability("captureScreenshots", true);
		capabilities.setCapability("browserName", "safari");
		capabilities.setCapability("deviceGroup", "KOBITON");
		// For deviceName, platformVersion Kobiton supports wildcard
		// character *, with 3 formats: *text, text* and *text*
		// If there is no *, Kobiton will match the exact text provided
		capabilities.setCapability("deviceName", "iPhone 6s Plus");
		capabilities.setCapability("platformVersion", "11.0");
		capabilities.setCapability("platformName", "iOS");
		return capabilities;
	}
	
	public DesiredCapabilities iPhone6s()
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		// The generated session will be visible to you only. In case you want this session available for other users, please assign this device to specific group. 
		capabilities.setCapability("sessionName", "Automation test session");
		capabilities.setCapability("sessionDescription", "");
		capabilities.setCapability("deviceOrientation", "portrait");
		capabilities.setCapability("captureScreenshots", true);
		capabilities.setCapability("browserName", "safari");
		capabilities.setCapability("deviceGroup", "KOBITON");
		// For deviceName, platformVersion Kobiton supports wildcard
		// character *, with 3 formats: *text, text* and *text*
		// If there is no *, Kobiton will match the exact text provided
		capabilities.setCapability("deviceName", "iPhone 6s");
		capabilities.setCapability("platformVersion", "10.2.1");
		capabilities.setCapability("platformName", "iOS");
		return capabilities;
	}
	
	public DesiredCapabilities iPad6thgeneration()
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		// The generated session will be visible to you only. In case you want this session available for other users, please assign this device to specific group. 
		capabilities.setCapability("sessionName", "Automation test session");
		capabilities.setCapability("sessionDescription", "");
		capabilities.setCapability("deviceOrientation", "portrait");
		capabilities.setCapability("captureScreenshots", true);
		capabilities.setCapability("browserName", "safari");
		capabilities.setCapability("deviceGroup", "KOBITON");
		// For deviceName, platformVersion Kobiton supports wildcard
		// character *, with 3 formats: *text, text* and *text*
		// If there is no *, Kobiton will match the exact text provided
		capabilities.setCapability("deviceName", "iPad (6th generation)");
		capabilities.setCapability("platformVersion", "13.3.1");
		capabilities.setCapability("platformName", "iOS");
		return capabilities;
	}
}
