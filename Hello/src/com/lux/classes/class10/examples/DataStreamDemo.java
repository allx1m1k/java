package com.lux.classes.class10.examples;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamDemo {

	static final double[] prices = { 19.99, 9.99, 15.99, 3.99, 4.99 };
	static final int[] units = { 122, 8, 13, 29, 50 };
	static final String[] descs = {
		"Java T-shirt",
		"Java Mug",
		"Duke Juggling Dolls",
		"Java Pin",
		"Java Key Chain"
	};

	static final String file = "invoice.dat";


	public static void writeInvoice(String file) throws WriteInvoiceException {

		try (
				DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
				) {
			for (int i = 0; i < prices.length; i ++) {
				out.writeDouble(prices[i]);
				out.writeInt(units[i]);
				out.writeUTF(descs[i]);
			}
		} 
		catch (IOException e) {
			throw new WriteInvoiceException(e);
		}
	}

	public static void readInvoice(String file) throws ReadInvoiceException {
		double price;
		int unit=0;
		String desc;
		double total = 0.0;		

		try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));) {
			while (true) {
				price = in.readDouble();
				unit = in.readInt();
				desc = in.readUTF();
				System.out.format("You ordered %d" + " units of %s at $%.2f%n",
						unit, desc, price);
				total += unit * price;
			}					
		} 
		catch (FileNotFoundException e) {
			throw new ReadInvoiceException("File " + file + " not found!");
		} 
		catch (EOFException e) {
			System.out.format("Total: %.2f", total);
		} 
		catch (IOException e) {
			throw new ReadInvoiceException(e);
		}
	}


	public static void main(String[] args) {
		try {
			writeInvoice(file);
			readInvoice(file);
		}
		catch (ReadInvoiceException e) {
			System.out.println(e.getMessage());
		}
		catch (WriteInvoiceException e) {
			System.out.println(e.getMessage());
		}

	}

	
	@SuppressWarnings("serial")
	private static class WriteInvoiceException extends IOException {

		private static final String message = "Error while reading invoice. ";

		@SuppressWarnings("unused")
		WriteInvoiceException() {
			super(message);
		}

		WriteInvoiceException(Throwable e) {
			super(message, e);
		}
	}	
	
	@SuppressWarnings("serial")
	private static class ReadInvoiceException extends IOException {

		private static final String message = "Error while reading invoice. ";


		@SuppressWarnings("unused")
		ReadInvoiceException() {
			super(message);
		}
		
		ReadInvoiceException(String arg) {
			super(message + arg);
		}

		ReadInvoiceException(Throwable e) {
			super(message, e);
		}
	}

}
