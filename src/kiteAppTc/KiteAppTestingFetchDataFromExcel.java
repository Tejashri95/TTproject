package kiteAppTc;
     import java.io.File;
	import java.io.IOException;

	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class KiteAppTestingFetchDataFromExcel {

		public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://kite.zerodha.com/");
			Thread.sleep(1000);
			
			//read the data from excel sheet
			File kp =new File("D:\\MyExcel.xlsx");
			String userid = WorkbookFactory.create(kp).getSheet("Sheet2").getRow(0).getCell(0).getStringCellValue();
	        String passwordpin = WorkbookFactory.create(kp).getSheet("Sheet2").getRow(0).getCell(1).getStringCellValue();
	        String PIN = WorkbookFactory.create(kp).getSheet("Sheet2").getRow(0).getCell(2).getStringCellValue();
	        
	        //loginpage 
					WebElement username = driver.findElement(By.id("userid"));
					WebElement password = driver.findElement(By.id("password"));
					
					username.sendKeys(userid);
					password.sendKeys(passwordpin);
					
					driver.findElement(By.xpath("//button[@type='submit']")).click();
					Thread.sleep(1000);
					
			//pinpage
					WebElement pin = driver.findElement(By.id("pin"));
					pin.sendKeys(PIN);

					driver.findElement(By.xpath("//button[@type='submit']")).click();
					Thread.sleep(1000);
					
			//HomePage
					WebElement userID = driver.findElement(By.xpath("//span[@class='user-id']"));
					userID.click();
				String expectedresult = userid;
				String actualresult = userID.getText();
				
				if(expectedresult.equals(actualresult))
				{
					System.out.println("Test Case is pass");
				}
				else
				{
					System.out.println("Test Case is not pass");
				}
				Thread.sleep(1000);
				
				//logout the account and close the window
				driver.findElement(By.xpath("//a[@target='_self']")).click();
				driver.close();
					
		}

	

	}


