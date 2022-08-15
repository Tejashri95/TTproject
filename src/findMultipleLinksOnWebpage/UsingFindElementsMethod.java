package findMultipleLinksOnWebpage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingFindElementsMethod {

			public static void main(String[] args) throws InterruptedException {
				
				System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.flipkart.com/?s_kwcid=AL!739!3!582822043916!e!!g!!www%20flipkart&gclsrc=aw.ds&&semcmpid=sem_8024046704_brand_exe_buyers_goo");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2doB4z')]")).click(); //handle the popup
				Thread.sleep(1000);
				
				//use of findelements method
				List<WebElement> links = driver.findElements(By.tagName("a"));
				Thread.sleep(1000);  
				System.out.println("Total no of links on webpage " + links.size());//how many no of links on webpage
				
				//which links means text of the links
				System.out.println("Name of links on webpage");
				for (WebElement l:links)
				{
					
					System.out.println(l.getText());
				}
				//search mobiles on textbox
				driver.findElement(By.name("q")).sendKeys("Mobils");
				Thread.sleep(1000); 
				
				//xpath for all search elements
				List<WebElement> result = driver.findElements(By.xpath("//ul[@class='col-12-12 _1MRYA1 _38UFBk']/li"));
				
				System.out.println("===================================");
				//no of search elements 
				System.out.println("No of option under the search box " + result.size());
				
				//for each loop
				for(WebElement r:result)
				{
					System.out.println(r.getText());
					Thread.sleep(1000); 
				}
				
				//to find elements on search box and  click on that elements
				 for(WebElement r:result)
				 {
				   Thread.sleep(1000); 
				   String expectedresult = "oneplus mobile";
				   String actualresult = r.getText();	 
				 
		           if(actualresult.equals(expectedresult))  
		            {
		        		Thread.sleep(1000);
		        		driver.findElement(By.className("Y5N33s")).click();
		        	 //  r.click();
		        		Thread.sleep(1000); 
		        	   break;
		             }
				
				
				
				
				
				
				
			}

			
		


	}

}
