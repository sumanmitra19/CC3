package Test_package;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTestForm { //DO NOT change the class name
	
public static WebDriver driver;

public static String[][] result=new String[6][2];

public void createDriver() {

//Create driver and store in in static variable 'driver'
	
	driver = DriverSetup.getWebDriver();

}

public void testSeleniumTestForm() throws Exception {

//Parse the first row from excel sheet. Send the data to form and submit.

//Retrieve the respective element value displayed on page after submit. Store it in respective static variable

//Assert each element value.

//Store the element value, "Test Passed" or "Test Failed" to variable 'result'

//Example, nickname value in result[0][0]

// "Test Passed" or "Test Failed" in result[0][1]

//Write the data in 'result' new sheet 'customervalid1' on each row

}

public static void main(String[] args) throws Exception

{

SeleniumTestForm st=new SeleniumTestForm();

//Add code here

}

}
