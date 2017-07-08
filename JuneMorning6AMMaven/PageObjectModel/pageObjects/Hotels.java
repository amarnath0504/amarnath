package pageObjects;

import org.openqa.selenium.WebDriver;

import applicationUtilities.ApplicationUtilities;

public class Hotels 
{
	WebDriver driver ;
	ApplicationUtilities myUtils;
	public Hotels(WebDriver driver)
	{
		this.driver = driver;
		myUtils = new ApplicationUtilities(driver);
	}
	
	public void bookHotel()
	{
		System.out.println("Hotel booked");
	}
}
