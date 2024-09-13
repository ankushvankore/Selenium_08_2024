package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D08CssSelector_Attributes {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement fullName = driver.findElement(By.cssSelector("input[maxlength=\"61\"]"));
		fullName.sendKeys("Ankush Vankore");
		WebElement rediffId = driver.findElement(By.cssSelector("input[maxlength=\"30\"][onclick=\"javascript:UncheckAllOptions();\"]"));
		rediffId.sendKeys("ankushvankore");
	}

}
