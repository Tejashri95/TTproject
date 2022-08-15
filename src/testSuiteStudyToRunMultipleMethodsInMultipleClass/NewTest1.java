package testSuiteStudyToRunMultipleMethodsInMultipleClass;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void sample()
  {
	  Reporter.log("sample is run", true);
  }
  @Test
  public void demo()
  {
	  Reporter.log("demo is run", true);
  }
  @Test
  public void first()
  {
	  Reporter.log("first is run", true);
  }
}
