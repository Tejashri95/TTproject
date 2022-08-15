package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupEX2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		Thread.sleep(1000);
		driver.findElement(By.id("alertBox")).click();
		Thread.sleep(1000);
		Alert al = driver.switchTo().alert();
		Thread.sleep(1000);
		//al.dismiss();
        al.accept();
	}



	}


