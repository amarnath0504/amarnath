package pageObjects;

import org.openqa.selenium.WebDriver;

import applicationUtilities.ApplicationUtilities;

public class Flights 
{
	WebDriver driver ;
	ApplicationUtilities myUtils;
	public Flights(WebDriver driver)
	{
		this.driver = driver;
		myUtils = new ApplicationUtilities(driver);
	}
	
	public void bookFlight()
	{
		System.out.println("Flight booked RC");
		myUtils.selectAnElementFromCollection("name","tripType","value","oneway").click();
		myUtils.selectAnElementFromDropDown("name","passCount",1);
	}
}
