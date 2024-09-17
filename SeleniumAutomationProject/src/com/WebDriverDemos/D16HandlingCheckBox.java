package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D16HandlingCheckBox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement checkBox = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input"));
		
		System.out.println("Before...");
		System.out.println("Selected: " + checkBox.isSelected());
		System.out.println("Visible : " + checkBox.isDisplayed());
		System.out.println("Enabled : " + checkBox.isEnabled());
		
		if(checkBox.isSelected() == false && checkBox.isEnabled() == true)
			checkBox.click();
		
		System.out.println("\nAfter...");
		System.out.println("Selected: " + checkBox.isSelected());
		System.out.println("Visible : " + checkBox.isDisplayed());
		System.out.println("Enabled : " + checkBox.isEnabled());
	}

}
