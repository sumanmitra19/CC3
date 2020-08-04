package Test_package;

import java.io.File;
import java.io.FileInputStream;
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

public static String getExcelPath(String firstSheetName)

{

//get the file path of the excel sheet, store it in the variable 'filePath' and return it
	filePath = new File("./AddressBook.xlsx");

}

public static Object[][] readExcelData(String firstSheetName) throws Exception

{

//read the data from excel sheet and store it in 2-D array. Return the array

	FileInputStream fis = new FileInputStream(filePath);
	wb = new XSSFWorkbook(fis);
	int row = wb.getSheetAt(sheetIndex).getLastRowNum();
	row = row+1;
	return row;
	int rowNumb = config.rowCount(0);
	Object[][] data = new Object[rowNumb][2];
	for(int i = 0; i<rowNumb; i++)
	{
		data[i][0] = config.getData(0, i, 0);
		data[i][1] = config.getData(0, i, 1);
	}
	
	return data;
}

public static void writeExcelData(String firstSheetName, String[][] result) throws Exception

{

//Write the data from 'result' in the new sheet 'customervalid1'

}

}
