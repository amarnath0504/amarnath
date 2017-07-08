package applicationUtilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ApplicationUtilities 
{
	WebElement myElement;
	List<WebElement> myCollection;
	WebDriver driver ;
	public ApplicationUtilities(WebDriver driver)
	{
		this.driver = driver;
	}
	public WebElement selectAnElementFromCollection(String propValue,String attributeValue)
	{
		List<WebElement> myCollection = driver.findElements(By.cssSelector(propValue));
		
		for(int i=0;i<myCollection.size();i++)
		{
			String secondAttribute = myCollection.get(i).getAttribute("innerText");
			if(secondAttribute.equalsIgnoreCase(attributeValue))
			{
				myElement = myCollection.get(i);
			}
		}
		if(myElement.isEnabled())
		{
			return myElement;
		}
		else
		{
			System.out.println("User Name Field is not enabled");
			return null;
		}
	}
	
	public WebElement selectAnElementFromCollection(String propType,String propValue,String attributeType,String attributeValue)
	{
		myCollection = returnWebElements(propType,propValue);
		
		for(int i=0;i<myCollection.size();i++)
		{
			String secondAttribute = myCollection.get(i).getAttribute(attributeType);
			//System.out.println(secondAttribute);
			//System.out.println(secondAttribute.trim());
			if(secondAttribute.trim().equalsIgnoreCase(attributeValue.trim()))
			{
				myElement = myCollection.get(i);
			}
		}
		if(myElement.isEnabled())
		{
			return myElement;
		}
		else
		{
			System.out.println("User Name Field is not enabled");
			return null;
		}
	}
	public List<WebElement> returnWebElements(String propType,String propValue)
	{
		if(propType.equalsIgnoreCase("cssSelector"))
			myCollection = driver.findElements(By.cssSelector(propValue));
		else if(propType.equalsIgnoreCase("className"))
			myCollection = driver.findElements(By.className(propValue));
		else if(propType.equalsIgnoreCase("name"))
			myCollection = driver.findElements(By.name(propValue));
		else if(propType.equalsIgnoreCase("id"))
			myCollection = driver.findElements(By.id(propValue));
		else if(propType.equalsIgnoreCase("linkText"))
			myCollection = driver.findElements(By.linkText(propValue));
		else if(propType.equalsIgnoreCase("partialLinkText"))
			myCollection = driver.findElements(By.partialLinkText(propValue));
		else if(propType.equalsIgnoreCase("xpath"))
			myCollection = driver.findElements(By.xpath(propValue));
		else if(propType.equalsIgnoreCase("tagName"))
			myCollection = driver.findElements(By.tagName(propValue));
		
		return myCollection;
	}
	public WebElement returnWebElement(String propType,String propValue)
	{
		if(propType.equalsIgnoreCase("id"))
			myElement = driver.findElement(By.id(propValue));
		else if(propType.equalsIgnoreCase("name"))
			myElement = driver.findElement(By.name(propValue));
		else if(propType.equalsIgnoreCase("className"))
			myElement = driver.findElement(By.className(propValue));
		else if(propType.equalsIgnoreCase("cssSelector"))
			myElement = driver.findElement(By.cssSelector(propValue));
		else if(propType.equalsIgnoreCase("linkText"))
			myElement = driver.findElement(By.linkText(propValue));
		else if(propType.equalsIgnoreCase("partiallinkText"))
			myElement = driver.findElement(By.partialLinkText(propValue));
		else if(propType.equalsIgnoreCase("xpath"))
			myElement = driver.findElement(By.xpath(propValue));
		if(myElement.isEnabled())
		{
			return myElement;
		}
		else
		{
			System.out.println("User Name Field is not enabled");
			return null;
		}
	}
	public void selectAnElementFromDropDown(String propType,String propValue,int index)
	{
		new Select(returnWebElement(propType,propValue)).selectByIndex(index);
	}
	
	
	public void selectAnElementFromDropDown(String propType,String propValue,String text)
	{
		new Select(returnWebElement(propType,propValue)).selectByVisibleText(text);
	}

}
