package findMultipleLinksOnWebpage;
	import java.util.List;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class MultipleLinksEg2 {

			public static void main(String[] args) throws InterruptedException
			{
				
				System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get(" https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_4aixbc67ji_b&adgrpid=57687748743&hvpone=&hvptwo=&hvadid=294135675985&hvpos=&hvnetw=g&hvrand=16044239419508165768&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007786&hvtargid=kwd-297849179688&hydadcr=5844_1914872&gclid=EAIaIQobChMIsOjss53h-AIV2w0rCh1dAA3YEAAYASAAEgLhmvD_BwE");
				Thread.sleep(1000);
				List<WebElement> links = driver.findElements(By.tagName("a"));
				Thread.sleep(1000);
				
				//how many no of links are present on webpage
				System.out.println("Total no of links on webpage " + links.size());
				Thread.sleep(1000);
				System.out.println("============================");
				System.out.println("Text of that links");
				for(WebElement l:links)
				{
				System.out.println(l.getText());
				}
				Thread.sleep(1000);
				//find the path of searchbox and search toys
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Toys");
				Thread.sleep(1000);
				List<WebElement> allsearchelement = driver.findElements(By.xpath("//div[contains(@class,'autocomplete-results-container')]/div"));
				Thread.sleep(1000);
				
				System.out.println("=================================");
				System.out.println("No of elements in the related list of toys " + allsearchelement.size());
				Thread.sleep(1000);
				
				//to print text of all search elements
				System.out.println("=====================================");
				System.out.println("Text of all elements");
				for(WebElement a:allsearchelement)
				{
					Thread.sleep(1000);
					System.out.println(a.getText());
					Thread.sleep(2000);
					
				//to click on toys for boys
		          String expectedoutput = "toys for boys";
				  String actualoutput = a.getText();
				 if(actualoutput.equals(expectedoutput))
				 {
					 a.click();
					 break;
				 }
				}
				Thread.sleep(1000);
				driver.findElement(By.xpath("(//div[contains(@class,'_bGlmZ_lightning')])[1]")).click();
		


	}

}
