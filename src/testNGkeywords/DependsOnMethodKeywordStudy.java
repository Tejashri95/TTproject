package testNGkeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodKeywordStudy {
  @Test
  public void bank() 
  {
	  Reporter.log("Bank is one test case", true);
  }
 
  @Test //username testcase will execute first
  public void pin() 
  {
	  Reporter.log("PIN is one test case", true);
  }
  @Test
  public void username() 
  {
	  Reporter.log("Username is one test case", true);
  }
  @Test(dependsOnMethods= {"username"})
  public void customer() 
  {
	  Reporter.log("Customer is one test case", true);
  }
}
