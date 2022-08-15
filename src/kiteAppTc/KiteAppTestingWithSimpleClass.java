package kiteAppTc;
    import java.io.File;
	import java.io.IOException;

	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.io.FileHandler;

	public class KiteAppTestingWithSimpleClass {
 

		public static void main(String[] args) throws InterruptedException, IOException {
			
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://kite.zerodha.com/");
			Thread.sleep(1000);
			//KiteAppTCExecution .Screens(driver,"kiteapp","Mainpage",".jpj");//use for taking the screenshots
			
			WebElement username = driver.findElement(By.id("userid"));
			username.sendKeys("ELR321");
			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys("Dhana1111");
		//	KiteAppTCExecution .Screens(driver,"kiteapp","loginpage",".jpj");
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(1000);
			
			WebElement pin = driver.findElement(By.id("pin"));
			pin.sendKeys("982278");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(1000);
			
			
			WebElement userID = driver.findElement(By.xpath("//span[@class='user-id']"));
			userID.click();
			String expectedresult = "ELR321";
			String actualresult = userID.getText();
			if(expectedresult.equals(actualresult))
			{
				System.out.println("Test Case is pass");
			}
			else
			{
				System.out.println("Test Case is Fail");
			}
			
			//logout the account and close the window
			driver.findElement(By.xpath("//a[@target='_self']")).click();
			driver.close();
			
			
			
			
			
			
			
		}

	//  code for taking the screenshots by using screens static method which is webdriver method
//		private static void Screens(WebDriver driver, String string, String string2, String string3) throws IOException {
//			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//			File dest = new File("C:\\Users\\AKASH\\Pictures\\Screenshots\\img.jpj");
//			FileHandler.copy(src, dest);
//			
			
			
			
			
			
		

	


	}


