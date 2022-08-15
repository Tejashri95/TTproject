package iframe;
    import java.io.File;
	import java.io.IOException;

	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.io.FileHandler;
	import org.openqa.selenium.support.ui.Select;

	public class AlertPopupEg3 {

		public static void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[contains(text(),'Not a Friendly ')]"));//main page
			Thread.sleep(1000);
			driver.switchTo().frame("frame1");
			Thread.sleep(1000);
			 WebElement topic = driver.findElement(By.tagName("input"));
			Thread.sleep(1000);
			topic.click();
			Thread.sleep(1000);
			topic.sendKeys("Hii Hellow");  
			Thread.sleep(1000);
			driver.switchTo().frame("frame3");
			Thread.sleep(1000);
			driver.findElement(By.id("a")).click();
			Thread.sleep(1000);
			driver.switchTo().defaultContent();
			Thread.sleep(1000);
			driver.switchTo().frame("frame2");
			Thread.sleep(1000);
			WebElement animal = driver.findElement(By.id("animals"));
			Thread.sleep(1000);
			animal.click();
			Thread.sleep(1000);
			
			Select s = new Select(animal);
			Thread.sleep(1000);
			s.selectByValue("babycat");
			Thread.sleep(1000);
		//Take Screenshot	
			File image = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Thread.sleep(1000);
			File photo = new File("D:\\Screenshots\\Iframecode.png");
			Thread.sleep(1000);
			FileHandler.copy(image, photo);
			

		}

	


	}


