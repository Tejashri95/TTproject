package howToRunFailedTCOnlyUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTestNGClass2 {
  @Test
  public void h()
  {
	  Reporter.log("h is run", true);
  }
  @Test
  public void i()
  {
	  Reporter.log("i is run", true);
  }
  @Test
  public void j()
  {
	  Assert.fail();                       //  When we execute the code then we know that some tc are fail then we correct that TC and
  Reporter.log("j is run", true);              //then we run the created testng-fail.xml file in test output to execute only Failed TC
	                                              //so in code we do comment to the Assert.Fail()                                 
	 
  }
  
@Test
  public void k()
  {
	  Reporter.log("k is run", true);
  }
  @Test
  public void l()
  {
	  Assert.fail();
	  Reporter.log("l is run", true);
  }
}
