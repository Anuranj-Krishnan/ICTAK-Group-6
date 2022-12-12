package com.ictak.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutilitiesict {

	private static XSSFWorkbook excelWBook;
	private static XSSFSheet  excelWsheet;
private	static DataFormatter formatter = new DataFormatter();
	
	public static String getCellData(int rowNum,int colNum) throws IOException
	
	
	{
		FileInputStream ExcelFile=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\ICTAKfinal\\src\\main\\resources\\data.xlsx");
		 excelWBook = new XSSFWorkbook(ExcelFile);
		 excelWsheet = excelWBook.getSheetAt(0);
		Cell cell=excelWsheet.getRow(rowNum).getCell(colNum);
		return formatter.formatCellValue(cell);

         
	}
	
	
		
		
	
	
	
	
	
}
