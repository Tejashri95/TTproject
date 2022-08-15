package testNGannotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotationEg2 {
  @Test
  public void smaple()
  {
	  Reporter.log("sample method run seventh ", true);
  }
  @Test
  public void mymethod()
  {
	  Reporter.log("mymetod run fourth ", true);
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  Reporter.log("Beforemethod  run third ", true);     //it will again run while executing second method means 6th no
  }

  @AfterMethod
  public void afterMethod()
  {
	  Reporter.log("Aftermethod  run fifth  ", true);       //it will again run while executing second method means 8th no
  }

  @BeforeClass
  public void beforeClass()
  {
	  Reporter.log("Beforeclass  run second ", true);
  }

  @AfterClass
  public void afterClass()
  {
	  Reporter.log("Afterclass  run sixth  ", true);
  }

  @BeforeTest
  public void beforeTest() 
  {
	  Reporter.log("BeforeTest  run first ", true);
  }

  @AfterTest
  public void afterTest()
  {
	  Reporter.log("AfterTest  run nineth   ", true);
  }
 

}
