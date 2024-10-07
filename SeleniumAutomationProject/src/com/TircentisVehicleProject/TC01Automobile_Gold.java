package com.TircentisVehicleProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC01Automobile_Gold {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://sampleapp.tricentis.com/101/index.php");
		
		driver.findElement(By.partialLinkText("Auto")).click();
		
		//Enter Vehicle Data
		Select make = new Select(driver.findElement(By.id("make")));
		make.selectByVisibleText("Audi");
		driver.findElement(By.id("engineperformance")).sendKeys("1000");
		driver.findElement(By.id("dateofmanufacture")).sendKeys("10/05/2024");
		new Select(driver.findElement(By.id("numberofseats"))).selectByVisibleText("2");
		new Select(driver.findElement(By.id("fuel"))).selectByVisibleText("Petrol");
		driver.findElement(By.id("listprice")).sendKeys("1000");
		driver.findElement(By.id("licenseplatenumber")).sendKeys("MH09GF1246");
		driver.findElement(By.id("annualmileage")).sendKeys("1000");
		driver.findElement(By.id("nextenterinsurantdata")).click();
		
		//Enter Insurant Data
		
		//Enter Product Data
		
		//Select Price Option
		String expPrice = "662.00", expClaim = "Submit", expDis = "2", expCover = "Limited", actPrice, actClaim, actDis, actCover;
		
		actPrice = driver.findElement(By.id("selectgold_price")).getText();
		actClaim = driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[2]/td[3]")).getText();
		actDis = driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[3]/td[3]")).getText();
		actCover = driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[4]/td[3]")).getText();
		
		System.out.println("Checking Automobile - Gold Values");
		if(actPrice.equals(expPrice))
			System.out.println("Price Matching...");
		else
			System.out.println("Price NOT Matching");
		
		if(actClaim.equals(expClaim))
			System.out.println("Online Claim Matching");
		else
			System.out.println("Online Claim NOT Matching");
		
		if(actDis.equals(expDis))
			System.out.println("Claims Discount Matching");
		else
			System.out.println("Claims Discount NOT Matching");
		
		if(actCover.equals(expCover))
			System.out.println("Online Cover Matcing");
		else
			System.out.println("Online Cover NOT Matching");
		
		driver.findElement(By.id("selectgold")).click();
		
		//Send Quote
	}

}
