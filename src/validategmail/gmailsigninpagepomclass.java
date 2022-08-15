package validategmail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class gmailsigninpagepomclass
{
	@FindBy(linkText ="Gmail") private WebElement gamil;
	
	
	
	public gmailsigninpagepomclass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    
	
	public void clickongamil()
	{
		 gamil.click();
	}
	
}
