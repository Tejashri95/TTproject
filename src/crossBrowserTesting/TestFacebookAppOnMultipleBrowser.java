package crossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestFacebookAppOnMultipleBrowser
{
 WebDriver driver=null;
  @Parameters("browsername")
  
 @Test
  public void facebookLaunch(String Bname) 
  {
		
	  if(Bname.equals("chrome"))
	  {
	  System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
       driver = new ChromeDriver();
	  }
	  else if(Bname.equals("firefox"))
	  {
      System.setProperty("webdriver.gecko.driver","D:\\chromedriver_win32\\geckodriver.exe");
       driver = new FirefoxDriver();
     
	  }
	  
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
  }
  
}
