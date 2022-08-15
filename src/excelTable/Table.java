
package excelTable;
		import java.util.List;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class Table {

			public static void main(String[] args) throws InterruptedException {
				
				System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://vctcpune.com/selenium/practice.html");
				Thread.sleep(1000);
				
				
				// find no. of rows in table
		        List<WebElement> noofrows = driver.findElements(By.xpath("//table[@class='table-display']//tr"));
		        System.out.println("No of rows in table are " + noofrows.size());
				
			}

		


	}


