package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class D29HeadlessBrowser {

	public static void main(String[] args) {
		EdgeOptions op = new EdgeOptions();
		op.addArguments("headless");
		WebDriver driver = new EdgeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.online.citibank.co.in/");
		
		System.out.println("Title: " + driver.getTitle());
		
		driver.close();
	}

}
