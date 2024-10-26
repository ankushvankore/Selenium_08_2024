package com.TestNGDemos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D12ReadData {
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	@Test(enabled = false)
	public void readData() {
		row = sheet.getRow(0);
		cell = row.getCell(0);
		
		System.out.println(cell.getStringCellValue());
		
		cell = row.getCell(1);
		System.out.println(cell.getStringCellValue());
		
		System.out.println(sheet.getRow(0).getCell(2).getStringCellValue());
		
		System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
		System.out.println(sheet.getRow(1).getCell(2).getStringCellValue());
	}
	
	@Test
	public void getAllData()
	{
		int rows = sheet.getPhysicalNumberOfRows();
		int cells = sheet.getRow(0).getPhysicalNumberOfCells();
		
		for(int i = 0; i < rows; i++)
		{
			row = sheet.getRow(i);
			for(int j = 0; j < cells; j++)
			{
				cell = row.getCell(j);
				System.out.println(cell.getStringCellValue());
			}
		}
	}

	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File("Excel Files\\LoginData.xlsx");
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);		//Because we are going to read the data from 
										//existing workbook
		sheet = wb.getSheet("Sheet1");
	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.close();
		fis.close();
	}

}
