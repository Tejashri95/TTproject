package handleDropdownList;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class DropdownList {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://vctcpune.com/selenium/practice.html");
        
  //ScreenShot      
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File dest= new File("D:\\Screenshots\\image.jpj");
        FileHandler.copy(src, dest);
        
    // handle dropdown    
        WebElement listbox = driver.findElement(By.id("dropdown-class-example"));
        listbox .click();
        
   //Explicit wait
        WebDriverWait w = new  WebDriverWait(driver,Duration.ofMillis(1000));
       w.until(ExpectedConditions.elementToBeClickable(listbox));
       
   //Create the object of select class     
        Select s= new Select(listbox);
        s.selectByValue("option2");
        
  //popup     
        Actions a = new Actions(driver);
       WebElement alertbutton = driver.findElement(By.id("alertbtn"));
       a.click(alertbutton).perform();
        Alert alt = driver.switchTo().alert();
        alt.accept();
        
 //Actions Class
       
        WebElement mousehover = driver.findElement(By.id("mousehover"));
        a.moveToElement(mousehover).click().build().perform();
        driver.findElement(By.linkText("Top")).click();
        
  //handle multiple tab/window/child browser      
        driver.findElement(By.id("opentab")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
      //  driver.switchTo().window(null);
         Set<String> idofallpages = driver.getWindowHandles();
         
         ArrayList<String> al = new ArrayList<String>(idofallpages);
          String idofmainpage = al.get(0);
          String idofchildpage = al.get(1);
         System.out.println(al.get(0));
         System.out.println(al.get(1));
         driver.switchTo().window(idofchildpage);
         driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
         
         driver.switchTo().window(idofmainpage);
        	
        
 //keyboard actions
//      driver.findElement(By.xpath("//input[@list='mah-district']")).click();
//      for(int i=1;i<=20;i++)
//      {
//         a.sendKeys(Keys.ARROW_DOWN).click().build().perform();
//         Thread.sleep(1000); 
//        }
       
   // iframe
          driver.switchTo().frame("courses-iframe");
          WebElement text = driver.findElement(By.xpath("//h2[text()='Start Practicing Now']"));
         System.out.println(text.getText());
         
       //switch from iframe to main page  
         driver.switchTo().defaultContent();
         driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
          
  //find multiple links on webpage
         List<WebElement> links = driver.findElements(By.tagName("a"));
         System.out.println("No. of links on webpage " + (links.size()));
         
         //print name of links
         System.out.println("print name of links");
         for(WebElement l:links)
         {
        	 
        	 System.out.println(l.getText());
         }
         
        
	}
}
