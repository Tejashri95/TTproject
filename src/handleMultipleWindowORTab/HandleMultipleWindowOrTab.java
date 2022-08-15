package handleMultipleWindowORTab;
   import java.util.ArrayList;
	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class HandleMultipleWindowOrTab {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://vctcpune.com/");
			Thread.sleep(1000);
			driver.findElement(By.linkText("Start Selenium Practice")).click();
			Thread.sleep(1000);
			Set<String> idofallpage = driver.getWindowHandles();
			
			ArrayList<String> al = new ArrayList<String>(idofallpage);
			String idofmainpage = al.get(0);
			String idofchildpage = al.get(1);
			System.out.println(al.get(0));
			System.out.println(al.get(1));
			
			//here i will also perform how to handle the dropdown list operation
//			WebElement dropdown = driver.findElement(By.xpath("//select[contains(@id,'dropdown-class-example')]"));
//			Thread.sleep(1000);
//			dropdown.click();
//			
//			//create the object of select class
//			Select s = new Select(dropdown);
//			s.selectByIndex(0);
			driver.switchTo().window(idofchildpage);
			Thread.sleep(1000);
			WebElement text = driver.findElement(By.id("autocomplete"));
			Thread.sleep(1000);
			
			text.click();
			Thread.sleep(1000);
			text.sendKeys("Selenium");
				

		}

	


}
