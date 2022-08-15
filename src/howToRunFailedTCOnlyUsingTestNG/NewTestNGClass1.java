package howToRunFailedTCOnlyUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTestNGClass1 {
  @Test
  public void a()
  {
	  Reporter.log("a is run", true);
  }
  @Test
  public void g()
  {
	  Reporter.log("g is run", true);
  }

  @Test
  public void b()
  {
	  Assert.fail();     //After running xml we correct that failed TC then run only testng-failed.xml
	  Reporter.log("b is run", true);
  }

  @Test
  public void c()
  {
	  Reporter.log("c is run", true);
  }

  @Test
  public void d()
  {
	   Assert.fail();
	  Reporter.log("d is run", true);
  }

  @Test
  public void e()
  {
	  Reporter.log("e is run", true);
  }

}
