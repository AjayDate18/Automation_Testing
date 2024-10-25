package brokenlinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks 
{
	public static void main(String args[]) throws IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/");
		driver.manage().window().maximize();
		
		//Capture all Links present on WebPage
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		//Total Number of Links
		System.out.println("Total Links :"+links.size());
		
		
		for(WebElement linkelement:links)
		{
			String hrefvalue=linkelement.getAttribute("href");
			if(hrefvalue==""||hrefvalue.isEmpty())
			{
				System.out.print("href value not to check");
				continue;
			}
			//Hit URL/Enter URL to server
			//To Enter URL -->URL Should be in URL Format
			//Convert String to---->URL Format
			
			URL linkurl=new URL(hrefvalue);
			
			//Open Connection to server
			HttpURLConnection conn=(HttpURLConnection)linkurl.openConnection();
			//Connect to server and send request
			conn.connect();
			if(conn.getResponseCode()>=400)
			{
				System.out.println("Broken Link: "+hrefvalue);
			}
			else
			{
				System.out.println("Not Broken Link");
			}	
			
	 }		
		
	}
}
