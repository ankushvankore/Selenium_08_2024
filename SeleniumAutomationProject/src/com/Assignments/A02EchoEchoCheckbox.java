package com.Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A02EchoEchoCheckbox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://echoecho.com/htmlforms09.htm");

		//List<WebElement>checkBoxes =  driver.findElements(By.cssSelector("input[name^=\"option\"]"));
		List<WebElement>checkBoxes = driver.findElements(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input"));

		/*for(int i = 0; i < checkBoxes.size(); i++)
		{

			System.out.println("Before...");
			System.out.println("Selected: " + checkBoxes.get(i).isSelected());
			System.out.println("Visible : " + checkBoxes.get(i).isDisplayed());
			System.out.println("Enabled : " + checkBoxes.get(i).isEnabled());

			if(!checkBoxes.get(i).isSelected())
				checkBoxes.get(i).click();

			System.out.println("\nAfter...");
			System.out.println("Selected: " + checkBoxes.get(i).isSelected());
			System.out.println("Visible : " + checkBoxes.get(i).isDisplayed());
			System.out.println("Enabled : " + checkBoxes.get(i).isEnabled());
		}*/
		
		for(WebElement product : checkBoxes)
		{
			System.out.println("Before...");
			System.out.println("Selected: " + product.isSelected());
			System.out.println("Visible : " + product.isDisplayed());
			System.out.println("Enabled : " + product.isEnabled());

			if(!product.isSelected())
				product.click();

			System.out.println("\nAfter...");
			System.out.println("Selected: " + product.isSelected());
			System.out.println("Visible : " + product.isDisplayed());
			System.out.println("Enabled : " + product.isEnabled());
		}
	}

}
