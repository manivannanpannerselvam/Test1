package com.cucumber.framework.Payroll_page;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Deletefolder 
{
	// public static void main(String[] args) throws IOException
	 //   {	
		 /*
	    	try{
	    		
	    		
	    		File file = new File("C:\\Users\\Mani\\Downloads\\InfoExcelImport.xlsx");
	        	
	    		if(file.delete()){
	    			System.out.println(file.getName() + " is deleted!");
	    		}else{
	    			System.out.println("Delete operation is failed.");
	    		}
	    	   
	    	}catch(Exception e){
	    		
	    		e.printStackTrace();
	    		
	    	}
	    	
	    	*/
		 
	    /*	
		 
		 String number = "6.24234";
	        double d = Double.parseDouble(number);
	        System.out.println("String " + number +" is parse to double value : " + d);
	        System.out.println(String.format("%.2f", d));
	     
	        // now let's use Double.valueOf() method to get double from String
	        String str = "8.23";
	        double value = Double.valueOf(str);
	        System.out.println("String to double conversion using valueOf : " + value);
	     
	     
	        // another way is by using Double wrapper class constructor
	        // though it will return Double value, autoboxing will convert
	        // it to double primitive value
	        String floating = "122.44213";
	        double converted = new Double(floating);
	        System.out.println("Double value " + converted + " created from String " + floating );
	     
	     
	        // Now let's do opposite by converting a double value to String in Java
	        // again there are three way to get a String value from double
	        // by String concatenation, valueOf() and toString() method
	     
	        // Simplest way to convert a double to String
	        double pie = 3.141233;
	        String parsed = "" + pie;
	        System.out.println("Double value : " + pie + " String value : " + parsed);
	     
	        // you can also use String.valueOf() to convert double to String
	        double myValue = 88.22123213;
	        String doubled = String.valueOf(myValue);
	        System.out.println("Double value " + myValue + " converted to String : " + doubled);
	     
	        // another way to get String from double is by using Double.toString() in Java
	        Double code = new Double(5543.32133);
	        String decode = code.toString();
	        System.out.println("double : " + code + " String : " + decode);
//	    	File myFile = new File("C:\\Users\\Mani\\Downloads\\InfoExcelImport.xlsx");
//            FileInputStream fis = new FileInputStream(myFile);
//
//            // Finds the workbook instance for XLSX file
//            XSSFWorkbook myWorkBook = new XSSFWorkbook (fis);
//           
//            // Return first sheet from the XLSX workbook
//            XSSFSheet mySheet = myWorkBook.getSheetAt(0);
//           
//            // Get iterator to all the rows in current sheet
//            Iterator<Row> rowIterator = mySheet.iterator();
//           
//            // Traversing over each row of XLSX file
//            while (rowIterator.hasNext()) {
//                Row row = rowIterator.next();
//
//                // For each row, iterate through each columns
//                Iterator<Cell> cellIterator = row.cellIterator();
//                while (cellIterator.hasNext()) {
//
//                    Cell cell = cellIterator.next();
//
//                    switch (cell.getCellType()) {
//                    case Cell.CELL_TYPE_STRING:
//                        System.out.print(cell.getStringCellValue() + "\t");
//                        
//                        break;
//                    case Cell.CELL_TYPE_NUMERIC:
//                        System.out.print(cell.getNumericCellValue() + "\t");
//                        break;
//                    case Cell.CELL_TYPE_BOOLEAN:
//                        System.out.print(cell.getBooleanCellValue() + "\t");
//                        break;
//                    default :
//                 
//                    }
//                }
//                System.out.println("");
//            }
//	    	    }
	    }
	 */
		 
		
		 
		 
		 
		 
		 /*
		 
		 
		 
		 final String FILE_NAME = "C:\\Users\\Mani\\git\\tests\\Cucumber\\src\\test\\resources\\testData\\InfoExcelImport.xlsx";

		   

		        try {

		            FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));
		            Workbook workbook = new XSSFWorkbook(excelFile);
		            Sheet datatypeSheet = workbook.getSheet("Data");
		            Iterator<Row> iterator = datatypeSheet.iterator();
		            datatypeSheet.autoSizeColumn(0);

		            while (iterator.hasNext()) {

		                Row currentRow = iterator.next();
		                Iterator<Cell> cellIterator = currentRow.iterator();

		                while (cellIterator.hasNext()) {

		                    Cell currentCell = cellIterator.next();
		                    System.out.println(currentCell);
		                    //getCellTypeEnum shown as deprecated for version 3.15
		                    //getCellTypeEnum ill be renamed to getCellType starting from version 4.0
		                    if (currentCell.getCellType() == CellType.STRING){
		                    	//System.out.println("Tesr");
		                        System.out.print(currentCell.getStringCellValue() + "--");
		                    } else if (currentCell.getCellType() == CellType.NUMERIC){
		                        System.out.print(currentCell.getNumericCellValue() + "--");
		                    }

		                }
		                System.out.println();

		            }
		        } catch (FileNotFoundException e) {
		            e.printStackTrace();
		        } catch (IOException e) {
		            e.printStackTrace();
		        }

	    }
	    */
public static void main(String[] args) {

	        try {
	            File excel = new File("C:\\Users\\Mani\\git\\tests\\Cucumber\\src\\test\\resources\\testData\\InfoExcelImport.xlsx");
	            FileInputStream fis = new FileInputStream(excel);
	            XSSFWorkbook book = new XSSFWorkbook(fis);
	            XSSFSheet sheet = book.getSheetAt(0);

	            Iterator<Row> itr = sheet.iterator();

	            // Iterating over Excel file in Java
	            while (itr.hasNext()) {
	                Row row = itr.next();

	                // Iterating over each column of Excel file
	                Iterator<Cell> cellIterator = row.cellIterator();
	                while (cellIterator.hasNext()) {

	                    Cell cell = cellIterator.next();

	                    switch (cell.getCellType()) {
	                    case Cell.CELL_TYPE_STRING:
	                        System.out.print(cell.getStringCellValue() + "\t");
	                        break;
	                    case Cell.CELL_TYPE_NUMERIC:
	                        System.out.print(cell.getNumericCellValue() + "\t");
	                        break;
	                    case Cell.CELL_TYPE_BOOLEAN:
	                        System.out.print(cell.getBooleanCellValue() + "\t");
	                        break;
	                    default:

	                    }
	                }
	                System.out.println("");
	            }

	            // writing data into XLSX file
	            Map<String, Object[]> newData = new HashMap<String, Object[]>();
	            newData.put("7", new Object[] { "ZTEST003", "ZEMPLSAS", "S$", "2000.01",
	                    "2000.01" });
	            newData.put("8", new Object[] { "ZTEST004", "ZEMPLSAS", "S$", "2000.02",
	                    "2000.02" });
	            newData.put("9", new Object[] { "ZTEST005", "ZEMPLSG", "S$", "2000.03",
	                    "2000.03" });

	            Set<String> newRows = newData.keySet();
	            int rownum = sheet.getLastRowNum();
	            
	            System.out.println("what is the rownum" +rownum);
                int rownums=rownum-48;
	            for (String key : newRows) {
	                Row row = sheet.createRow(rownums++);
	                Object[] objArr = newData.get(key);
	                int cellnum = 0;
	                for (Object obj : objArr) {
	                    Cell cell = row.createCell(cellnum++);
	                    if (obj instanceof String) {
	                        cell.setCellValue((String) obj);
	                    } else if (obj instanceof Boolean) {
	                        cell.setCellValue((Boolean) obj);
	                    } else if (obj instanceof Date) {
	                        cell.setCellValue((Date) obj);
	                    } else if (obj instanceof Double) {
	                        cell.setCellValue((Double) obj);
	                    }
	                }
	            }

	            // open an OutputStream to save written data into Excel file
	            FileOutputStream os = new FileOutputStream(excel);
	            book.write(os);
	            System.out.println("Writing on Excel file Finished ...");

	            // Close workbook, OutputStream and Excel file to prevent leak
	            os.close();
	            book.close();
	            fis.close();

	        } catch (FileNotFoundException fe) {
	            fe.printStackTrace();
	        } catch (IOException ie) {
	            ie.printStackTrace();
	        }
	    }
}
	 

