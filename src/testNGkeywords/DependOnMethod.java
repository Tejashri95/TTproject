package testNGkeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependOnMethod
{
	@Test
	public void d()
	{
		Reporter.log("d", true);
	}
	@Test
	public void g()
	{
		Reporter.log("g", true);
	}
	@Test(dependsOnMethods = {"f"})
	public void a()
	{
		Reporter.log("a", true);
	}
	@Test
	public void f()
	{
		Reporter.log("f", true);
	}
	@Test
	public void e()
	{
		Reporter.log("e", true);
	}
	
	}
 

