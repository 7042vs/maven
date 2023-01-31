package org.bace;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	
	
	
	public String getDatafromCell(String sheetname,int rownum,int cellnum) throws Exception {

		String res = null;
	File file = new File("C:\\Users\\91948\\eclipse-workspace\\ggg\\excel\\countryname.xlsx");
		
		FileInputStream stream = new FileInputStream(file); 
		
		Workbook Workbook = new XSSFWorkbook(stream);
		
		Sheet sheet = Workbook.getSheet(sheetname);
		Row row2 = sheet.getRow(rownum);
		Cell cell = row2.getCell(cellnum);
		
		CellType type = cell.getCellType();
		
		switch (type) {
		case STRING:
			
			res = cell.getStringCellValue();
			break;
			
		case NUMERIC:
			

			 if (DateUtil.isCellDateFormatted(cell)) {
				  Date dateCellValue = cell.getDateCellValue();
				  SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
			
				  res = dateFormat.format(dateCellValue);
			}
			 
			 else {
				 double numericCellValue = cell.getNumericCellValue();
				 long check = Math.round(numericCellValue);
				 
				 if (check==numericCellValue) {
					 
					 res = String.valueOf(check);
					
				}
				 
				 else {
					
					 res = String.valueOf(numericCellValue);

					
						
				}
				 break; 
			 }
				
			 default:
					break;
			 }
		
		
		return res;	
	}

	
	public void updateCellData(String sheetname,int rownum,int cellnum,String olddata,String newdata) throws Exception {
		File file = new File("C:\\Users\\91948\\eclipse-workspace\\ggg\\excel\\countryname.xlsx");
			
			FileInputStream stream = new FileInputStream(file); 
			
			Workbook Workbook = new XSSFWorkbook(stream);
			
			Sheet sheet = Workbook.getSheet(sheetname);
			Row row2 = sheet.getRow(rownum);
			Cell cell = row2.getCell(cellnum);
			String value = cell.getStringCellValue();
			
			if (value.equals(olddata)) {
				
				cell.setCellValue(newdata);
				
			}
			
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			Workbook.write(fileOutputStream);	

	}
	
	
	public void writeCellData(String sheetname, int rownum,int cellnum,String data) throws Exception {
		File file = new File("C:\\Users\\91948\\eclipse-workspace\\ggg\\excel\\countryname.xlsx");
		
		FileInputStream stream = new FileInputStream(file); 
		
		Workbook Workbook = new XSSFWorkbook(stream);
		
		Sheet sheet = Workbook.getSheet(sheetname);
		Row row2 = sheet.getRow(rownum);
		Cell cell = row2.createCell(cellnum);
		cell.setCellValue(data);
		
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		Workbook.write(fileOutputStream);

		
		
		
	}
	







}
