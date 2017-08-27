package com.example.tickets;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by dima on 8/28/2017.
 */
public class TicketToExcel {

    /**
     * Method outputs Tickets to Excel file
     * @param tickets - list of Tickets which have to be written to Excel
     * @throws IOException
     */
    public static void writeTicketsToXLSXFile(ArrayList<Ticket> tickets) throws IOException {

        String excelFileName = "C:/Ticket2Excel.xlsx";//name of excel file

        String sheetName = "AllTickets";//name of sheet

        XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet sheet = wb.createSheet(sheetName) ;

        //iterating r number of rows
        for (int r=0;r < tickets.size(); r++ )
        {
            XSSFRow row = sheet.createRow(r);

            //iterating c number of columns
            for (int c=0;  c < 5; c++ )
            {

                XSSFCell cell = row.createCell(c);
                cell.setCellValue(tickets.get(r).getParam("id"));
                //cell.setCellValue("Cell "+r+" "+c);
            }
        }

        FileOutputStream fileOut = new FileOutputStream(excelFileName);

        //write this workbook to an Outputstream.
        wb.write(fileOut);
        fileOut.flush();
        fileOut.close();
    }
}
