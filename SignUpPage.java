package testNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class SignUpPage 
{
	@Test
	public void testSignUp()
	{
		System.out.println("SignUp Page");
	}
	@AfterTest
	public void closeBrowser()
	{
		System.out.println("This is After Test Method");
	}
	
	
}
