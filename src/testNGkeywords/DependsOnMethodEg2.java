package testNGkeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodEg2 
{
	@Test
	public void cd()
	{
		Reporter.log("cd", true);
	}

	@Test
	public void ef()
	{
		Reporter.log("ef", true);
	}

	@Test(dependsOnMethods = {"bg"})
	public void ad()
	{
		Reporter.log("ad", true);
	}

	@Test
	public void dc()
	{
		Reporter.log("dc", true);
	}

	@Test
	public void bg()
	{
		Reporter.log("bg", true);
	}
	
  
 
}
