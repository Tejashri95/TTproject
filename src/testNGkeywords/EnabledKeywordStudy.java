package testNGkeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledKeywordStudy {
  @Test(enabled=false)  //use when we have to not execute any method then make that method enabled,default value is true
  public void a()
  {
	  Reporter.log("a method is Run", true);
  }
  @Test
  public void b()
  {
	  Reporter.log("b method is Run", true);
  }
  @Test
  public void c()
  {
	  Reporter.log("c method is Run", true);
  }
  @Test(enabled=false)
  public void d()
  {
	  Reporter.log("d method is Run", true);
  }
  @Test
  public void e()
  {
	  Reporter.log("e method is Run", true);
  }
}
