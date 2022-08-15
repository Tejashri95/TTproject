package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(1000);
		
		Actions a = new Actions(driver);
		WebElement src = driver.findElement(By.id("box4"));
		Thread.sleep(1000);
		
		WebElement dest = driver.findElement(By.id("box104"));
		Thread.sleep(1000);

		a.dragAndDrop(src, dest).perform();
		

	}

}
