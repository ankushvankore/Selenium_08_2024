package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D04BeforeMethod_AfterMethod {
	WebDriver driver;
	@BeforeTest
	public void openBrowser()
	{
		System.out.println("Before Test");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterTest
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
		System.out.println("After Test");
	}
	
	@Test (priority = 1)
	public void testMeesho(){
		driver.get("https://www.meesho.com/");
	}
	
	@Test (priority = 4)
	public void testAmazon() {
		driver.get("https://www.amazon.in/");
	}
	
	@Test(priority = 3)
	public void testFlipkart(){
		driver.get("https://www.flipkart.com/");
	}
	
	@Test (priority = 2)
	public void testMyntra(){
		driver.get("https://www.myntra.com/");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	@AfterMethod
	public void displayTitle()
	{
		System.out.println("Title: " + driver.getTitle());
		System.out.println("After Method");
	}
}
