package Test_package;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.By;

import CompleteDataDriven.XlConfig;

import org.apache.poi.ss.usermodel.*;

public class AddressBook //DO NOT change the class name

{

//Location of Test data excel file

public static File filePath = null;

static XSSFWorkbook wb;
static XSSFSheet sheet;

public static String getExcelPath(String firstSheetName) throws Exception

{

//get the file path of the excel sheet, store it in the variable 'filePath' and return it
	filePath = new File("./AddressBook.xlsx");
	FileInputStream fis = new FileInputStream(filePath);
	wb = new XSSFWorkbook(fis);
	sheet = wb.getSheet(firstSheetName);

}

public static Object[][] readExcelData(String firstSheetName) throws Exception

{

//read the data from excel sheet and store it in 2-D array. Return the array


	int row = sheet.getLastRowNum();
	row = row+1;

	Object[][] data = new Object[row][5];
	for(int i = 0; i<row; i++)
	{
		data[i][0] = sheet.getRow(i).getCell(0).getStringCellValue();
		data[i][1] = sheet.getRow(i).getCell(1).getStringCellValue();
		data[i][2] = sheet.getRow(i).getCell(2).getStringCellValue();
		data[i][3] = sheet.getRow(i).getCell(3).getStringCellValue();
		data[i][4] = sheet.getRow(i).getCell(4).getStringCellValue();
		data[i][5] = sheet.getRow(i).getCell(5).getStringCellValue();
	}
	
	return data;
}

public static void writeExcelData(String firstSheetName, String[][] result) throws Exception

{

//Write the data from 'result' in the new sheet 'customervalid1'

}

}
