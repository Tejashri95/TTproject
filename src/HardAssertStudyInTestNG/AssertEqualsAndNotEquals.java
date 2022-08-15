package HardAssertStudyInTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEqualsAndNotEquals {
  @Test
  public void validatekiteUID()
  {
	  System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
  
      driver.get("https://kite.zerodha.com/");
      WebElement username = driver.findElement(By.id("userid"));
      boolean textbox = username.isDisplayed();
      Assert.assertTrue(textbox, "Textbox not displayed so TC is Failed");
      
      WebElement password = driver.findElement(By.id("password"));
      
      boolean PWDtextbox = password.isDisplayed();
      Assert.assertTrue(PWDtextbox, "PWDtestbox is  not displayed");
      username.click();
      username.sendKeys("ELR321");
      
      password.click();
      password.sendKeys("Dhana1111");
       driver.findElement(By.xpath("//button[@type='submit']")).click();
    //use implict wait
       driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
     
   // pin page
     WebElement pin = driver.findElement(By.id("pin"));
     pin.click();
     pin.sendKeys("982278");
     driver.findElement(By.xpath("//button[@type='submit']")).click();
       
       //use implict wait
       driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
       
    //run assertequal and assertnotequal   one by one
      WebElement text = driver.findElement(By.xpath("//span[text()='ELR321']"));
//         String actualresult = text.getText();
//         String expectedresult = "ELR321";
//         Assert.assertEquals(actualresult, expectedresult,"actualresult and expectedresult is not equal so test case is fail");
//     
         String actualresult1 = text.getText();
         String expectedresult1 = "ELR323";
         Assert.assertNotEquals(actualresult1, expectedresult1,"actualresult and expectedresult is equal so test case is fail");
      
      
      
      
      
      
      
      
      
      
      
      
      
  }
}
