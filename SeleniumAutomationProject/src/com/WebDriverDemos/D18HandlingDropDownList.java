package com.WebDriverDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D18HandlingDropDownList {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement dropDownList = driver.findElement(By.id("country"));
		Select countries = new Select(dropDownList);
		
		System.out.println("Selected Country: " + countries.getFirstSelectedOption().getText());
		
		List<WebElement>allCountries = countries.getOptions();
		System.out.println("Total no of countries: " + allCountries.size());
		
		/*int i = 0;
		for(WebElement c : allCountries)
		{
			System.out.println(i + ". " + c.getText());
			i++;
		}*/
		
		//countries.selectByVisibleText("United States");
		//countries.selectByValue("222");
		countries.selectByIndex(219);
		System.out.println("Selected Country: " + countries.getFirstSelectedOption().getText());
		
		//driver.close();
	}

}
