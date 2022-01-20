package com.evo.commonUtils;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.apache.commons.io.FileUtils;

public class Screenshot {
	
	public static void capture(WebDriver driver,String screenshotName) {
	 
	try {
		TakesScreenshot ts = (TakesScreenshot)BrowserFactory.LaunchBrowser();
	 
		File source = ts.getScreenshotAs(OutputType.FILE);
	 
		FileUtils.copyFile(source,new File("Screenshots\\"+screenshotName+".png"));
	 
		System.out.println("Screenshot taken");
	} 
	catch (Exception e)
	{
		System.out.println("Exception while taking screenshot "+e.getMessage());
	} 
	}	
}
