package HardAssertStudyInTestNG;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertTrueAndAssertFalseStudy {
  @Test
  public void validatefacebookpage()
  {
	  System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.facebook.com/");
      driver.manage().window().maximize();
      WebElement emailtextbox = driver.findElement(By.id("email"));
      boolean a = emailtextbox.isDisplayed();
    Assert.assertTrue(a, "a is not true test case is fail");
    
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
      
     WebElement createnewaccountbutton = driver.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 _6')]"));
      boolean button = createnewaccountbutton.isEnabled();
    Assert.assertTrue(button, "Button is not Enabled then Test Case is Fail");
    createnewaccountbutton.click();
    
  // WebElement female = driver.findElement(By.className("_58mt"));
  // boolean checkbox = female.isSelected();
  // Assert.assertFalse(checkbox, "Checkbox is not Selected");
   
   WebElement female = driver.findElement(By.xpath("(//input[@class='_8esa'])[1]"));
   female.click();
   boolean checkbox = female.isSelected();
   Assert.assertTrue(checkbox, "Checkbox is not Selected");
    
    
  }
}
