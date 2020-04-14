package com.SopraSteria.helpers;

import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	public HashMap<String, String> getData()
	{
		HashMap<String, String> dataMap	=	new HashMap<String, String>();
		try {
			
			XSSFWorkbook workbook	=	new XSSFWorkbook("TestData/TestDriver.xlsx");
			XSSFSheet	 sheet		=	workbook.getSheetAt(0);
			int 		 rowCount	=	sheet.getLastRowNum();
			
			for(int i=1;i<=rowCount;i++)
			{
				Row r = sheet.getRow(i);
				for(int j=0;j<=r.getLastCellNum();j++)
				{
					Cell c= r.getCell(j);
					String s="";
					if(c.getCellTypeEnum().equals(CellType.STRING))
						s	=	c.getStringCellValue();
					else if(c.getCellTypeEnum().equals(CellType.NUMERIC))
						s	=	""+c.getNumericCellValue();
					else if(c.getCellTypeEnum().equals(CellType.BOOLEAN))
						s	=	""+c.getBooleanCellValue();
					else 
						s	=	"";
					dataMap.put(sheet.getRow(0).getCell(j).getStringCellValue(), s);
				}
				
			}
			workbook.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return dataMap;
	}
}
