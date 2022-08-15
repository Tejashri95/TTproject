package kiteUtilityClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.io.FileHandler;

public class UtilityClassReadDataFromExcel
{
	
	
	public static String readdatafromexcel(int rowno,int cellno) throws EncryptedDocumentException, IOException
	{
		File myfile = new File("D:\\MyExcel.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
		String value = mysheet.getRow(rowno).getCell(cellno).getStringCellValue();
		return value;
	}

	public static void captureScreenshot(WebDriver driver, String TCID) throws IOException 
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("D:\\Screenshots\\ TC" + TCID + ".png");
		FileHandler.copy(src, dest);
	}
	
	public static void waits(WebDriver driver, int millisecond )
	{
		 Timeouts waits = driver.manage().timeouts().implicitlyWait(Duration.ofMillis(millisecond));
	}

	
	
	
	
	
	
	
	
	
	
	
}
