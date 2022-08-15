package testNGkeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeoutKeywordStudy {
  @Test
  public void b() 
  {
	  Reporter.log("b method is Run", true);
  }
  @Test(timeOut=1200)   //it will run becoz time of testNg is more than method
  public void c() throws InterruptedException
  {
	  Thread.sleep(1000);
	  Reporter.log("c method is Run", true);
  }
  @Test
  public void e()
  {
	  Reporter.log("e method is Run", true);
  }
  @Test(timeOut=1000) //TestNg will fail that method becoz time of testNg is less than method
  public void d() throws InterruptedException
  {
	  Thread.sleep(1200);
	  Reporter.log("d method is Run", true);
  }
  @Test
  public void a()
  {
	  Reporter.log("a method is Run", true);
  }
}
