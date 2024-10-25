package grouping;

import org.testng.annotations.Test;

public class LoginTests 
{
	
	@Test(priority=1,groups= {"sanity"})
	public void loginByEmail()
	{
		System.out.println("Login By--->Email");
	}
	
	
	@Test(priority=2,groups= {"sanity"})
	public void loginByFB()
	{
		System.out.println("Login By--->Facebook");
	}
	
	@Test(priority=3,groups= {"sanity"})
	public void loginByInsta()
	{
		System.out.println("Login By--->Insta");
	}
}
