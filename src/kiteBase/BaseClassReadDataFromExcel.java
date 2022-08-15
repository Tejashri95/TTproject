package kiteBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;

public class BaseClassReadDataFromExcel
{
	
	protected WebDriver driver;
	
// Setting to run on single browser
	
//	public void OpenApplication()
//	{
//		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://kite.zerodha.com");
//	}
//	public void closedriver()
//	{
//		driver.close();
//		
//	}

	// Setting to test on  Crossbrowser
	
	public void OpenApplication(String Bname)
	{
		if(Bname.equals("chrome"))
		{
			
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		}
		else if (Bname.equals("firefox"))
		{
			 System.setProperty("webdriver.gecko.driver","D:\\chromedriver_win32\\geckodriver.exe");
		       driver = new FirefoxDriver();
		     
		}
		driver.get("https://kite.zerodha.com");
		driver.manage().window().maximize();
		
	}
	public void closedriver()
	{
		driver.close();
		
	}
}
