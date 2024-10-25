package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationDemo2 
{
	/* login  -->only once --->@BeforeClass
	 * search  -->@Test
	 * advsearch--->@Test
	 * logout---->only once----->@AfterClass
	 * 
	 */
	
	
	@BeforeClass
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
	@AfterClass
	void logout()
	{
		System.out.println("This is logout");
	}
	
	
	
	
}
