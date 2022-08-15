package kitePOMClasspart2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage
{
	@FindBy(xpath="//span[@class='user-id']") private WebElement userid;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logoutbutton;
	
	public  KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public String validateuserid()
	{
		String actualuserid = userid.getText();
		return actualuserid;
		
		
	}
	public void clicklogoutbutton()
	{
		userid.click();
		logoutbutton.click();
		
	}
	
}
