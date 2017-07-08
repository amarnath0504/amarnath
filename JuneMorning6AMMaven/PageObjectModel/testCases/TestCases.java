package testCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import pageObjects.Cars;
import pageObjects.Cruises;
import pageObjects.Flights;
import pageObjects.Hotels;
import pageObjects.Login;

public class TestCases
{
	WebDriver driver = new FirefoxDriver();
	Login myLogin = new Login(driver);
	Flights myFlights = new Flights(driver);
	Cars myCars = new Cars(driver);
	Hotels myHotels = new Hotels(driver);
	Cruises myCruises = new Cruises(driver);
	
	FileInputStream myFile;
	Workbook myBook;
	Sheet mySheet;
	@Test
	public void readXlData() 
	{
		
		try {
			myFile = new FileInputStream("TestData/TestData.xls");
			 myBook = Workbook.getWorkbook(myFile);
			 mySheet = myBook.getSheet("DEV");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		int colCount = mySheet.getColumns();
		System.out.println("Total num of columns :"+ colCount);
		int rowCount = mySheet.getRows();
		System.out.println("Total num of rows :"+ rowCount);
		String appUrl = mySheet.getCell(0, 1).getContents();
		System.out.println(appUrl);
		String uName = mySheet.getCell(1, 1).getContents();
		System.out.println(uName);
		String pWord = mySheet.getCell(2, 1).getContents();
		System.out.println(pWord);
		
	}
	
	
	
	
	@Test
	public void bookFlightAndCar()
	{
		System.out.println("This is my bookFlightAndCar TC");
		try{
			myLogin.launchApplication();
			myLogin.loginApplication();
			myFlights.bookFlight();
			myCars.bookCar();
			myLogin.logoutApplication();
			//myLogin.closeApplication();
		}catch(Exception e)
		{
			System.out.println(e);
			myLogin.closeApplication();
		}
		
	}
	@Test
	public void bookFlightAndCruise()
	{
		System.out.println("This is my bookFlightAndCruise TC");
		try{
			myLogin.launchApplication();
			myLogin.loginApplication();
			myFlights.bookFlight();
			myCruises.bookCruise();
			myLogin.logoutApplication();
			//myLogin.closeApplication();
		}catch(Exception e)
		{
			System.out.println(e);
			myLogin.closeApplication();
		}
		
	}

	@Test
	public void bookFlightAndHotel()
	{
		System.out.println("This is my bookFlightAndHotel TC");
		try{
			myLogin.launchApplication();
			myLogin.loginApplication();
			myFlights.bookFlight();
			myHotels.bookHotel();
			myLogin.logoutApplication();
			//myLogin.closeApplication();
		}catch(Exception e)
		{
			System.out.println(e);
			myLogin.closeApplication();
		}
		
	}


}
