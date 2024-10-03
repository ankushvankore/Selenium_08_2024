package com.WebDriverDemos;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D28HandlingMultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.online.citibank.co.in/");
		
		driver.findElement(By.xpath("//*[@id=\"popup1\"]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"popup2\"]/div/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div[2]/div/div/div[2]/div/div/a[2]/span[2]")).click();
		
		System.out.println(driver.getTitle());
		
		Set<String>windows = driver.getWindowHandles();
		//System.out.println(windows);
		
		Iterator<String>itr = windows.iterator();	//Used to iterate the elements from Set
		String win1 = itr.next();					//Read the 1st element from set
		String win2 = itr.next();					//Read the 2nd element from set
		//System.out.println(win1);
		//System.out.println(win2);
		
		driver.switchTo().window(win2);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.linkText("Continue")).click();
		Thread.sleep(2000);
		
		driver.switchTo().window(win1);
		Thread.sleep(2000);
		driver.findElement(By.linkText("ABOUT US")).click();
		
		driver.quit();
	}

}
