package howToRunFailedTCOnlyUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTestNGClass3 {
  @Test
  public void n()
  {
	 // Assert.fail();
	  Reporter.log("n is run", true);
  }
  @Test
  public void o()
  {
	  Reporter.log("o is run", true);
  }
  @Test
  public void p()
  {
	 // Assert.fail();
	  Reporter.log("p is run", true);
  }
  @Test
  public void q()
  {
	  Reporter.log("q is run", true);
  }
}
