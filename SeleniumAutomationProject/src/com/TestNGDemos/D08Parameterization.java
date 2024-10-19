package com.TestNGDemos;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;

public class D08Parameterization {
	WebDriver driver;
	
	@Parameters({"userName", "password"})	//It will read the values of these parameters
	@Test
	public void login(String un, String ps) //The values of the parameters will get stored in these arguments
	{
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(ps);
		//driver.findElement(By.xpath("//*[@id=\"login\"]/button")).submit();
		driver.findElement(By.xpath("//*[@id=\"login\"]/button")).sendKeys(Keys.ENTER);
	}

	@AfterMethod
	public void logout() {
		driver.findElement(By.partialLinkText("Log")).click();
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://practice.expandtesting.com/login");
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
