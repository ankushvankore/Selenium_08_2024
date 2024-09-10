package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D02ReadTitle {

	public static void main(String[] args) {
		String expTitle = "Google", actTitle;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in");
		
		actTitle = driver.getTitle();
		System.out.println("Title of the page: " + actTitle);
		
		if(expTitle.equals(actTitle))
			System.out.println("Test case pass");
		else
			System.out.println("Test case fail");
		
		driver.close();
	}

}
