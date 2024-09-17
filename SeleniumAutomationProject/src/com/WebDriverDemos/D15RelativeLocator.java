package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class D15RelativeLocator {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.cssSelector("input[type=\"button\"]:nth-of-type(2)"))).sendKeys("1234567890");
	}

}
