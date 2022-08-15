package kiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePOMClassForLoginPage
{
	@FindBy(id="userid") private WebElement userid;
	@FindBy(id="password") private WebElement password;
	@FindBy(xpath = "//button[@type='submit']") private WebElement loginbutton;
	
	public  KitePOMClassForLoginPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
	public void sendusername(String UID)
	{
		userid.sendKeys(UID);
	}
	
	public void sendpassword(String PWD)
	{
		password.sendKeys(PWD);
	}
	public void clickonloginbutton()
	{
		loginbutton.click();
	}

}
