package ListenerStudy;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener
{
	@Override
  public void onTestStart(ITestResult result)
{
	Reporter.log("TC Execution is start" + result.getName(), true);
}
	@Override
	public void onTestSkipped(ITestResult result)
	{
		Reporter.log("TC Execution is Skipped" + result.getName(), true);
	}
	@Override
	public void onTestFailure(ITestResult result)
	{
		Reporter.log("TC Execution is Failed" + result.getName(), true);
	}
	@Override
	public void onTestSuccess(ITestResult result)
	{
		Reporter.log("TC Execution is Successfull" + result.getName(), true);
	}
  
}
