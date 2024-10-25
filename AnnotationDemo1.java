package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationDemo1 
{
	
	
	
	/*
	 * login--@BeforeMethod
	 * search-->@Test
	 * logout---@AfterMethod
	 * '
	 * login--->@BeforeMethod
	 * advsearch--->@Test
	 * logout--->AfterMethod
	 * 
	 * 
	 * 
	 * 
	 */
	@BeforeMethod
	void login()
	{
		System.out.println("This is Login");
	}
	@Test(priority = 1)
	void search()
	{
		System.out.println("This is search");
	}
	
	@Test(priority = 2)
	void advanceSearch()
	{
		System.out.println("This is Advance Search");
	}
	@AfterMethod
	void logout()
	{
		System.out.println("This is logout");
	}
}
