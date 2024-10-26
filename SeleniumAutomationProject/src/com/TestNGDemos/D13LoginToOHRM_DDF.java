package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class D13LoginToOHRM_DDF {
	String fPath = "D:\\AViIT\\Demos\\Selenium_08_2024\\SeleniumAutomationProject\\Excel Files\\LoginData.xlsx";
	File file;
	FileInputStream fis;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	int index = 1;
	
	WebDriver driver;
	
	@Test(dataProvider = "getLoginData")
	public void loginToOHRM(String un, String ps) {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(ps);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@AfterMethod
	public void logout()
	{
		cell = sheet.getRow(index).getCell(2);
		
		if (driver.getCurrentUrl().contains("dashboard")) {
			driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
			driver.findElement(By.partialLinkText("Log")).click();
			System.out.println("Test case pass");
			cell.setCellValue("Pass");
		}
		else
		{
			System.out.println("Wrong Data\nTest case fail");
			cell.setCellValue("Fail");
		}
		index++;
	}

	@DataProvider
	public Object[][] getLoginData() {
		int rows = sheet.getPhysicalNumberOfRows();
		String loginData[][] = new String[rows-1][2];
		
		for(int i = 0; i < rows - 1; i++)
		{
			row = sheet.getRow(i + 1);
			for(int j = 0; j < 2; j++)
			{
				cell = row.getCell(j);
				cell.getStringCellValue();
				loginData[i][j] = cell.getStringCellValue();
			}
		}
		return loginData;
	}
	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File(fPath);
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheetAt(0);		//Index starts with 0
		fos = new FileOutputStream(file);	//Configure fos after sheet
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.write(fos);
		wb.close();
		fis.close();
		
		driver.close();
	}

}
