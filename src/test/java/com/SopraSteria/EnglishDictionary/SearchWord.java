package com.SopraSteria.EnglishDictionary;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.SopraSteria.helpers.MobileActions;
import com.SopraSteria.helpers.ReportingApp;
import com.aventstack.extentreports.Status;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SearchWord {
	AppiumDriver<MobileElement> driver;
	ReportingApp report;
	MobileActions mobileActions;
	String imgPath="";
	
	@FindBy(how = How.ID,using	=	"livio.pack.lang.en_US:id/menu_search")
	MobileElement SearchButton;
	
	@FindBy(how = How.ID,using	=	"livio.pack.lang.en_US:id/search_src_text")
	MobileElement SearchBox;
	
	@FindBy(how = How.XPATH,using	=	"//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.ScrollView/a.n.a.b/android.webkit.WebView/android.webkit.WebView/android.view.View[7]")
	MobileElement WordToBeSearched;
	
	@FindBy(how = How.XPATH,using	=	"//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.ScrollView/a.n.a.b/android.webkit.WebView/android.webkit.WebView/android.widget.ListView[2]/android.view.View[1]")
	MobileElement FirstMeaning;
	
	public SearchWord(AppiumDriver<MobileElement> driver,ReportingApp report) {
		this.driver	=	driver;
		this.report	=	report;
		PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
		mobileActions	=	new MobileActions(driver, report);
		imgPath		=	report.imagePath;
	}
	
	public void searchWord(String Word)
	{
		try {
			mobileActions.explicitWait(SearchButton);
			mobileActions.click("Clicking SearchButton", imgPath, SearchButton);
			mobileActions.explicitWait(SearchBox);
			mobileActions.setText("Entering Text to be Searched", imgPath, SearchBox, Word);
			((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.ENTER)) ;
			mobileActions.explicitWait(WordToBeSearched);
			report.assertThat(WordToBeSearched.isDisplayed(), "Word Displayed", "Word Not Displayed");
			((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.BACK)) ;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
