package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A06BootmRegistration {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.botmtesting.com/a/p/free-trial");
		
		driver.findElement(By.name("trial_fname")).sendKeys("Ankush");
		driver.findElement(By.name("trial_lname")).sendKeys("Vankore");
		driver.findElement(By.name("trial_company")).sendKeys("I am the BOSS");
		driver.findElement(By.name("trial_email")).sendKeys("theboss@indiagov.com");
		driver.findElement(By.xpath("//*[@id=\"free_trial_form\"]/div[6]/div[3]/div[1]/span/span[1]/span/span[2]")).click();
		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("IND +91", Keys.ENTER);
		driver.findElement(By.name("trial_mobile")).sendKeys("9898989898");
		driver.findElement(By.xpath("//*[@id=\"free_trial_form\"]/div[7]/span/span[1]/span/span[2]")).click();
		//driver.findElement(By.xpath("//*[@id=\"select2-trial_country-result-9srr-India\"]")).click();
		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("India", Keys.ENTER);
		driver.findElement(By.name("trial_city")).sendKeys("Kolhapur");
		driver.findElement(By.id("trial_message")).sendKeys("Welcome To Testing");
		
		driver.findElement(By.id("submit")).submit();
		
	}

}
