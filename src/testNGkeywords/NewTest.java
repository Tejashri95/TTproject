package testNGkeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void e()
  {
	  Reporter.log("e is run", true);
  }
  @Test
  public void g()
  {
	  Reporter.log("g is run", true);
  }
  @Test
  public void a()
  {
	  Reporter.log("a is run", true);
  }
  @Test(dependsOnMethods = {"e"})
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
