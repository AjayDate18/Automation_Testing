package testNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstTestCase
{
	/* 1)Open App
	 * 2)Log
	 * 3)Logout
	 
	 */
	
	//priority can be random numbers lowest number execute first
	//priority can be in negative number
	//Default priority is Zero
	//if priority is same then test execute in alphabetical order.
	@Test(priority=-1)
	public void openApp()
	{
		System.out.println("Opening Application");
	}
	
	@Test(priority=1)
	public void Login()
	{
		System.out.println("Login To Application");
	}
	
	@Test(priority=2)
	public void Logout()
	{
		System.out.println("Logout From Application");
	}
	
	
	
}
