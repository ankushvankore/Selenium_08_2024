package com.TestNGDemos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D09KeywordDrivenFramework {
	WebDriver driver;
	
	File file;
	FileInputStream fis;
	Properties prop;
	
	@Test
	public void loginToEchotrak() {
		driver.findElement(By.id(prop.getProperty("unTxtBoxId"))).sendKeys("govind");
		driver.findElement(By.xpath(prop.getProperty("psTxtBoxXPath"))).sendKeys("govind123");
		driver.findElement(By.cssSelector(prop.getProperty("loginBtnCss"))).click();
		
		System.out.println(driver.findElement(By.className(prop.getProperty("errorClass"))).getText());
	}

	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File("D:\\AViIT\\Demos\\Selenium_08_2024\\SeleniumAutomationProject\\src\\com\\TestNGDemos\\MyLocators.properties");
		fis = new FileInputStream(file);
		prop = new Properties();
		prop.load(fis);				//Will load all the properties from .properties file
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getProperty("url"));
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
