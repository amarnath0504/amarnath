package testSuites;

import org.junit.Test;

import generalUtilities.ReadProperties;
import testCases.TestCases;

public class TestSuites extends TestCases
{
	//page factory , webtable , synchronization , remote execution , testing types , data driven ,extent reports , TestNG
	//TestCases myTestCases = new TestCases();
	
	@Test
	public void runUserChoice()
	{
		if(ReadProperties.readKey("testingType").equalsIgnoreCase("smoke"))
			smokeSuite();
		else if(ReadProperties.readKey("testingType").equalsIgnoreCase("regression"))
			regressionSuite();
		else
			smokeSuite();
	}
	
	@Test
	public void smokeSuite()
	{
		System.out.println("This is my smokeSuite ");
		//myTestCases.bookFlightAndCar();
		bookFlightAndCar();
		bookFlightAndCruise();
	}
	
	@Test
	public void regressionSuite()
	{
		System.out.println("This is my regressionSuite ");
		bookFlightAndCar();
		bookFlightAndCruise();
	}

}
