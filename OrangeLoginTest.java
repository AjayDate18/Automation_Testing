package pageObjectModel;

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
public class OrangeLoginTest 
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
	
	@Test()
	void loginTest()
	{
		//LoginPage login=new LoginPage(driver);
		
		PomWithPageFactory login=new PomWithPageFactory(driver);
		
		
		login.setUserName("Admin");
		login.setPassword("admin123");
		login.clickLogin();
		
	}
	@AfterClass
	void tearDown()
	{
		driver.close();
	}
	
	
	
}
