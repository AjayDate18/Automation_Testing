package testNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPage 
{
	@Test
	public void testLogin()
	{
		System.out.println("Login Page");
	}
	@BeforeTest
	public void openBrowser()
	{
		System.out.println("This is Before Test Method");
	}
}
