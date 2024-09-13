package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D11LocateByPartialLinkText {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.co.in/");

		WebElement adLink = driver.findElement(By.partialLinkText("Adv"));
		adLink.click();

		String title = driver.getTitle();

		if (title.contains("Google Ad"))
			System.out.println("Test case pass");
		else
			System.out.println("Test case fail");
	}

}
