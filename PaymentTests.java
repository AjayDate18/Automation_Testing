package grouping;

import org.testng.annotations.Test;

public class PaymentTests 
{
	@Test(priority=1,groups= {"sanity","regression","functional"})
	public void paymentInRupee()
	{
		System.out.println("Payment in Rupee");
	}
	
	@Test(priority=2,groups= {"sanity","regression","functional"})
	public void paymentInDollar()
	{
		System.out.println("Payment in Dollar");
	}
	
}
