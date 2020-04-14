
package com.SopraSteria.helpers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.SopraSteria.Kobiton.Executors.Executor;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class ReportingApp {

	public String folderName;
	public String screenshotsFolder;
	public String folder;
	public String folderpath;
	AppiumDriver<MobileElement> driver;
	public ExtentReports extentReports;
	public ExtentHtmlReporter ear ;
	public ExtentTest test;
	
	Date date 												= new Date();
	public String imagePath 								= "";
	DateFormat dateFormat 									= new SimpleDateFormat("dd_MMM_yyyy__hh_mm_ss_SSaa");
	public String osName 							= "";
	public String screeenResolution 					= "";
	public String browserName 						= "";
	
	
	public ReportingApp() {	}

	public ReportingApp(AppiumDriver<MobileElement> driver, String browserCode){
		
		try {
			this.driver 		= driver;
			
			Thread.sleep(2000);

			switch(browserCode) {
				
			case "Android" :
				
				osName 				= "Automation";
				browserName 		= "Android_App";
				break;
				
			case "iOS" :
				
				osName 				= "Automation";
				browserName 		= "iOS_App";
				break;
				
				default:
				break;
				
			}
					
			
			createFolder(osName, browserName, Executor.fileTimestamp);
			ear						= new ExtentHtmlReporter(folderpath +File.separator+osName+"_"+browserName+"_Report.html");
			ear.loadXMLConfig(new File("TestData\\extent-config.xml"));
			extentReports 			= new ExtentReports();
			extentReports.attachReporter(ear);
			
			extentReports.flush();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public void createTest(String s)
	{
		test	=	extentReports.createTest(s);
	}

	
		
	public String createFolder(String osName, String browserName, String Uniqueid) {
		
		String basePath 	= new File("").getAbsolutePath();
		folderName 			= "";
		
		try {
			
			File file 		= new File(basePath + File.separator + "Reports");
			
			if (!file.exists()) { 
				if (file.mkdir()) {} }
			
			folderName 		= basePath + File.separator + "Reports" + File.separator + Uniqueid;
			file 			= new File(folderName);
			
			if (!file.exists()) { 
				if (file.mkdir()) {} 
				else {
					System.out.println("Could Not Create Directory "+folderName);
					Files.createDirectory(file.toPath());
				}}
			
			System.out.println("browserName - " + browserName);
			
			System.out.println(file.getAbsolutePath());
			
			file 			= new File(folderName + File.separator + "Screenshots");
			if (!file.exists())
			{
				if (file.mkdir()) {
					screenshotsFolder = folderName + File.separator + "Screenshots";
				}
				else {
					System.out.println("Could Not Create Directory "+folderName);
					Files.createDirectory(file.toPath());
				}
			}
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		setFolderpath(folderName);
		setfolder(Uniqueid);
		return folderName;
		
	}
	
	
	
	public void setFolderpath(String folderpath) {
		
		this.folderpath = folderpath;
		imagePath 		= folderpath + File.separator + "Screenshots" + File.separator;
		
	}

	
	public void setfolder(String foldername) {
		this.folder = foldername;
	}

	
	public static String generateCurrentDateNumber() {
		
		Date dNow 				= new Date();
		SimpleDateFormat sFrmt 	= new SimpleDateFormat("ddMMMyyyy_hhmmss_SSaa");
		String folderName 		= sFrmt.format(dNow);
		
		return folderName;
	}


	public String getscreenshot(String fileName, MobileElement element) {
		
		DateFormat dateFormat 	= new SimpleDateFormat("dd_MMM_yyyy__hh_mm_ss_SSaa");
		Date date 				= new Date();
		String screenshotfile 	= dateFormat.format(date) + ".png";
		
		try  {
			
			if (element != null) {
				
				FileUtils.copyFile(((TakesScreenshot) this.driver).getScreenshotAs(OutputType.FILE), new File(fileName+screenshotfile));
				
			} else {
				FileUtils.copyFile(((TakesScreenshot) this.driver).getScreenshotAs(OutputType.FILE), new File(fileName+screenshotfile));
			}
			
		} catch (Exception e) {

			try {
				FileUtils.copyFile(((TakesScreenshot) this.driver).getScreenshotAs(OutputType.FILE), new File(fileName+screenshotfile));
			} catch(Exception e1) {
				e1.printStackTrace();
			}

			e.printStackTrace();
		}
		
		return "Screenshots/" + screenshotfile;
	}

	
	public String getscreenshot(String fileName) {
		
		DateFormat dateFormat 	= new SimpleDateFormat("dd_MMM_yyyy__hh_mm_ss_SSaa");
		Date date 				= new Date();
		String screenshotfile 	= dateFormat.format(date) + ".png";
		
		try {
			FileUtils.copyFile(((TakesScreenshot) this.driver).getScreenshotAs(OutputType.FILE), new File(fileName+screenshotfile));			
		} catch(Exception e1) {
			e1.printStackTrace();
		}

		return "Screenshots/" + screenshotfile;
	}

	
	
	public void logStepToReport(Status status, String Details, String filenamePath,MobileElement element) {
	
		if(!filenamePath.equalsIgnoreCase("")) {
			
			try {
				
				test.log(status, "<font color=800080> <b> "+Details+" </b></font> "+"<div align='right' style='float:right'><a "+ NewWindowPopUpHTMLCode() + " target='_blank' href="+ getscreenshot(filenamePath, element) + ">Screenshot</a></div>");
				
			} catch(Exception e) {
				test.log(status, "<font color=800080> <b> "+Details+" </b></font> "+ "<div align='right' style='float:right'>Unable to take screenshot</div>");
			}
			
		} else {
			test.log(status,  Details);
		}
		
		extentReports.flush();
	}
	
	public void verifyCondition(boolean conditionToCheck, String passMessage, String failMessage) {
		
		if (conditionToCheck) {
			assertThat(true, passMessage, failMessage);
		} else {
			assertThat(false, passMessage, failMessage);
		}
	}

	
	public void assertThat(boolean status,String passMessage, String failMessage) {
		
		if(!status) {
			
			String line2 = " Expected - " + passMessage + "<br> <b> <font color='red'> Actual - " + failMessage;
			
			test.log(Status.FAIL, "<font color=800080> <b> Verification Point"+ line2 + "<div align='right' style='float:right'><a " + NewWindowPopUpHTMLCode() + " target='_blank' href="+ getscreenshot(imagePath) + ">Screenshot</a></div>");
			
		} else {
						
			String line2 = " Expected - " + passMessage + "<br> <b> <font color='green'> Actual - " + passMessage;
			
			test.log(Status.PASS, "<font color=800080> <b> Verification Point"+ line2 + "<div align='right' style='float:right'><a " + NewWindowPopUpHTMLCode() + " target='_blank' href="+ getscreenshot(imagePath) + ">Screenshot</a></div>");
			
		}
		
		extentReports.flush();
		
	}
	
	
	public void endTestCase()	{
		System.out.println("Report Folder Path: "+folderName);
		extentReports.flush();
		
	}

	
	public static void copyFile(String fromLocation, String toLocation) throws Exception {
		
		FileInputStream instream 	= null;
		FileOutputStream outstream 	= null;
	 
    	try {
    		
    	    File infile 			= new File(fromLocation);
    	    File outfile 			= new File(toLocation);
    	    instream 				= new FileInputStream(infile);
    	    outstream 				= new FileOutputStream(outfile);
    	    byte[] buffer 			= new byte[1024];
 
    	    int length;
    	    
    	     
    	    while ((length = instream.read(buffer)) > 0){
    	    	outstream.write(buffer, 0, length);
    	    }

    	    instream.close();
    	    outstream.close();

    	    System.out.println("File copied successfully!!");
 
    	}catch(Exception ioe){
    		ioe.printStackTrace();
    	}
	}

	public void logVisualStepToReport(Status status, String stepname) {
		test.log(status, "<b>"+stepname+"</b>");
		extentReports.flush();
	}
	
	
	public static String NewWindowPopUpHTMLCode() {
		
		return "onclick = \"window.open(this.href,'newwindow', 'width=" + "1000" + ",height=" + "500" + "');return false;\"";
		
	}

	public void setdriver(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	
}
