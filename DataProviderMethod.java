package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class DataProviderMethod 
{
	WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	
	
	@Test(dataProvider="dp")
	public void testLogin(String email,String pwd)
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[contains(text(), Login )]")).click();
		
		boolean status=driver.findElement(By.xpath("//img[@alt=\"client brand banner\"]")).isDisplayed();
		
		if(status==true)
		{
			Assert.assertTrue(true);
		}	
		else
		{
			Assert.fail();
		}	
	}
	
	
	//To Avoid Looping statement we use --->DataProvider
	//return type of DataProvider is two dimensional array of Object Type
	//indices take only particular input ie 0--->row and 2--->row only
	@DataProvider(name="dp",indices ={0,2})
	public Object[][] loginData()
	{
		Object data[][]= { {"abc","test123"},
				           {"xyz","test20"},
				           {"Admin","admin123"},
				           {"pqrs","john123"}
				         };
		return data;
	}
	
	
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
	
	
	
}
