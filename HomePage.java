package testNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HomePage 
{
	@Test
	public void testHome()
	{
		System.out.println("On Home Page");
	}
	
	@BeforeSuite
	public void openApp()
	{
		System.out.println("In Before Suite");
	}
	@AfterSuite
	public void closeApp()
	{
		System.out.println("In After Suite");
	}
}
