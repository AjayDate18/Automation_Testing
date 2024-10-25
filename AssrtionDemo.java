package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssrtionDemo 
{
	String exp_title="OpenCart";
	String actual_title="OpenMart";
	@Test
	public void testTitle()
	{
		
		if(exp_title.equals(actual_title))
		{
			System.out.println("Test Passed");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("Failed");
			Assert.assertTrue(false);
		}	
		
	}
}
