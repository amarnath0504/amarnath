package pageObjects;

import org.openqa.selenium.WebDriver;

import applicationUtilities.ApplicationUtilities;

public class Cruises
{
	WebDriver driver ;
	ApplicationUtilities myUtils;
	public Cruises(WebDriver driver)
	{
		this.driver = driver;
		myUtils = new ApplicationUtilities(driver);
	}
	
	public void bookCruise()
	{
		System.out.println("Cruise booked");
	}
}
