package com.evo.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.evo.commonUtils.*;

public final class Home_Page {
	
	public void Dashboard() throws NumberFormatException, IOException, InterruptedException {
		BrowserFactory.LaunchBrowser().manage().timeouts().implicitlyWait(Long.parseLong(ReadConfig.getValue("implicitwait")), TimeUnit.SECONDS);
		
		WebElement ele = BrowserFactory.LaunchBrowser().findElementByXPath((ReadConfig.getValue("DashboardMM")));
		JavascriptExecutor jse = (JavascriptExecutor)BrowserFactory.LaunchBrowser();
		jse.executeScript("arguments[0].click()", ele);
		//BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("DashboardMM")).click();
		//BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("DashboardSM")).click();
		BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("ManageDashboardSM")).click();
		//BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("DashboardMM")).click();
		jse.executeScript("arguments[0].click()", ele);
	}
	
	public void UserProfile() throws NumberFormatException, IOException, InterruptedException {
		BrowserFactory.LaunchBrowser().manage().timeouts().implicitlyWait(Long.parseLong(ReadConfig.getValue("implicitwait")), TimeUnit.SECONDS);
		
		WebElement ele = BrowserFactory.LaunchBrowser().findElementByXPath((ReadConfig.getValue("UserProfileMM")));
		JavascriptExecutor jse = (JavascriptExecutor)BrowserFactory.LaunchBrowser();
		jse.executeScript("arguments[0].click()", ele);
		//BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("UserProfileMM")).click();
		BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("UserProfileSM")).click();
		//BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("UserProfileMM")).click();
		jse.executeScript("arguments[0].click()", ele);
	}
	
	public void Tasks() throws NumberFormatException, IOException, InterruptedException {
		BrowserFactory.LaunchBrowser().manage().timeouts().implicitlyWait(Long.parseLong(ReadConfig.getValue("implicitwait")), TimeUnit.SECONDS);
		
		WebElement ele = BrowserFactory.LaunchBrowser().findElementByXPath((ReadConfig.getValue("TasksMM")));
		JavascriptExecutor jse = (JavascriptExecutor)BrowserFactory.LaunchBrowser();
		jse.executeScript("arguments[0].click()", ele);
		//BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("TasksMM")).click();
		BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("TasksSM")).click();
		BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("CreateTaskSM")).click();
		//BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("TasksMM")).click();
		jse.executeScript("arguments[0].click()", ele);
	}
	
	public void Projects() throws NumberFormatException, IOException, InterruptedException {
		BrowserFactory.LaunchBrowser().manage().timeouts().implicitlyWait(Long.parseLong(ReadConfig.getValue("implicitwait")), TimeUnit.SECONDS);
		
		WebElement ele = BrowserFactory.LaunchBrowser().findElementByXPath((ReadConfig.getValue("ProjectsMM")));
		JavascriptExecutor jse = (JavascriptExecutor)BrowserFactory.LaunchBrowser();
		jse.executeScript("arguments[0].click()", ele);
		//BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("ProjectsMM")).click();
		BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("ProjectsSM")).click();
		//BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("ProjectsMM")).click();
		jse.executeScript("arguments[0].click()", ele);
	}
	
	public void Reports() throws NumberFormatException, IOException, InterruptedException {
		BrowserFactory.LaunchBrowser().manage().timeouts().implicitlyWait(Long.parseLong(ReadConfig.getValue("implicitwait")), TimeUnit.SECONDS);
		
		WebElement ele = BrowserFactory.LaunchBrowser().findElementByXPath((ReadConfig.getValue("ReportsMM")));
		JavascriptExecutor jse = (JavascriptExecutor)BrowserFactory.LaunchBrowser();
		jse.executeScript("arguments[0].click()", ele);
		//BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("ReportsMM")).click();
		BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("ReportsSM")).click();
		Thread.sleep(1500);
		BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("ManageReportsSM")).click();
		Thread.sleep(1500);
		//BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("ReportsMM")).click();
		jse.executeScript("arguments[0].click()", ele);
	}
	
	public void Directory() throws NumberFormatException, IOException, InterruptedException {
		BrowserFactory.LaunchBrowser().manage().timeouts().implicitlyWait(Long.parseLong(ReadConfig.getValue("implicitwait")), TimeUnit.SECONDS);
		
		WebElement ele = BrowserFactory.LaunchBrowser().findElementByXPath((ReadConfig.getValue("DirectoryMM")));
		JavascriptExecutor jse = (JavascriptExecutor)BrowserFactory.LaunchBrowser();
		jse.executeScript("arguments[0].click()", ele);
		//BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("DirectoryMM")).click();
		BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("DirectorySM")).click();
		//BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("DirectoryMM")).click();
		jse.executeScript("arguments[0].click()", ele);
	}
	
	public void Communications() throws NumberFormatException, IOException, InterruptedException {
		BrowserFactory.LaunchBrowser().manage().timeouts().implicitlyWait(Long.parseLong(ReadConfig.getValue("implicitwait")), TimeUnit.SECONDS);
		
		WebElement ele = BrowserFactory.LaunchBrowser().findElementByXPath((ReadConfig.getValue("CommunicationsMM")));
		JavascriptExecutor jse = (JavascriptExecutor)BrowserFactory.LaunchBrowser();
		jse.executeScript("arguments[0].click()", ele);
		//BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("CommunicationsMM")).click();
		BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("MessageSM")).click();
		Thread.sleep(3000);
		BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("AnnouncementsSM")).click();
		BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("ScreensFeedbackSM")).click();
		//BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("CommunicationsMM")).click();
		jse.executeScript("arguments[0].click()", ele);
	}
	
	public void Documents() throws NumberFormatException, IOException, InterruptedException {
		BrowserFactory.LaunchBrowser().manage().timeouts().implicitlyWait(Long.parseLong(ReadConfig.getValue("implicitwait")), TimeUnit.SECONDS);
		
		WebElement ele = BrowserFactory.LaunchBrowser().findElementByXPath((ReadConfig.getValue("DocumentsMM")));
		JavascriptExecutor jse = (JavascriptExecutor)BrowserFactory.LaunchBrowser();
		jse.executeScript("arguments[0].click()", ele);
		//BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("DocumentsMM")).click();
		BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("DocumentsSM")).click();
		Thread.sleep(1000);
		BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("DocumentRecipientSM")).click();
		Thread.sleep(1000);
		//BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("DocumentsMM")).click();
		jse.executeScript("arguments[0].click()", ele);
	}
	
	public void Help() throws NumberFormatException, IOException, InterruptedException {
		BrowserFactory.LaunchBrowser().manage().timeouts().implicitlyWait(Long.parseLong(ReadConfig.getValue("implicitwait")), TimeUnit.SECONDS);
		
		WebElement ele = BrowserFactory.LaunchBrowser().findElementByXPath((ReadConfig.getValue("HelpMM")));
		JavascriptExecutor jse = (JavascriptExecutor)BrowserFactory.LaunchBrowser();
		jse.executeScript("arguments[0].click()", ele);
		//BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("HelpMM")).click();
		BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("HelpVideoSM")).click();
		BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("MobileAppSM")).click();
		BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("ManageHelpVideoSM")).click();
		BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("ManageMobileAppSM")).click();
		//BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("HelpMM")).click();
		jse.executeScript("arguments[0].click()", ele);
	}
	
	public void DigitalBusinessCard() throws NumberFormatException, IOException, InterruptedException {
		BrowserFactory.LaunchBrowser().manage().timeouts().implicitlyWait(Long.parseLong(ReadConfig.getValue("implicitwait")), TimeUnit.SECONDS);
		
		WebElement ele = BrowserFactory.LaunchBrowser().findElementByXPath((ReadConfig.getValue("DigitalBusinessCardMM")));
		JavascriptExecutor jse = (JavascriptExecutor)BrowserFactory.LaunchBrowser();
		jse.executeScript("arguments[0].click()", ele);
		//BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("DigitalBusinessCardMM")).click();
		BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("DigitalBusinessCardSM")).click();
		//BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("DigitalBusinessCardMM")).click();
		jse.executeScript("arguments[0].click()", ele);
	}
	
	public void Admin() throws NumberFormatException, IOException, InterruptedException {
		BrowserFactory.LaunchBrowser().manage().timeouts().implicitlyWait(Long.parseLong(ReadConfig.getValue("implicitwait")), TimeUnit.SECONDS);
		
		WebElement ele = BrowserFactory.LaunchBrowser().findElementByXPath((ReadConfig.getValue("AdminMM")));
		JavascriptExecutor jse = (JavascriptExecutor)BrowserFactory.LaunchBrowser();
		jse.executeScript("arguments[0].click()", ele);
		//BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("AdminMM")).click();
		BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("ProfileModerationSM")).click();
		BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("UserStatisticsSM")).click();
		BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("ManageUsersSM")).click();
		BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("ManageRolesSM")).click();
		BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("ManagePollsSM")).click();
		BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("SettingsSM")).click();
		BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("ImpersonateUserSM")).click();
		BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("ManageBrandingsSM")).click();
		BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("DynamicContentSM")).click();
		BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("ManageUserPasswordSM")).click();
		BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("AdminLogSM")).click();
		//BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("AdminMM")).click();
		jse.executeScript("arguments[0].click()", ele);
	}
	
	public void ConrolVisibility() throws NumberFormatException, IOException, InterruptedException {
		BrowserFactory.LaunchBrowser().manage().timeouts().implicitlyWait(Long.parseLong(ReadConfig.getValue("implicitwait")), TimeUnit.SECONDS);
		
		WebElement ele = BrowserFactory.LaunchBrowser().findElementByXPath((ReadConfig.getValue("ControlVisibilityMM")));
		JavascriptExecutor jse = (JavascriptExecutor)BrowserFactory.LaunchBrowser();
		jse.executeScript("arguments[0].click()", ele);
		//BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("ControlVisibilityMM")).click();
		BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("CountrySM")).click();
		BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("CompanySM")).click();
		BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("SectorSM")).click();
		BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("ManageRootSM")).click();
		BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("ManageContractSM")).click();
		BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("ManageKPISM")).click();
		//BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("ControlVisibilityMM")).click();
		jse.executeScript("arguments[0].click()", ele);
	}
	
	public void MobileApp() throws NumberFormatException, IOException, InterruptedException {
		BrowserFactory.LaunchBrowser().manage().timeouts().implicitlyWait(Long.parseLong(ReadConfig.getValue("implicitwait")), TimeUnit.SECONDS);
		
		WebElement ele = BrowserFactory.LaunchBrowser().findElementByXPath((ReadConfig.getValue("MobileAppMM")));
		JavascriptExecutor jse = (JavascriptExecutor)BrowserFactory.LaunchBrowser();
		jse.executeScript("arguments[0].click()", ele);
		//BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("MobileAppMM")).click();
		BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("EnergyMapsSM")).click();
		//BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("MobileAppMM")).click();
		jse.executeScript("arguments[0].click()", ele);
	}
	
	public void B2C() throws NumberFormatException, IOException, InterruptedException {
		BrowserFactory.LaunchBrowser().manage().timeouts().implicitlyWait(Long.parseLong(ReadConfig.getValue("implicitwait")), TimeUnit.SECONDS);
		
		WebElement ele = BrowserFactory.LaunchBrowser().findElementByXPath((ReadConfig.getValue("B2CMM")));
		JavascriptExecutor jse = (JavascriptExecutor)BrowserFactory.LaunchBrowser();
		jse.executeScript("arguments[0].click()", ele);
		//BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("B2CMM")).click();
		BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("B2CCategoriesSM")).click();
		BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("B2CSubCategoriesSM")).click();
		BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("B2CServicesSM")).click();
		BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("B2CPackageSM")).click();
		BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("B2CPlanSM")).click();
		BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("B2CPlanLineSM")).click();
		BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("B2CContractSM")).click();
		BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("B2COrderSM")).click();
		BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("UserPackagesSM")).click();
		//BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("B2CMM")).click();
		jse.executeScript("arguments[0].click()", ele);
	}
	
	public void ApplicationVersion() throws NumberFormatException, IOException, InterruptedException {
		BrowserFactory.LaunchBrowser().manage().timeouts().implicitlyWait(Long.parseLong(ReadConfig.getValue("implicitwait")), TimeUnit.SECONDS);
		
		BrowserFactory.LaunchBrowser().findElementByXPath(ReadConfig.getValue("ApplicationVersion")).click();
	}

}
