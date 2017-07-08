package pageObjects;

import org.openqa.selenium.WebDriver;

import applicationUtilities.ApplicationUtilities;

public class Cars
{
	WebDriver driver ;
	ApplicationUtilities myUtils;
	public Cars(WebDriver driver)
	{
		this.driver = driver;
		myUtils = new ApplicationUtilities(driver);
	}
	
	public void bookCar()
	{
		System.out.println("Car booked");
	}

}
