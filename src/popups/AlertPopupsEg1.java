package popups;
     import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class AlertPopupsEg1 {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://demoqa.com/alerts");
			Thread.sleep(1000);
			driver.findElement(By.id("alertButton")).click();
			Thread.sleep(1000);
	   //switch selenium focus from main page to alert popup
			Alert al = driver.switchTo().alert();
			Thread.sleep(1000);
			
		//to click ok button of alert popup use this method	
			al.accept();
		}

	


	}


