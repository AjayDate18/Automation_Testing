package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


/*
   Open Application
   Test Logo
   login
   close
 */
public class OrangeHrmTest 
{
	WebDriver driver;
	@Test(priority=1)
	void openApp()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/auth/login");
		driver.manage().window().maximize();
		
	}
	
	@Test(priority=2)
	void testLogo() throws InterruptedException
	{
		Thread.sleep(5000);
		boolean ststus=driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
		System.out.println("Logo Displayed "+ststus);
	}
	
	@Test(priority=3)
	void testLogin()
	{
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[contains(text(), Login )]")).click();
		
	}
	
	@Test(priority=4)
	void testLogout()
	{
		driver.close();
	}
	
}
