package com.evo.testcases;

import java.io.IOException;
import java.util.Date;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.evo.commonUtils.*;
import com.evo.pages.Login_Page;

public class Login_test {
	
	Login_Page login = new Login_Page();
	
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
	public void TC001_Login() throws Exception {
		String UsrName = DataFile.CellData(1, 0);
		String Psword = DataFile.CellData(1, 1);
		login.setUsername(UsrName);
		login.setPassword(Psword);
		login.clickLogin();
	}

}
