package kiteBase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import kiteUtilityClass.UtilityClassReadDataFromPropertyFile;


public class BaseClassReadDatafromProprtyFile
{
	protected WebDriver driver;
	public void openApp() throws IOException
	{
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(  UtilityClassReadDataFromPropertyFile.readdatafrompropertyfile("URL"));
	
	}
	public void CloseApp()
	{
		driver.close();
	}
	

}
