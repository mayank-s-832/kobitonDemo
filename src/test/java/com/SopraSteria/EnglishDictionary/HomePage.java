package com.SopraSteria.EnglishDictionary;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.SopraSteria.helpers.MobileActions;
import com.SopraSteria.helpers.ReportingApp;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.windows.PressesKeyCode;

public class HomePage {
	AppiumDriver<MobileElement> driver;
	ReportingApp report;
	MobileActions mobileActions;
	String imgPath="";
	
	@FindBy(how = How.ID,using	=	"android:id/button3")
	MobileElement OkButton;
	
	@FindBy(how = How.ID,using	=	"livio.pack.lang.en_US:id/wod")
	MobileElement WordOfTheDay;
	
	@FindBy(how = How.ID,using	=	"livio.pack.lang.en_US:id/smartpager")
	MobileElement Pager;
	
	public HomePage(AppiumDriver<MobileElement> driver,ReportingApp report) {
		this.driver	=	driver;
		this.report	=	report;
		PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
		mobileActions	=	new MobileActions(driver, report);
		imgPath		=	report.imagePath;
	}
	
	public void openWordOfDay()
	{
		try {
			mobileActions.explicitWait(OkButton);
			mobileActions.click("Ok Button Clicked", imgPath, OkButton);
			mobileActions.explicitWait(WordOfTheDay);
			mobileActions.click("Word Of The Day Clicked", imgPath, WordOfTheDay);
			mobileActions.explicitWait(Pager);
			report.assertThat(Pager.isDisplayed(), "Word of the day Displayed!", "Word of the day Not Displayed!");
//			mobileActions.scrollDown();
			((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.BACK)) ;
//			((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.BACK));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
