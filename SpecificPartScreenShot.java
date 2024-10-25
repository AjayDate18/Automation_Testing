package screenshot;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpecificPartScreenShot 
{
	public static void main(String args[])
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement loginpage=driver.findElement(By.xpath("//form[@class=\"_9vtf\"]"));
		File source=loginpage.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"\\screenshots\\loginPage.jpeg");
		source.renameTo(target);
		
		
		
	}
}
