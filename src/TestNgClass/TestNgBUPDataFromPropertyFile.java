package TestNgClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kiteBase.BaseClassReadDatafromProprtyFile;
import kitePOMClasspart2.KiteHomePage;
import kitePOMClasspart2.KiteLoginPage;
import kitePOMClasspart2.KitePinPage;
import kiteUtilityClass.UtilityClassReadDataFromExcel;
import kiteUtilityClass.UtilityClassReadDataFromPropertyFile;


public class TestNgBUPDataFromPropertyFile extends BaseClassReadDatafromProprtyFile 
{
	 KiteLoginPage login;
	 KitePinPage pin;
	 KiteHomePage home;
	@BeforeClass
	public void launchbrowser() throws IOException
	{
		openApp();
		Reporter.log("Application is open", true);
		 login = new  KiteLoginPage(driver);
		 pin = new KitePinPage(driver);
		 home = new  KiteHomePage(driver);
		
	}
	@BeforeMethod
	public void loginUserid() throws IOException
	{
		login.senduserid(  UtilityClassReadDataFromPropertyFile.readdatafrompropertyfile("UN"));
		login.sendpassword(  UtilityClassReadDataFromPropertyFile.readdatafrompropertyfile("PWD"));
		login.clickonloginbutton();
		Reporter.log("Login successfull", true);
		 UtilityClassReadDataFromPropertyFile.waits(driver, 100);
		 
		 pin.sendpin(  UtilityClassReadDataFromPropertyFile.readdatafrompropertyfile("PIN"));
		 pin.clickoncontinuebutton();
		 Reporter.log("Entering pin", true);
		 UtilityClassReadDataFromPropertyFile.waits(driver, 100);
	}
  @Test
  public void Validateuserid() throws IOException
  {
	  Assert.assertEquals(home.validateuserid(),   UtilityClassReadDataFromPropertyFile.readdatafrompropertyfile("UN"),"TC is fail becoz actual and expected is not match");
	  Reporter.log("Validating UseridTc", true);
	  String TCID="SS2";
	  UtilityClassReadDataFromPropertyFile.CaptureScreenshot(driver, TCID);
	  Reporter.log("Taking the ScreenShot", true);
  }
  @AfterMethod
  public void logoutapp()
  {
	  home.clicklogoutbutton();
	  Reporter.log("Logout the Application ", true);
  }
  @AfterClass
  public void closebrowser()
  {
	  CloseApp();
	  Reporter.log("Browser is close", true);
  }
}
