package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class D02MultipleTests {
	@Test (priority = 1)
	public void testMeesho() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.meesho.com/");
		
		System.out.println("Title: " + driver.getTitle());
		
		Thread.sleep(2000);
		driver.close();
	}
	@Test (priority = 4)
	public void testAmazon() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		
		System.out.println("Title: " + driver.getTitle());
		
		Thread.sleep(2000);
		driver.close();
	}
	@Test(priority = 3)
	public void testFlipkart() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/");
		
		System.out.println("Title: " + driver.getTitle());
		
		Thread.sleep(2000);
		driver.close();
	}
	@Test (priority = 2)
	public void testMyntra() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.myntra.com/");
		
		System.out.println("Title: " + driver.getTitle());
		
		Thread.sleep(2000);
		driver.close();
	}
}
