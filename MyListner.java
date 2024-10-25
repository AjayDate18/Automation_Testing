package listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class MyListner implements ITestListener
{

	public void onFinish(ITestContext context) 
	{
		//Execute Only Once
		System.out.println("Execution Finish.........");
	}

	public void onStart(ITestContext context) 
	{
		//Execute Only Once
		System.out.println("Execution Started........");
	}

	public void onTestFailure(ITestResult result) 
	{
		System.out.println("Test Failed");
	}

	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("Test Skipped");
	}

	public void onTestStart(ITestResult result)
	{
		
		//Execute Before Starting Every Test
		System.out.println("Test started");
	}

	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("Test Success");
	}

	
	
	
}
