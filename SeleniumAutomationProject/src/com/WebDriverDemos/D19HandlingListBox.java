package com.WebDriverDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D19HandlingListBox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://omayo.blogspot.com/");

		//WebElement listBox = driver.findElement(By.id("multiselect1"));
		//Select cars = new Select(listBox);

		Select cars = new Select(driver.findElement(By.id("multiselect1")));

		List<WebElement>carList = cars.getOptions();
		for(WebElement c : carList)
			System.out.println(c.getText());

		if(cars.isMultiple())
		{
			cars.selectByIndex(0);
			cars.selectByIndex(2);

			List<WebElement>selectedCars = cars.getAllSelectedOptions();
			System.out.println("\nSelected Cars:");

			for(WebElement s : selectedCars)
				System.out.println(s.getText());
		}
		//cars.deselectAll();
		cars.deselectByIndex(2);
		//driver.close();
	}

}
