package kiteUtilityClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClassReadDataFromPropertyFile
{
	public static String readdatafrompropertyfile(String key) throws IOException
	{
	// 1 create the object of properties class
		Properties prop = new Properties();
		
  // 2 create the object of file
		FileInputStream myfile = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\javapractice\\src\\javastudy\\MySelenium\\PropertyFile.properties");
		
		prop.load(myfile);	
		String value = prop.getProperty(key);
		return value;
	}
	public static void CaptureScreenshot(WebDriver driver,String TCID) throws IOException
	{
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\Screenshots\\TC "+ TCID + ".png");
		FileHandler.copy(src, dest);
	}
	public static void waits(WebDriver driver,int timemillisecond)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
	}

}
