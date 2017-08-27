package com.example.tickets;

import org.eclipse.jetty.util.DateCache;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by dima on 8/26/2017.
 */
public class TicketsApp {

    public static void main(String[] args) {
        //creating a tickets list
        ArrayList<Ticket> tickets = new ArrayList<Ticket>(3);
        //add ticket to list
        Ticket t =new Ticket();
        t.setParam("id", "123");
        tickets.add(t);

        try {
            ReadWriteExcelFile.writeXLSXFile();
            TicketToExcel.writeTicketsToXLSXFile(tickets);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
