package com.cucumber.framework.helper.genericHelper;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Header;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class DataHelper {
	public static HashMap<String,String> storeValues = new HashMap();
	public static List<HashMap<String,String>> data(String filepath,String sheetName)
	{
		int width = 5000; 
		List<HashMap<String,String>> mydata = new ArrayList<>();
		try
		{
			FileInputStream fs = new FileInputStream(filepath);
			XSSFWorkbook workbook = new XSSFWorkbook(fs);
			XSSFSheet sheet = workbook.getSheet(sheetName);
			//sheet.autoSizeColumn(1);
			
			Row HeaderRow = sheet.getRow(0);
			//sheet.setColumnWidth(0, 1000);
			//sheet.setColumnWidth(1, 7500);
			//sheet.setColumnWidth(2, 7500);

			for(int i=1;i<sheet.getPhysicalNumberOfRows();i++)
			{
				for(int columnPosition = 0; columnPosition< 10; columnPosition++) {
		             sheet.autoSizeColumn((short) (columnPosition));
		        }

				Row currentRow = sheet.getRow(i);
				HashMap<String,String> currentHash = new HashMap<String,String>();
				for(int j=0;j<currentRow.getPhysicalNumberOfCells();j++)
				{ 
						
					//
					Cell currentCell = currentRow.getCell(j);
					
					switch (currentCell.getCellType())
					{
					case Cell.CELL_TYPE_STRING:
							
						System.out.print(currentCell.getStringCellValue() + "\t");
						currentHash.put(HeaderRow.getCell(j).getStringCellValue(), currentCell.getStringCellValue());
						break;
					}
				}
				mydata.add(currentHash);
			}
			fs.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return mydata;
	}
}
