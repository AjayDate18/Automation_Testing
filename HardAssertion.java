package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion 
{
	@Test
	public void testDemo()
	{
		//Assert.assertEquals("Welcome", "Welcome");
		//Assert.assertNotEquals(123, 100); //pass
		//Assert.assertNotEquals(100, 100);  //false
		
		//Assert.assertTrue(true);    //passs
		//Assert.assertTrue(false);  //Fail
		
		//Assert.assertTrue(1==1);//pass
		
		//Assert.assertFalse(false);  //pass
		//Assert.assertFalse(true);  //fail
		
		
		
		Assert.fail();   //fail
		 
		
		
	}
}
