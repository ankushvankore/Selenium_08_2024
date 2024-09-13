package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D10LocateByLinkText {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		WebElement aboutLink = driver.findElement(By.linkText("About"));
		aboutLink.click();
		
		String title = driver.getTitle();
		
		if(title.contains("About"))
			System.out.println("Test case pass");
		else
			System.out.println("Test case fail");
	}

}
