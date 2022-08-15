package serialExecutionOfTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest1ForSerialExecution {
  @Test
  public void kitelaunch()
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe ");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://kite.zerodha.com/");
	  driver.manage().window().maximize();
	  Reporter.log("First Kite Launch", true);
	  
	  
  }
}
