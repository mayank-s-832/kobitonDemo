package com.Kobiton.DevicesConfig;

import org.openqa.selenium.remote.DesiredCapabilities;

public class AndroidWebDevicesConfig {

	public DesiredCapabilities Pixel3a()
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		// The generated session will be visible to you only. In case you want this session available for other users, please assign this device to specific group. 
		capabilities.setCapability("sessionName", "Automation test session");
		capabilities.setCapability("sessionDescription", "");
		capabilities.setCapability("deviceOrientation", "portrait");
		capabilities.setCapability("captureScreenshots", true);
		capabilities.setCapability("browserName", "chrome");
		capabilities.setCapability("deviceGroup", "KOBITON");
		// For deviceName, platformVersion Kobiton supports wildcard
		// character *, with 3 formats: *text, text* and *text*
		// If there is no *, Kobiton will match the exact text provided
		capabilities.setCapability("deviceName", "Pixel 3a");
		capabilities.setCapability("platformVersion", "10");
		capabilities.setCapability("platformName", "Android");
		 
		 return capabilities;
	}
	
	public DesiredCapabilities Xperia10Plus()
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		// The generated session will be visible to you only. In case you want this session available for other users, please assign this device to specific group. 
		capabilities.setCapability("sessionName", "Automation test session");
		capabilities.setCapability("sessionDescription", "");
		capabilities.setCapability("deviceOrientation", "portrait");
		capabilities.setCapability("captureScreenshots", true);
		capabilities.setCapability("browserName", "chrome");
		capabilities.setCapability("deviceGroup", "KOBITON");
		// For deviceName, platformVersion Kobiton supports wildcard
		// character *, with 3 formats: *text, text* and *text*
		// If there is no *, Kobiton will match the exact text provided
		capabilities.setCapability("deviceName", "Xperia 10 Plus");
		capabilities.setCapability("platformVersion", "9");
		capabilities.setCapability("platformName", "Android");
		
		return capabilities;
	}
	
	public DesiredCapabilities P20lite()
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		// The generated session will be visible to you only. In case you want this session available for other users, please assign this device to specific group. 
		capabilities.setCapability("sessionName", "Automation test session");
		capabilities.setCapability("sessionDescription", "");
		capabilities.setCapability("deviceOrientation", "portrait");
		capabilities.setCapability("captureScreenshots", true);
		capabilities.setCapability("browserName", "chrome");
		capabilities.setCapability("deviceGroup", "KOBITON");
		// For deviceName, platformVersion Kobiton supports wildcard
		// character *, with 3 formats: *text, text* and *text*
		// If there is no *, Kobiton will match the exact text provided
		capabilities.setCapability("deviceName", "P20 lite");
		capabilities.setCapability("platformVersion", "8.0.0");
		capabilities.setCapability("platformName", "Android");
		return capabilities;
	}
	
	public DesiredCapabilities OnePlus5()
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("sessionName", "Automation test session");
		capabilities.setCapability("sessionDescription", "");
		capabilities.setCapability("deviceOrientation", "portrait");
		capabilities.setCapability("captureScreenshots", true);
		capabilities.setCapability("browserName", "chrome");
		// The given group is used for finding devices and the created session will be visible for all members within the group.
		capabilities.setCapability("groupId", 1117); // Group: Testing
		capabilities.setCapability("deviceGroup", "KOBITON");
		// For deviceName, platformVersion Kobiton supports wildcard
		// character *, with 3 formats: *text, text* and *text*
		// If there is no *, Kobiton will match the exact text provided
		capabilities.setCapability("deviceName", "OnePlus5");
		capabilities.setCapability("platformVersion", "7.1.1");
		capabilities.setCapability("platformName", "Android");
		return capabilities;
	}
	
	
	
	public DesiredCapabilities GalaxyTabS5e()
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		// The generated session will be visible to you only. In case you want this session available for other users, please assign this device to specific group. 
		capabilities.setCapability("sessionName", "Automation test session");
		capabilities.setCapability("sessionDescription", "");
		capabilities.setCapability("deviceOrientation", "portrait");
		capabilities.setCapability("captureScreenshots", true);
		capabilities.setCapability("browserName", "chrome");
		capabilities.setCapability("deviceGroup", "KOBITON");
		// For deviceName, platformVersion Kobiton supports wildcard
		// character *, with 3 formats: *text, text* and *text*
		// If there is no *, Kobiton will match the exact text provided
		capabilities.setCapability("deviceName", "Galaxy Tab S5e");
		capabilities.setCapability("platformVersion", "9");
		capabilities.setCapability("platformName", "Android");
		return capabilities;
	}
	
	public DesiredCapabilities GalaxyS10e()
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		// The generated session will be visible to you only. In case you want this session available for other users, please assign this device to specific group. 
		capabilities.setCapability("sessionName", "Automation test session");
		capabilities.setCapability("sessionDescription", "");
		capabilities.setCapability("deviceOrientation", "portrait");
		capabilities.setCapability("captureScreenshots", true);
		capabilities.setCapability("browserName", "chrome");
		capabilities.setCapability("deviceGroup", "KOBITON");
		// For deviceName, platformVersion Kobiton supports wildcard
		// character *, with 3 formats: *text, text* and *text*
		// If there is no *, Kobiton will match the exact text provided
		capabilities.setCapability("deviceName", "Galaxy S10e");
		capabilities.setCapability("platformVersion", "9");
		capabilities.setCapability("platformName", "Android");
		return capabilities;
	}
	

}
