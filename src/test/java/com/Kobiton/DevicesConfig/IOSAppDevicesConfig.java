package com.Kobiton.DevicesConfig;

import org.openqa.selenium.remote.DesiredCapabilities;

public class IOSAppDevicesConfig {

	public DesiredCapabilities Iphone8()
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		// The generated session will be visible to you only. In case you want this session available for other users, please assign this device to specific group. 
		capabilities.setCapability("sessionName", "Automation test session");
		capabilities.setCapability("sessionDescription", "");
		capabilities.setCapability("deviceOrientation", "portrait");
		capabilities.setCapability("captureScreenshots", true);
		// The maximum size of application is 500MB
		// By default, HTTP requests from testing library are expired
		// in 2 minutes while the app copying and installation may
		// take up-to 30 minutes. Therefore, you need to extend the HTTP
		// request timeout duration in your testing library so that
		// it doesn't interrupt while the device is being initialized.
		capabilities.setCapability("app", "kobiton-store:55640");

		capabilities.setCapability("deviceGroup", "KOBITON");
		// For deviceName, platformVersion Kobiton supports wildcard
		// character *, with 3 formats: *text, text* and *text*
		// If there is no *, Kobiton will match the exact text provided
		capabilities.setCapability("deviceName", "iPhone 8");
		capabilities.setCapability("platformVersion", "13.3.1");
		capabilities.setCapability("platformName", "iOS");
		return capabilities;
	}
	
	public DesiredCapabilities Iphone6s()
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
	
	public DesiredCapabilities Iphone6sPlus()
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		// The generated session will be visible to you only. In case you want this session available for other users, please assign this device to specific group. 
		capabilities.setCapability("sessionName", "Automation test session");
		capabilities.setCapability("sessionDescription", "");
		capabilities.setCapability("deviceOrientation", "portrait");
		capabilities.setCapability("captureScreenshots", true);
		// The maximum size of application is 500MB
		// By default, HTTP requests from testing library are expired
		// in 2 minutes while the app copying and installation may
		// take up-to 30 minutes. Therefore, you need to extend the HTTP
		// request timeout duration in your testing library so that
		// it doesn't interrupt while the device is being initialized.
		capabilities.setCapability("app", "kobiton-store:55640");

		capabilities.setCapability("deviceGroup", "KOBITON");
		// For deviceName, platformVersion Kobiton supports wildcard
		// character *, with 3 formats: *text, text* and *text*
		// If there is no *, Kobiton will match the exact text provided
		capabilities.setCapability("deviceName", "iPhone 6s Plus");
		capabilities.setCapability("platformVersion", "11.0");
		capabilities.setCapability("platformName", "iOS");
		return capabilities;
	}
}
