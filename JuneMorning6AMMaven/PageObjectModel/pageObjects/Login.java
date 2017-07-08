package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import applicationUtilities.ApplicationUtilities;
import generalUtilities.ReadProperties;

public class Login 
{
	WebDriver driver ;
	ApplicationUtilities  myUtils;
	public Login(WebDriver driver)
	{
		this.driver = driver;
		myUtils = new ApplicationUtilities(driver);
	}
	public void launchApplication()
	{
		System.out.println("launchApplication RC");
		driver.get(ReadProperties.readKey("URL"));
	}
	public void loginApplication()
	{
		System.out.println("loginApplication RC");
		myUtils.returnWebElement("name", "userName").sendKeys(ReadProperties.readKey("UserName"));
		myUtils.returnWebElement("name", "password").sendKeys(ReadProperties.readKey("PassWord"));
		myUtils.returnWebElement("name", "login").click();
	}
	public void logoutApplication()
	{
		System.out.println("logoutApplication RC");
		myUtils.returnWebElement("linkText", "SIGN-OFF").click();
	}
	
	public void closeApplication()
	{
		System.out.println("closeApplication RC");
		driver.close();
	}
}
