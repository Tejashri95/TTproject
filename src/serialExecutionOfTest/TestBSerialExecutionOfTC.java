package serialExecutionOfTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestBSerialExecutionOfTC {
  @Test
  public void d() 
  {
	  Reporter.log("d is run", true);
  }
  @Test
  public void e() 
  {
	  Reporter.log("e is run", true);
  }
  @Test
  public void f() 
  {
	  Reporter.log("f is run", true);
  }
}
