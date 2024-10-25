package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardvsSoftAssertion 
{
//	@Test
//	public void test_HardAssertion()
//	{
//		System.out.println("Testinggg");
//		System.out.println("Testinggg");
//		
//		Assert.assertEquals(1,2); 
//		//Last Statement should be Assertion--->In Hard Assertion
//		
//		System.out.println("Last Statement");
//	}
	
	@Test
	public void test_SoftAssertion()
	{
		System.out.println("Devlepment");
		System.out.println("Development");
		//Creste object of SoftAssert 
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(1, 2); //SoftAssert
		
		System.out.println("Last Statement");
		System.out.println("Last Statement");
		
		sa.assertAll();
		
	}
}
