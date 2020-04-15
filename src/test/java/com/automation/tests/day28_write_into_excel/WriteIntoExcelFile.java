package com.automation.tests.day28_write_into_excel;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteIntoExcelFile {
    @Test
    public void writeIntoExcelFile() throws IOException {
        FileInputStream inputStream = new FileInputStream("VytrackTestUsers.xlsx");
        Workbook workbook = WorkbookFactory.create(inputStream);
        inputStream.close();

        Sheet sheet = workbook.getSheet("QA3-short");
        Row row = sheet.getRow(1); // 2nd row
        Cell cell = row.getCell(row.getLastCellNum() - 1);// last column
        System.out.println("Before:"+cell.getStringCellValue());
        cell.setCellValue("PASSED"); // changing N/A to PASSED
        System.out.println("After:"+cell.getStringCellValue());

        // I create if I want to write something into the file
        // den't forget to close excel file if you opened
        FileOutputStream outputStream = new FileOutputStream("VytrackTestUsers.xlsx");
        workbook.write(outputStream);
        workbook.close();





    }




}
