package com.WebDriverDemos;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D27RobotClassDemo {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://sampleapp.tricentis.com/101/index.php#");

		Robot rbt = new Robot();

		driver.findElement(By.partialLinkText("Auto")).click();
		driver.findElement(By.linkText("Enter Insurant Data")).click();

		driver.findElement(By.id("open")).click();

		for (int i = 1; i <= 8; i++) {
			Thread.sleep(1000);
			rbt.keyPress(KeyEvent.VK_TAB);
		}
		
		Thread.sleep(1000);
		rbt.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rbt.keyPress(KeyEvent.VK_DOWN);
		
		Thread.sleep(1000);
		rbt.keyPress(KeyEvent.VK_ENTER);
		
		Thread.sleep(1000);
		rbt.keyPress(KeyEvent.VK_TAB);
		
		Thread.sleep(1000);
		rbt.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rbt.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rbt.keyPress(KeyEvent.VK_DOWN);
		
		Thread.sleep(1000);
		rbt.keyPress(KeyEvent.VK_ENTER);

	}

}
