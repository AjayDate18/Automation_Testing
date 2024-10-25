package pageObjectModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{
	/* 1.Constructor
	 * 2.Locators
	 * 3.Action Methods
	*/
	
	//Constructor
	WebDriver driver;
	
	public LoginPage( WebDriver driver) 
	{
		this.driver=driver;
	}
	
	//Locators
	By txt_user_loct=By.xpath("//input[@placeholder=\"Username\"] ");
	By txt_pwd_loct=By.xpath("//input[@placeholder=\"Password\"]");
	By login_loct=By.xpath("//button[@type=\"submit\"]");
	
	
	
	
	//Action Method
	public void setUserName(String user)
	{
		driver.findElement(txt_user_loct).sendKeys(user);
	}
	public void  setPassword(String pwd)
	{
		driver.findElement(txt_pwd_loct).sendKeys(pwd);
	}
	public void clickLogin()
	{
		driver.findElement(login_loct).click();
	}
	
	
	
	
	
	
}
