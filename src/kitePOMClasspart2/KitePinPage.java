package kitePOMClasspart2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage
{
	@FindBy(id="pin") private WebElement pin;
	@FindBy(xpath = "//button[@type='submit']") private WebElement continuebutton;

	
	public KitePinPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void sendpin(String PIN)
	{
		pin.sendKeys(PIN);
	}
	public void clickoncontinuebutton()
	{
		continuebutton.click();
	}

}
