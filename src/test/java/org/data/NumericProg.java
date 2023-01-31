package org.data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NumericProg {

	public static void main(String[] args) throws IOException  {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/apitestingtraininginchennaiomr");
		driver.manage().window().maximize();
	
			  WebElement country = driver.findElement(By.id("country-list"));
			  
			  Select select = new Select (country);
			  List<WebElement> options = select.getOptions();
				  
				  File file= new File("C:\\Users\\91948\\eclipse-workspace\\ggg\\excel\\countryname.xlsx");
				   
				  Workbook workbook = new XSSFWorkbook();
				  Sheet sheet = workbook.createSheet("Datas");
				  
				  for (int i = 0; i < options.size(); i++) {
					  String text = options.get(i).getText();
					    
				 
				  sheet.createRow(i).createCell(0).setCellValue(text);
				  FileOutputStream our = new FileOutputStream(file);
				  workbook.write(our);
				  }
			}
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			
		}
		  
			
		 
		 
	
		
		
		
		
		
		
		


