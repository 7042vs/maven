package org.bace;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHotel {
	public static void main(String[] args) throws IOException {
		 File file= new File("C:\\Users\\91948\\eclipse-workspace\\ggg\\excel\\noteas.xlsx");
		   
		Workbook workbook =new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("Hotel");
		Row row = sheet.createRow(1);
		Cell cell = row.createCell(0);
	    	
		
		
		
	}

}
