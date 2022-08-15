package TestNgClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import kiteBase.BaseClassReadDataFromExcel;

import kitePOMClasspart2.KiteHomePage;
import kitePOMClasspart2.KiteLoginPage;
import kitePOMClasspart2.KitePinPage;
import kiteUtilityClass.UtilityClassReadDataFromExcel;

public class ValidateUNBUPDataFromExcel extends BaseClassReadDataFromExcel{
	 KiteLoginPage login;        
	 KitePinPage pin;
	 
	KiteHomePage home;
  @Parameters("browsername")
  @BeforeClass
  public void launchkite() throws  IOException
  {
	 //calling openapplication non static method from BaseClass 
	  OpenApplication("Bname");
	  //OpenApplication("firefox");
	  Reporter.log("Application is open", true);
	  
	//calling readdatafromexcel  static method from  Utility Class
//	 String UID = Utility.readdatafromexcel(0, 0);
//	 String PWD = Utility.readdatafromexcel(0, 1);
//	 String PIN = Utility.readdatafromexcel(0, 2);
  }
  @BeforeMethod
  public void loginkite() throws IOException {
	  WebDriver driver=null;
	//calling non static method from  KiteLoginPage Class
	  login = new  KiteLoginPage(driver);
	  login.senduserid( UtilityClassReadDataFromExcel.readdatafromexcel(0, 0));
	  login.sendpassword(UtilityClassReadDataFromExcel.readdatafromexcel(0, 1));
	  login.clickonloginbutton();
	  Reporter.log("Login Successfull", true);
	  
	//calling waits static method from   Utility  Class
	  UtilityClassReadDataFromExcel.waits(driver, 1000);
  //calling non static method from  KitepinPage Class
	  pin = new  KitePinPage(driver);
	  pin.sendpin(UtilityClassReadDataFromExcel.readdatafromexcel(0, 2));
	  pin.clickoncontinuebutton();
	  Reporter.log("Entering pin", true);
	  
	//calling waits static method from   Utility  Class
	  UtilityClassReadDataFromExcel.waits(driver, 1000);
	  
  }
  @Test
  public void validateuserid() throws  IOException
  {
	  WebDriver driver=null;
	//calling non static method from  KitehomePage Class
	 home = new  KiteHomePage(driver);
	 Assert.assertEquals( home.validateuserid(), UtilityClassReadDataFromExcel.readdatafromexcel(0, 0) ,"Actual and Expected userid is not equals so TC is Fail");
	
	 String TCID = "12";
	//calling captureScreenshot static method from   Utility  Class
	  UtilityClassReadDataFromExcel.captureScreenshot(driver,TCID); 
	  
  }
  @AfterMethod
  public void logoutkite()
  {
	  home.clicklogoutbutton(); 
  }
  
  @AfterClass
  public void closebrowser()
  {
	  closedriver();
  }
}
