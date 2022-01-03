package com.evo.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import com.evo.commonUtils.*;

public class Login_Page {
	
	public void setUsername(String data) throws IOException, InterruptedException  {
		BrowserFactory.LaunchBrowser().manage().timeouts().implicitlyWait(Long.parseLong(ReadConfig.getValue("implicitwait")), TimeUnit.SECONDS);
		
		BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("username")).clear();
		BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("username")).sendKeys(data);
	}
	
	public void setPassword(String data) throws IOException, InterruptedException {
		BrowserFactory.LaunchBrowser().manage().timeouts().implicitlyWait(Long.parseLong(ReadConfig.getValue("implicitwait")), TimeUnit.SECONDS);
		
		BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("Password")).clear();
		BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("Password")).sendKeys(data);
	}
	
	public void clickLogin() throws IOException, InterruptedException {
		BrowserFactory.LaunchBrowser().manage().timeouts().implicitlyWait(Long.parseLong(ReadConfig.getValue("implicitwait")), TimeUnit.SECONDS);
		
		BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("Loginbtn")).click();
		
		try {
			WebElement box = BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("LoginAlertbox"));
			box.isDisplayed();
			BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("LoginAlertboxbtn")).click();
			System.out.println("Login alertbox clicked");
		}
		catch (Exception e) {
			System.out.println("No alert while login");
		}

	}
}