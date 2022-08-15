package popups;

	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class ChildBrowserPopup {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://skpatro.github.io/demo/links/");
			Thread.sleep(1000);
			driver.findElement(By.name("NewWindow")).click();
			Thread.sleep(1000);
			
			//to find single id --for main page
			String idofmainpage = driver.getWindowHandle();
			System.out.println("Id of main pages" + idofmainpage);
			
			//to find multiple id
			Set<String> idofallpage = driver.getWindowHandles();
			System.out.println("Id of all pages" + idofallpage);
			
			//convert set into arraylist
			ArrayList<String> al = new ArrayList<String>(idofallpage);
			
			String newidofmainpage = al.get(0);
			String idofchildpage = al.get(1);
			
			System.out.println("Id of main page " + newidofmainpage);
			System.out.println("Id of child popup " + idofchildpage);
			Thread.sleep(1000);
			
		//switch focus of selenium from main page to popup page
			driver.switchTo().window(idofchildpage);
			Thread.sleep(1000);
			driver.manage().window().maximize();
			Thread.sleep(1000);
			WebElement text = driver.findElement(By.id("the7-search"));
			
			Thread.sleep(1000);
			
			//text.click();
			Thread.sleep(1000);
			text.sendKeys("Selenium");
			Thread.sleep(1000);
			
			//to close child window
			driver.close();
			
			//we want to work on main page so change the selenium focus from child page to main page
			driver.switchTo().window(newidofmainpage);
			
			//to get text on main page
			WebElement textonmainpage = driver.findElement(By.xpath("//p[contains(text(),'Click below to open link in new tab')]"));
			
			System.out.println(textonmainpage.getText());
			
		
			
		}

	}


