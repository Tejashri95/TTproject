package kitePOMClasspart2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage
{
	@FindBy(id="userid") private WebElement username;
	@FindBy(id="password") private WebElement password;
	@FindBy(xpath = "//button[@type='submit']") private WebElement loginbutton;
	
	public KiteLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void senduserid(String UN)
	{
		
		 username.sendKeys(UN);
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
