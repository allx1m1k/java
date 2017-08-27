package com.example.tickets;

import java.io.*;


import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.openxml4j.opc.PackageAccess;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.CellType;

/**
 * Created by dima on 8/26/2017.
 */
public class ReadWriteWorkbook {
    public static void main(String[] args) throws IOException {
        FileInputStream fileIn = null;
        FileOutputStream fileOut = null;

        try
        {

            OPCPackage pkg = OPCPackage.open("D:\\eclipse\\newworkspace\\Hello\\bin\\com\\lux\\classes\\workbook.xlsx", PackageAccess.READ_WRITE);
            //fileIn = new FileInputStream("D:\\eclipse\\newworkspace\\Hello\\bin\\com\\lux\\classes\\workbook.xlsx");
            //POIFSFileSystem fs = new POIFSFileSystem(fileIn);
            XSSFWorkbook wb = new XSSFWorkbook(pkg);
            //XSSFWorkbook wb = WorkbookFactory.create(pkg);

           /*  read or create cell
            XSSFSheet sheet = wb.getSheetAt(0);
            XSSFRow row = sheet.getRow(2);
            if (row == null)
                row = sheet.createRow(2);
            XSSFCell cell = row.getCell(3);
            if (cell == null)
                cell = row.createCell(3);
            //cell.setCellType(CellType.STRING);
            //cell.setCellValue("a test");
            System.out.println("Yes!");
            */
            //iterate through workbook https://gist.github.com/madan712/3912272

            int numberOfSheets = wb.getNumberOfSheets();
            System.out.println("Total Sheets " + numberOfSheets );

            // Write the output to a file
            fileOut = new FileOutputStream("workbookout.xls");
            wb.write(fileOut);
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        } finally {
            if (fileOut != null)
                fileOut.close();
            if (fileIn != null)
                fileIn.close();
        }
    }
}