package com.lux.training.lab2.employees;

import com.lux.assignment.Date1;

/**
 * Created by dima on 7/6/2014.
 */
public class Invoice {
    private int invoiceNumber; //номер инвойса
    private Date1 invoiceDate;
    private String item; //строка инвойса
    private double itemPrize; //цена товара
    private double itemQuantity; //кол-во товара
    private double total; //цена * кол-во товара

    public Invoice(int invoiceNumber, Date1 invoiceDate, String item, double itemPrize, double itemQuantity, double total) {
        this.invoiceNumber = invoiceNumber;
        this.invoiceDate = invoiceDate;
        this.item = item;
        this.itemPrize = itemPrize;
        this.itemQuantity = itemQuantity;
        this.total = total;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public Date1 getInvoiceDate() {
        return invoiceDate;
    }

    public String getItem() {
        return item;
    }

    public double getItemPrize() {
        return itemPrize;
    }

    public double getItemQuantity() {
        return itemQuantity;
    }

    public double getTotal() {
        return total;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public void setInvoiceDate(Date1 invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void setItemPrize(double itemPrize) {
        this.itemPrize = itemPrize;
    }

    public void setItemQuantity(double itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
