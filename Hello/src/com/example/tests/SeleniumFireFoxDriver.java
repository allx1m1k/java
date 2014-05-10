/**
 * @author dima
 * Selenium WebDriver test 
 * As web browser the FireFox is utilized
 */
package com.example.tests;


import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import junit.framework.Assert;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SeleniumFireFoxDriver {
	private WebDriver driver;
	
	//Create instance of web browser
	@Before
	public void setUp() throws Exception {
	driver = new FirefoxDriver();
	  }
	
	//Search using keyword through Google search
	@Test
	  public void serachSelenium() throws Exception {
	        //Open Home Page
	        driver.get("http://www.google.com");
	        //Enter text in search box
	        driver.findElement(By.name("q")).sendKeys("selenium");
	        Thread.sleep(1000);
	        //Click Search button
	        driver.findElement(By.name("btnG")).click();
	        // Check the title of the page
	        System.out.println("Page title is: " + driver.getTitle());
	        //Goes sleep
	        Thread.sleep(10000);
	  }

	//Delete instance of web browser  
	@After
	  public void tearDown() throws Exception {
	    driver.quit();
	    }
	  
}
	
	
	
