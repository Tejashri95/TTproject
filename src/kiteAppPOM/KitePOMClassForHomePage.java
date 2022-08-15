package kiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePOMClassForHomePage
{
	@FindBy(xpath = "//span[@class='user-id']") private WebElement userID;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logout;
	
	public  KitePOMClassForHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//we comment that becoz testng not support conditional statement
//     public void validateuserid(String UID)
//     {
//    	 String actualuserid = userID.getText();
//    	 String expecteduserid = UID;
//    	 if(actualuserid.equals(expecteduserid))
//    	 {
//    		 System.out.println("TC is pass");
//    	 }
//    	 else
//    	 {
//    		 System.out.println("TC is Fail");
//    	 }
	
	public String validateuserID()
	{
	  String actualuserid = userID.getText();	
	  return actualuserid;
	  
     }
	public void clicklogoutbutton()
	{
		userID.click();
		logout.click();
	}
}
