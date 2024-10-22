package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class D10POM_Client {
	WebDriver driverC;
	RediffCreateAccount r1;
	@Test
	public void createAccount() throws InterruptedException {
		//r1.launchBrowser();
		r1.enterFullName("Ankush Vankore");
		r1.enterRediffId("ankushvankore");
		r1.checkAvailablity();
		r1.enterPassword("Ankush@123");
		r1.enterConfirmPassword("Ankush@123");
		r1.enterAltEmailId("ankushvankore@gmail.com");
		r1.enterMobileNo("9890742718");
		r1.setBirthDate("29", "JAN", "1979");
	}

	@BeforeTest
	public void beforeTest() {
		driverC = new ChromeDriver();
		driverC.manage().window().maximize();
		driverC.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driverC.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		r1 = new RediffCreateAccount(driverC);
	}

	@AfterTest
	public void afterTest() {
	}

}
