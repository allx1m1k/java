package com.example.tickets;

import java.io.IOException;

/**
 * Created by dima on 8/26/2017.
 */
public class TicketsApp {

    public static void main(String[] args) {
        try {
            ReadWriteExcelFile.writeXLSXFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
