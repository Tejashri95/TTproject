package testNGkeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityKeywordStudy {
  @Test(priority=-2)
  public void e() 
  {
	  Reporter.log("a method is work", true);
  }
  @Test(priority=-5)
  public void b() 
  {
	  Reporter.log("b method is work", true);
  }
  @Test(priority=4)
  public void c() 
  {
	  Reporter.log("c method is work", true);
  }
  @Test(priority=0)
  public void d() 
  {
	  Reporter.log("d method is work", true);
  }
  @Test(priority=1)
  public void a() 
  {
	  Reporter.log("e method is work", true);
  }
}
