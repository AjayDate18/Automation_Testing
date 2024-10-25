package listners;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listners.MyListner.class)
public class OrangeHrmTest 
{
	
	WebDriver driver;
	@BeforeClass
	void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	}
	@Test(priority=1)
	void testLogo() throws InterruptedException
	{
		Thread.sleep(5000);
		boolean status=driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
		Assert.assertEquals(status, true);
	}
	
	@Test(priority = 2)
	void testAppUrl()
	{
		//URL is not same s it Failed
		Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test(priority=3,dependsOnMethods = {"testAppUrl"})
	void testHomePageTitle()
	{
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	}
	
	@AfterClass
	void tearDown()
	{
		driver.close();
	}
	
	
	
}
