package kiteAppPOM;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
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
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class KiteEndToEndTestingUsingTestNG
{
	WebDriver driver;
	File f;
	Sheet mysheet;
	 KitePOMClassForLoginPage login ;
	 KitePOMClassForPinPage pin;
	 KitePOMClassForHomePage home;
	 
	
 @BeforeClass
 public void launchkite() throws EncryptedDocumentException, IOException
 {
	 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://kite.zerodha.com");
	 Reporter.log("Browser is launching", true);
	 // use of implicit wait
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	 f = new File("D:\\MyExcel.xlsx");
	 mysheet = WorkbookFactory.create(f).getSheet("Sheet2");
	 login = new KitePOMClassForLoginPage(driver);
	 pin= new KitePOMClassForPinPage(driver);
	 home = new  KitePOMClassForHomePage(driver);
	 
 }
 
 @BeforeMethod
  public void kitelogin()
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
	 String expecteduserid =mysheet.getRow(0).getCell(0).getStringCellValue();
	 String actualuserid = home.validateuserID();
	 Assert.assertEquals(actualuserid, expecteduserid,"Actual and Expected Userid is not matching so test case is fail");
	 Reporter.log("validating userID", true);
 }
 
 @AfterMethod
  public void kitelogout()
 {
	 home.clicklogoutbutton();
	 Reporter.log("clicking on logout button", true);
 }

 
  @AfterClass
  public void closekite()
  {
	  driver.close();
	  Reporter.log("Browser is closing", true);
  }

}
