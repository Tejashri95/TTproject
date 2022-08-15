package actionClassStudy;
        import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.interactions.Actions;

		public class ContextClickAndDoubbleClickStudy {

			public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://demo.guru99.com/test/simple_context_menu.html");
				Thread.sleep(1000);
				WebElement rightclickbutton = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
			     
				Actions a = new Actions (driver);
				a.contextClick(rightclickbutton).perform();
				
				WebElement doubbleclickbutton = driver.findElement(By.xpath("//button[contains(text(),' Alert')]"));
				a.doubleClick(doubbleclickbutton).perform();
				
			}

		


	}


