package softAssertStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertEg1 {
  @Test
  public void kiteLogin()
  {
	  System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://kite.zerodha.com/");
      
      driver.manage().window().maximize();
      
      WebElement uid = driver.findElement(By.id("userid"));
        uid.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));   //use of implicit wait
        
        boolean textbox = uid.isDisplayed();
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(textbox, "textbox is not displayed Tc is Fail");
      //  soft.assertAll();
        
      //  soft.assertFalse(textbox, "textbox is  displayed Tc is Fail");
       // soft.assertAll();
        
        WebElement text = driver.findElement(By.xpath("//h2[text()='Login to Kite']"));
           String actualresult = text.getText();
              String expectedresult = "Login to Kite";
              
              soft.assertEquals(actualresult, expectedresult,"Actualresult and Expectedresult are not match so TC is fail");
             // soft.assertAll();
              soft.assertNotEquals(actualresult, expectedresult,"Actualresult and Expectedresult are  match so TC is fail");
              soft.assertAll();
  }
}
