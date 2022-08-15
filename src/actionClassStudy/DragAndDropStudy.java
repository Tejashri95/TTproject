package actionClassStudy;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class DragAndDropStudy {

		public static void main(String[] args) throws InterruptedException {
		    System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
			Thread.sleep(1000);
			
			Actions a = new Actions(driver);
			
			WebElement source = driver.findElement(By.xpath("//div[contains(@id,'box2')]"));
			Thread.sleep(1000);
			
			WebElement dest = driver.findElement(By.xpath("//div[contains(text(),'Norway')]"));
			Thread.sleep(1000);
			
	        a.dragAndDrop(source, dest).perform();
		}

	}



