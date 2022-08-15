package validategmail;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateEmailID {
	
	WebDriver driver;
	gmailsigninpagepomclass sign;
	 File f;
	 Sheet mysheet ;
	@BeforeClass
	public void launchgmail() throws EncryptedDocumentException, IOException
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.google.co.in/");
	     f = new File("D:\\\\MyExcel.xlsx");
		 mysheet = WorkbookFactory.create(f).getSheet("Sheet3");
	     sign = new  gmailsigninpagepomclass(driver);
	
	}
	
	
	
  @Test
  public void validateemail()
  {
	  String expectedemail = (mysheet.getRow(0).getCell(0).getStringCellValue());
	//  actualemail=
  }
}
