package HardAssertStudyInTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualAndNotEqualEg2 {
  @Test
  public void facebook()
  {
	  System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.facebook.com/");
	
    driver.manage().window().maximize();
  // use of implicit wait   
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
    
	  WebElement text = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you ')]"));
	   String actualresult = text.getText();
	   String expectedresult = "Facebook helps you connect and share with the people in your life.";
	  // Reporter.log(result, true);
	    Assert.assertEquals(actualresult, expectedresult);
	    
  }
}
