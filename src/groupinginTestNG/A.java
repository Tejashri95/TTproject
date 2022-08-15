package groupinginTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class A {
  @Test(groups="SIT")
  public void username()
  {
	  Reporter.log("username is run", true);
  }
  @Test(groups="regression")
  public void password()
  {
	  Reporter.log("password is run", true);
  }
  @Test(groups="sanity")
  public void pin()
  {
	  Reporter.log("pin is run", true);
  }
  @Test(groups="retest")
  public void otp()
  {
	  Reporter.log("OTP is run", true);
  }
  @Test(groups={"sanity","SIT"})
  public void login()
  {
	  Reporter.log("login is run", true);
  }
}
