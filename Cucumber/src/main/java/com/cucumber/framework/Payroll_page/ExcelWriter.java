package com.cucumber.framework.Payroll_page;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriter {
	
	
	private static String[] columns = {"Employee_Code", "Employee_Name", "Currency_Code", "BAS_Basic_Salary"};

    private static List<Employee> employees =  new ArrayList<>();

    static {
      //  Calendar dateOfBirth = Calendar.getInstance();
      //  dateOfBirth.set(1992, 7, 21);
        employees.add(new Employee("Murugan004", "murugan006", "200", "1200000.0"));

      //  dateOfBirth.set(1965, 10, 15);
        employees.add(new Employee("Murugan005", "murugan05", "2000", "1200000.0"));

       
    }

    public static void main(String[] args) throws IOException, InvalidFormatException {

        // Create a Workbook
        Workbook workbook = new XSSFWorkbook();     // new HSSFWorkbook() for generating `.xls` file

        /* CreationHelper helps us create instances for various things like DataFormat,
           Hyperlink, RichTextString etc in a format (HSSF, XSSF) independent way */
        CreationHelper createHelper = workbook.getCreationHelper();

        // Create a Sheet
        Sheet sheet = workbook.createSheet("Employee");

        // Create a Font for styling header cells
        Font headerFont = workbook.createFont();
        //headerFont.setBold(true);
        headerFont.setFontHeightInPoints((short) 14);
        headerFont.setColor(IndexedColors.RED.getIndex());

        // Create a CellStyle with the font
        CellStyle headerCellStyle = workbook.createCellStyle();
        headerCellStyle.setFont(headerFont);

        // Create a Row
        Row headerRow = sheet.createRow(0);

        // Creating cells
        for(int i = 0; i < columns.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(columns[i]);
            cell.setCellStyle(headerCellStyle);
        }

        // Cell Style for formatting Date
        CellStyle dateCellStyle = workbook.createCellStyle();
        dateCellStyle.setDataFormat(createHelper.createDataFormat().getFormat("dd-MM-yyyy"));

        // Create Other rows and cells with employees data
        int rowNum = 1;
        for(Employee employee: employees) {
            Row row = sheet.createRow(rowNum++);

            row.createCell(0)
                    .setCellValue(employee.getName());

            row.createCell(1)
                    .setCellValue(employee.getEmail());

            Cell dateOfBirthCell = row.createCell(2);
            dateOfBirthCell.setCellValue(employee.getDateOfBirth());
            dateOfBirthCell.setCellStyle(dateCellStyle);

            row.createCell(3)
                    .setCellValue(employee.getSalary());
        }

        // Resize all columns to fit the content size
        for(int i = 0; i < columns.length; i++) {
            sheet.autoSizeColumn(i);
        }

        // Write the output to a file
        FileOutputStream fileOut = new FileOutputStream("C:\\Users\\Mani\\git\\tests\\Cucumber\\src\\test\\resources\\testData\\InfoExcelImport.xlsx");
        workbook.write(fileOut);
        fileOut.close();

        workbook.close();
    }
}
/*
    // Example to modify an existing excel file
    private static void modifyExistingWorkbook() throws InvalidFormatException, IOException {
        // Obtain a workbook from the excel file
        Workbook workbook = WorkbookFactory.create(new File("C:\\Users\\Mani\\git\\tests\\Cucumber\\src\\test\\resources\\testData\\InfoExcelImport.xlsx"));

        // Get Sheet at index 0
        Sheet sheet = workbook.getSheetAt(0);

        // Get Row at index 1
        Row row = sheet.getRow(1);

        // Get the Cell at index 2 from the above row
        Cell cell = row.getCell(2);

        // Create the cell if it doesn't exist
        if (cell == null)
            cell = row.createCell(2);

        // Update the cell's value
        cell.setCellType(cell.CELL_TYPE_STRING);
        cell.setCellValue("Updated Value");

        // Write the output to a file
        FileOutputStream fileOut = new FileOutputStream("C:\\Users\\Mani\\git\\tests\\Cucumber\\src\\test\\resources\\testData\\InfoExcelImport.xlsx");
        workbook.write(fileOut);
        fileOut.close();

        // Closing the workbook
        workbook.close();
    }
}
*/
class Employee {
    private String Employee_Code;

    private String Employee_Name;

    private String Currency_Code;

    private String BAS_Basic_Salary;

    public Employee(String Employee_Code, String Employee_Name, String Currency_Code, String BAS_Basic_Salary) {
        this.Employee_Code = Employee_Code;
        this.Employee_Name = Employee_Name;
        this.Currency_Code = Currency_Code;
        this.BAS_Basic_Salary = BAS_Basic_Salary;
    }

    public String getName() {
        return Employee_Code;
    }

    public void setName(String Employee_Code) {
        this.Employee_Code = Employee_Code;
    }

    public String getEmail() {
        return Employee_Name;
    }

    public void setEmail(String Employee_Name) {
        this.Employee_Name = Employee_Name;
    }

    public String getDateOfBirth() {
        return Currency_Code;
    }

    public void setDateOfBirth(String Currency_Code) {
        this.Currency_Code = Currency_Code;
    }

    public String getSalary() {
        return BAS_Basic_Salary;
    }

    public void setSalary(String BAS_Basic_Salary) {
        this.BAS_Basic_Salary = BAS_Basic_Salary;
    }


}
