package testNGkeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class UseMultipleKeywords {
  @Test
  public void sample()
  {
	  Reporter.log("Sample is a Test case", true);
  }
  @Test
  public void demo()
  {
	  Reporter.log("demo is a Test case", true);
  }
  @Test(dependsOnMethods= {"learn"},invocationCount=4)
  public void test()
  {
	  Reporter.log("test is a Test case", true);
  }
  @Test
  public void learn()
  {
	  Reporter.log("learn is a Test case", true);
  }
  @Test
  public void accept()
  {
	  Reporter.log("accept is a Test case", true);
  }
}
