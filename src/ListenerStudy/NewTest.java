package ListenerStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners( ListenerStudy.Listener.class)
public class NewTest {
  @Test
  public void mymethod1()
  {
	  Reporter.log(" mymethod1-->TC Execution is start",true);
  }
  @Test
  public void mymethod2()
  {
	  Assert.fail();
	  Reporter.log(" mymethod2-->TC Execution is Failed",true);
  }
  @Test 
  public void mymethod3()
  {
	  Reporter.log(" mymethod3-->TC Execution is Skipped",true);
  }
  @Test
  public void mymethod4()
  {
	  Reporter.log(" mymethod4-->TC Execution is Successfull",true);
  }
}
