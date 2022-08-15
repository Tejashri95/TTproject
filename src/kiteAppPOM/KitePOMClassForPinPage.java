package kiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePOMClassForPinPage
{
	@FindBy(id="pin") private WebElement pin;
    @FindBy(xpath = "//button[@type='submit']") private WebElement continuebutton;
    
    
    public  KitePOMClassForPinPage(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
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

