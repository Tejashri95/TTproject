package serialExecutionOfTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestASrialexecutionOfTC {
  @Test
  public void a()
  {
	  Reporter.log("a is run", true);
  }
  @Test
  public void b()
  {
	  Reporter.log("b is run", true);
  }
  @Test
  public void c()
  {
	  Reporter.log("c is run", true);
  }
}
