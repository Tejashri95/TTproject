package testNGkeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCountKeywordStudy {
  @Test(invocationCount=5)  //it will run the a method 5 times ,this keyword is when we want to do same work repeatedly
  public void a()
  {
	  Reporter.log("a method is running", true);
  }
  @Test
  public void b()
  {
	  Reporter.log("b method is running", true);
  }

  @Test
  public void c()
  {
	  Reporter.log("c method is running", true);
  }

  @Test
  public void d()
  {
	  Reporter.log("d method is running", true);
  }

  @Test
  public void e()
  {
	  Reporter.log("e method is running", true);
  }

}
