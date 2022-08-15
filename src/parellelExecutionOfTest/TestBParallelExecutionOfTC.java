package parellelExecutionOfTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestBParallelExecutionOfTC {
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
    @Test
    public void g()
    {
  	  Reporter.log("g is run", true);
    }
    @Test
    public void h()
    {
  	  Reporter.log("h is run", true);
    }
  }


