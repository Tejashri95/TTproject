package testngstudy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

public class TestNGAnnotationStudy {
  @Test
  public void validateuserid()                   //6 it will run
  {
	  Reporter.log("UserID is validate", true);
  }
  @Test
  public void validatepin()           //3 It will run third
  {
	  Reporter.log("PIN is validate", true);
  }
  @BeforeMethod
  public void beforeMethod()               //2 It will Run Second      //5 then again it will run for the second method
  {
	  Reporter.log("Login is Successfull", true);
  }

  @AfterMethod
  public void afterMethod()                //4 It will Run fourth       //7 it will run
  {
	Reporter.log("Logout is Done", true);  
  }

  @BeforeClass
  public void beforeClass()              //1 It will Run first 
  {
	  Reporter.log("Browser is Launch", true);
  }

  @AfterClass
  public void afterClass()                         // 8 it will run
  {
	Reporter.log("Browser is close", true);  
  }

 

}
