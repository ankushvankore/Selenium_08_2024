package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RediffCreateAccount {
	WebDriver driver;

	public RediffCreateAccount(WebDriver d)
	{
		driver = d;
	}
	
	public void enterFullName(String fullName)
	{
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys(fullName);
	}
	public void enterRediffId(String rediffId)
	{
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")).sendKeys(rediffId);
	}
	public void checkAvailablity() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("//*[@id=\"check_availability\"]/font[1]/b")).getText());
	}
	public void enterPassword(String password)
	{
		driver.findElement(By.xpath("//*[@id=\"newpasswd\"]")).sendKeys(password);
	}
	public void enterConfirmPassword(String password)
	{
		driver.findElement(By.xpath("//*[@id=\"newpasswd1\"]")).sendKeys(password);
	}
	public void enterAltEmailId(String altMail)
	{
		driver.findElement(By.xpath("//*[@id=\"div_altemail\"]/table/tbody/tr[1]/td[3]/input")).sendKeys(altMail);
	}
	public void enterMobileNo(String mobileNo)
	{
		driver.findElement(By.xpath("//*[@id=\"mobno\"]")).sendKeys(mobileNo);
	}
	public void setBirthDate(String day, String month, String year)
	{
		new Select(driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"))).selectByVisibleText(day);
		new Select(driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"))).selectByVisibleText(month);
		new Select(driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"))).selectByVisibleText(year);
	}
}
