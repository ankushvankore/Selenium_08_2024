package com.WebDriverDemos;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class D03LaunchingDifferentBrowser {

	public static void main(String[] args) {
		WebDriver driver = null;
		Scanner scn = new Scanner(System.in);
		int ch;
		
		System.out.println("Select Browser\n1. Chrome\n2. Edge\n3. Firefox\nEnter your choice: ");
		ch = scn.nextInt();
		
		if(ch == 1)
			driver = new ChromeDriver();
		else if(ch == 2)
			driver = new EdgeDriver();
		else if(ch == 3)
			driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://app.clipchamp.com/login");
		
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		
		driver.close();
	}

}
