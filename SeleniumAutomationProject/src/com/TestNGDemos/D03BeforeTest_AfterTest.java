package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D03BeforeTest_AfterTest {
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
		System.out.println("Title: " + driver.getTitle());
	}
	@Test (priority = 4)
	public void testAmazon() {
		driver.get("https://www.amazon.in/");
		System.out.println("Title: " + driver.getTitle());
	}
	@Test(priority = 3)
	public void testFlipkart(){
		driver.get("https://www.flipkart.com/");
		System.out.println("Title: " + driver.getTitle());
	}
	@Test (priority = 2)
	public void testMyntra(){
		driver.get("https://www.myntra.com/");
		System.out.println("Title: " + driver.getTitle());
	}
}
