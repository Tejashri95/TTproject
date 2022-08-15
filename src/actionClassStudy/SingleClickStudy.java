package actionClassStudy;



import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SingleClickStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/");
		Thread.sleep(1000);
		
		// perform click actions
		//create the obj. of action class
		Actions a = new Actions(driver);
		
		
		WebElement startseleniumpractice = driver.findElement(By.linkText("Start Selenium Practice"));
		Thread.sleep(1000);
		
		//first way
		//a.click(startseleniumpractice ).perform();
		
		//second way
		a.moveToElement(startseleniumpractice ).build().perform();
		Thread.sleep(1000);
		
		//a.click().perform();
		
		
		//move towards the another element
		WebElement text = driver.findElement(By.xpath("//a[contains(text(),'Click to Start Selenium Practice Now')]"));
		Thread.sleep(1000);
		a.click(text).perform();
		Thread.sleep(1000);
		
//         a.moveToElement(text).build().perform();
//         Thread.sleep(1000);
//         a.click().perform();
        
       //change focus of selenium from main page to child page
      //find id of all pages
		Set<String> idofallpages = driver.getWindowHandles();
		
		ArrayList<String> al = new ArrayList<String>(idofallpages);
		String idofmainpage = al.get(0);
		String idfchildpage = al.get(1);
		System.out.println(idofmainpage);
		System.out.println(idfchildpage );
        driver.switchTo().window(idfchildpage);
        Thread.sleep(1000);
        
		 WebElement aboutus = driver.findElement(By.xpath("//a[contains(text(),'About Us')]"));
		 a.moveToElement(aboutus).build().perform();
		// a.click(aboutus).perform();
		 Thread.sleep(1000);
		 
		 WebElement radio1 = driver.findElement(By.xpath("//input[contains(@value,'Radio1')]"));
		 a.moveToElement(radio1).build().perform();
		 a.click().perform();
		 Thread.sleep(1000);
		 
		 WebElement textbox = driver.findElement(By.xpath("//input[contains(@id,'autocomplete')]"));
		 a.moveToElement(textbox).build().perform();
		 a.click().perform();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//input[contains(@id,'autocomplete')]")).sendKeys("Selenium");
		 
		 
		 
		 
		
	}

}


