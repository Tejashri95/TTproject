package groupinginTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class B {
  @Test(groups="retest")
  public void ballsize()
  {
	  Reporter.log("Ballsize is retesting TC", true);
  }
  @Test(groups="SIT")
  public void ballweight()
  {
	  Reporter.log("Ballweight is SIT TC", true);
  }
  @Test(groups="sanity")
  public void ballcolor()
  {
	  Reporter.log("Ballcolor is sanity TC", true);
  }
  @Test(groups="sanity")
  public void ballcompany()
  {
	  Reporter.log("Ballcompany is sanity TC", true);
  }
  @Test(groups="regression")
  public void ballspeed()
  {
	  Reporter.log("Ballspeed is regression TC", true);
  }
  @Test(groups={"sanity","SIT"})
  public void ballshape()
  {
	  Reporter.log("Ballshape is sanity and SIT TC", true);
  }
}
