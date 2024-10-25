package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomWithPageFactory 
{
	WebDriver driver;
	
	//constructor
	public PomWithPageFactory(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	
	//Locators
	
	@FindBy(xpath="//input[@placeholder=\"Username\"]")
	WebElement txt_username;
	
	@FindBy(xpath="//input[@placeholder=\"Password\"]")
	WebElement txt_pwd;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement login_btn;
	
	
	//Action Methods
	public void setUserName(String user)
	{
		txt_username.sendKeys(user);
	}
	public void  setPassword(String pwd)
	{	
		txt_pwd.sendKeys(pwd);
		
	}
	public void clickLogin()
	{
		login_btn.click();
	}
	
	
	
	
}
