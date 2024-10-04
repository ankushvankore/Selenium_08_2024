package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D32MouseClicks {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions act = new Actions(driver);
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement rightClick = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		//act.moveToElement(rightClick).contextClick().perform();
		act.contextClick(rightClick).perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("authentication")).click();
		
		WebElement dblClick = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.moveToElement(dblClick).doubleClick().perform();
		
		//Alert alt = driver.switchTo().alert();
		//System.out.println(alt.getText());
		//alt.accept();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
	}

}
