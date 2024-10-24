package com.TestNGDemos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D11WriteDataToExcel {
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	@Test
	public void writeData() {
		row = sheet.createRow(0);	//Create 1st row
		cell = row.createCell(0);	//Create 1st cell in 1st row
		
		cell.setCellValue("Priyanka");	//Will add the data in cell
		
		cell = row.createCell(1);	//Create 1st cell in 1st row
		cell.setCellValue("Akotkar");
		
		sheet.createRow(1).createCell(0).setCellValue("Nandkumar");
		sheet.getRow(1).createCell(1).setCellValue("Londhe");
		
		sheet.createRow(2).createCell(0).setCellValue("Govind");
		sheet.getRow(2).createCell(1).setCellValue("Khandelwal");
	}

	@BeforeTest
	public void beforeTest() throws FileNotFoundException {
		file = new File("MyFirstExcelFile.xlsx");
		fos = new FileOutputStream(file);
		wb = new XSSFWorkbook();
		sheet = wb.createSheet("FirstSheet");
	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.write(fos); 				//Writes the data to the file
		wb.close();
		fos.close();
	}

}
