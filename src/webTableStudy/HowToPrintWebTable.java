package webTableStudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToPrintWebTable {
			public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://vctcpune.com/selenium/practice.html");
				Thread.sleep(1000);
				
				// find no. of rows in table                                      
				   List<WebElement> noofrows = driver.findElements(By.xpath("//table[@class='table-display']//tr"));
		        System.out.println("No of rows in table are " + noofrows.size());
		        
		        //find no of column in table
		        List<WebElement> noofcolumn = driver.findElements(By.xpath("//table[@id='product' ]//th"));
		        System.out.println("No of columns in table are " + noofcolumn .size());
		        
		        System.out.println("name of the column");
		        //name of the column
		        for(WebElement cn:noofcolumn )
		        {
		        	System.out.print(cn.getText()        +    "      ||     ");
		        	System.out.print("                     ");
		        	
		        }
		        for(WebElement rn:noofrows)
		        {
		        	System.out.print(rn. getText()  + "     " );
		        	System.out.println("                           ");
		        	System.out.println();
		        }
		        
			}

		}

	