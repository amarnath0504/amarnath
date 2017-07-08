package com.JuneMorning6AMMaven;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AppTest 
{
	WebDriver driver = new FirefoxDriver();
   
   @Before
	public void launchApplication()
   {
	  System.out.println("This is my launchApplication "); 
	  driver.get("http://newtours.demoaut.com/");
   }
   @Test
   public void loginApplication()
   {
	  System.out.println("This is my loginApplication "); 
	  driver.findElement(By.name("userName")).sendKeys("nag022");
	  driver.findElement(By.name("password")).sendKeys("mar1234");
	  driver.findElement(By.name("login")).click();
   }
   @After
   public void closeApplication()
   {
	  System.out.println("This is my closeApplication "); 
	  driver.close();
   }
		
}
