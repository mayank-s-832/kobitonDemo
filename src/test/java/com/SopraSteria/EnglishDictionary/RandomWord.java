package com.SopraSteria.EnglishDictionary;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.SopraSteria.helpers.MobileActions;
import com.SopraSteria.helpers.ReportingApp;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RandomWord {
	AppiumDriver<MobileElement> driver;
	ReportingApp report;
	MobileActions mobileActions;
	String imgPath="";
	
	@FindBy(how = How.ID,using	=	"livio.pack.lang.en_US:id/random")
	MobileElement RandomWord;
	
	@FindBy(how = How.XPATH,using	=	"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.ScrollView/a.n.a.b/android.webkit.WebView[2]/android.webkit.WebView/android.view.View[2]")
	MobileElement RandomWordDisplayed;
	
	public RandomWord(AppiumDriver<MobileElement> driver,ReportingApp report) {
		this.driver	=	driver;
		this.report	=	report;
		PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
		mobileActions	=	new MobileActions(driver, report);
		imgPath		=	report.imagePath;
	}
	
	public void viewRandomWord()
	{
		mobileActions.explicitWait(RandomWord);
		mobileActions.click("Clicking Random Word", imgPath, RandomWord);
		mobileActions.explicitWait(RandomWordDisplayed);
		report.assertThat(RandomWordDisplayed.isDisplayed(), "Random Word Is Displayed", "Random Word Is Not Displayed");
	}
}
