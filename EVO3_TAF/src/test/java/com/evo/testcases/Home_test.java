package com.evo.testcases;

import java.io.IOException;
import java.util.Date;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.evo.commonUtils.BrowserFactory;
import com.evo.commonUtils.Screenshot;
import com.evo.pages.Home_Page;

public class Home_test {
	
	Home_Page home = new Home_Page();
	
	static Date currentdate = new Date();
	static String sname = currentdate.toString().replace(" ","_").replace(":","-");
	
	@AfterMethod 
	public void takeScreenShotOnFailure(ITestResult testResult) throws IOException, InterruptedException { 
		String methodname = testResult.getName();
		if (testResult.getStatus() == ITestResult.FAILURE) { 
			Screenshot.capture(BrowserFactory.LaunchBrowser(), (methodname+"_"+sname));
		} 
	}
	
	@Test
	public void TC001_Dashboard() throws Exception {
		home.Dashboard();
	}
	
	@Test
	public void TC002_UserProfile() throws Exception {
		home.UserProfile();
	}
	
	@Test
	public void TC003_Tasks() throws Exception {
		home.Tasks();
	}
	
	@Test
	public void TC004_Projects() throws Exception {
		home.Projects();
	}
	
	@Test
	public void TC005_Reports() throws Exception {
		home.Reports();
	}
	
	@Test
	public void TC006_Directory() throws Exception {
		home.Directory();
	}
	
	@Test
	public void TC007_Communications() throws Exception {
		home.Communications();
	}
	
	@Test
	public void TC008_Documents() throws Exception {
		home.Documents();
	}
	
	@Test
	public void TC009_Help() throws Exception {
		home.Help();
	}
	
	@Test
	public void TC010_DigitalBusinessCard() throws Exception {
		home.DigitalBusinessCard();
	}
	
	@Test
	public void TC011_Admin() throws Exception {
		home.Admin();
	}
	
	@Test
	public void TC012_ConrolVisibility() throws Exception {
		home.ConrolVisibility();
	}
	
	@Test
	public void TC013_MobileApp() throws Exception {
		home.MobileApp();
	}
	
	@Test
	public void TC014_B2C() throws Exception {
		home.B2C();
	}
	
	@Test
	public void TC015_ApplicationVersion() throws Exception {
		home.ApplicationVersion();
	}

}
