package grouping;

import org.testng.annotations.Test;

public class SignUpTests 
{
	@Test(priority=1,groups= {"regression"})
	public void sinupByEmail()
	{
		System.out.println("Sign Up By--->Email");
	}
	
	@Test(priority=2,groups= {"regression"})
	public void sinupByFB()
	{
		System.out.println("Sign Up By--->FB");
	}
	
	@Test(priority=3,groups= {"regression"})
	public void sinupByInsta()
	{
		System.out.println("Sign Up By--->Insta");
	}
	
}
