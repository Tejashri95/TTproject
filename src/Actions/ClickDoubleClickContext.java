package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickDoubleClickContext {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
		WebElement button = driver.findElement(By.id("doubleClickBtn"));
		a.doubleClick( button).perform();
		Thread.sleep(1000);
		
		WebElement rightclickbutton = driver.findElement(By.id("rightClickBtn"));
        a.contextClick(rightclickbutton).perform();
        Thread.sleep(1000);
        
//        WebElement clickbutton = driver.findElement(By.xpath("//button[@id='4pzzQ']"));
//        a.click(clickbutton).perform();
        
        
        
		
		
	}

}
