package actionClassStudy;
    import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	
	public class KeyboardActionStudy {
		
		public static void main(String[] args) throws InterruptedException {
			 System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.facebook.com/r.php?local=en_GB&display=page");
				Thread.sleep(1000);
				
				//driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
				//Thread.sleep(1000);
				
				Actions a = new Actions (driver);
				
				WebElement day = driver.findElement(By.id("day"));
				a.click(day).perform();
			
				Thread.sleep(1000);
	            a.sendKeys(Keys.ARROW_DOWN ).perform();
	            Thread.sleep(100);
	            a.sendKeys(Keys.ARROW_DOWN ).perform();
	            Thread.sleep(100);
	            a.sendKeys(Keys.ARROW_DOWN ).perform();
	            Thread.sleep(100);
	            a.sendKeys(Keys.ARROW_DOWN ).perform();
	            Thread.sleep(100);
	            a.sendKeys(Keys.ARROW_DOWN ).perform();
	            Thread.sleep(100);
	            a.sendKeys(Keys.ARROW_DOWN ).perform();
	            Thread.sleep(100);
	            a.sendKeys(Keys.ARROW_DOWN ).perform();
	            Thread.sleep(100);
	            a.sendKeys(Keys.ENTER ).perform();
	            Thread.sleep(1000);
	            
	           WebElement month = driver.findElement(By.id("month"));
	           a.click(month).perform();
	           Thread.sleep(1000);
	            a.sendKeys(Keys.ARROW_DOWN).perform();
	            Thread.sleep(100);
	            a.sendKeys(Keys.ARROW_DOWN).perform();
	            Thread.sleep(100);
	            a.sendKeys(Keys.ENTER).perform();
	            Thread.sleep(1000);
	            
	            
	            WebElement year = driver.findElement(By.id("year"));
	            a.click(year).perform();
	            Thread.sleep(1000);
	            a.sendKeys(Keys.ARROW_DOWN).perform();
	            Thread.sleep(100);
	            a.sendKeys(Keys.ARROW_DOWN).perform();
	            Thread.sleep(100);
	            a.sendKeys(Keys.ARROW_DOWN).perform();
	            Thread.sleep(100);
	            a.sendKeys(Keys.ARROW_DOWN).perform();
	            Thread.sleep(100);
	            a.sendKeys(Keys.ARROW_DOWN).perform();
	            Thread.sleep(100);
	            a.sendKeys(Keys.ARROW_DOWN).perform();
	            Thread.sleep(100);
	            a.sendKeys(Keys.ARROW_DOWN).perform();
	            Thread.sleep(100);
	            a.sendKeys(Keys.ARROW_DOWN).perform();
	            Thread.sleep(100);
	            a.sendKeys(Keys.ARROW_DOWN).perform();
	            Thread.sleep(100);
	            a.sendKeys(Keys.ARROW_DOWN).perform();
	            Thread.sleep(100);
	            a.sendKeys(Keys.ARROW_DOWN).perform();
	            Thread.sleep(100);
	            a.sendKeys(Keys.ARROW_DOWN).perform();
	            Thread.sleep(100);
	            a.sendKeys(Keys.ARROW_DOWN).perform();
	            Thread.sleep(100);
	            a.sendKeys(Keys.ARROW_DOWN).perform();
	            Thread.sleep(100);
	            a.sendKeys(Keys.ARROW_DOWN).perform();
	            Thread.sleep(100);
	            a.sendKeys(Keys.ARROW_DOWN).perform();
	            Thread.sleep(100);
	            a.sendKeys(Keys.ARROW_DOWN).perform();
	            Thread.sleep(100);
	            a.sendKeys(Keys.ARROW_DOWN).perform();
	            a.sendKeys(Keys.ARROW_DOWN).perform();
	            a.sendKeys(Keys.ARROW_DOWN).perform();
	            a.sendKeys(Keys.ARROW_DOWN).perform();
	            a.sendKeys(Keys.ARROW_DOWN).perform();
	            a.sendKeys(Keys.ARROW_DOWN).perform();
	            a.sendKeys(Keys.ARROW_DOWN).perform();
	            a.sendKeys(Keys.ARROW_DOWN).perform();
	            a.sendKeys(Keys.ARROW_DOWN).perform();
	            a.sendKeys(Keys.ARROW_DOWN).perform();
	            
	            a.sendKeys(Keys.ENTER).perform();
	            Thread.sleep(1000);
	            
	            WebElement female = driver.findElement(By.className("_58mt"));
	            a.click(female).perform();
	            
	            
	            
	            
	            
	            
	          
	           
	            
		}

	


}
