package kiteAppPOM;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class ValidateUserIDKiteApp 
{
	
	WebDriver driver=null;
	File f;
	Sheet mysheet ;
	KitePOMClassForLoginPage login;
	KitePOMClassForPinPage pin;
	KitePOMClassForHomePage home;
	
 @Parameters("browsername")
 @BeforeClass
	  public void launchkite(String Bname) throws EncryptedDocumentException, IOException
 {
	 if(Bname.equals("chrome"))
	 {
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		 
	 }
	 else if(Bname.equals("firefox"))
	 {
		 System.setProperty("webdriver.gecko.driver","D:\\chromedriver_win32\\geckodriver.exe");
	       driver = new FirefoxDriver();
	 }
	   driver.manage().window().maximize();
	   driver.get("https://kite.zerodha.com");
	   Reporter.log("Browser is launching", true);
	   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	   f = new File("D:\\MyExcel.xlsx");
	   mysheet = WorkbookFactory.create(f).getSheet("Sheet2");
	   login = new KitePOMClassForLoginPage(driver);
	   pin = new KitePOMClassForPinPage(driver);
	   home = new KitePOMClassForHomePage(driver);
 }
 
  @BeforeMethod
  public void loginkite()
  {
	  login.sendusername(mysheet.getRow(0).getCell(0).getStringCellValue());
	  login.sendpassword(mysheet.getRow(0).getCell(1).getStringCellValue());
	  login.clickonloginbutton();
	  Reporter.log("clicking on login button", true);
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  pin.sendpin(mysheet.getRow(0).getCell(2).getStringCellValue());
	  pin.clickoncontinuebutton();
	  Reporter.log("clicking on continue button", true);
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
  }
 
  @Test
  public void validateuserid()
  {
	  String expecteduserid = mysheet.getRow(0).getCell(0).getStringCellValue();
	  String actualuserid = home.validateuserID();
	  Assert.assertEquals(actualuserid, expecteduserid,"Actual And Expected userid is not matching so TC is pass");
	  Reporter.log("Validating userID", true);
  }
 @AfterMethod
  public void logoutkite()
  {
	  home.clicklogoutbutton();
	  Reporter.log("clicking on logout button", true);
	  
  }

 

  @AfterClass
  public void closekite() 
  {
	  driver.close();
	  Reporter.log("Browser is close", true);
  }

}
