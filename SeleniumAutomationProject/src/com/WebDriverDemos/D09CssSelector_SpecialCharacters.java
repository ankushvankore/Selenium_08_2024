package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D09CssSelector_SpecialCharacters {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement fullName = driver.findElement(By.cssSelector("input[maxlength=\"61\"]"));
		fullName.sendKeys("Ankush Vankore");
		WebElement rediffId = driver.findElement(By.cssSelector("input[maxlength=\"30\"][onclick=\"javascript:UncheckAllOptions();\"]"));
		rediffId.sendKeys("ankushvankore");
		
		//^ - Starts with
		WebElement chkBtn = driver.findElement(By.cssSelector("input[name^=\"btnchkavail\"]"));
		chkBtn.click();
		//$ - Ends with
		WebElement password = driver.findElement(By.cssSelector("input[id$=\"passwd\"]"));
		password.sendKeys("1234567890");
		//* - Contains
		WebElement confirmPwd = driver.findElement(By.cssSelector("input[name*=\"firm_p\"]"));
		confirmPwd.sendKeys("1234567890");
	}

}
