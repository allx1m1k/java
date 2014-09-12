package com.lux.classes.class20.version4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Producer implements Runnable {

	private Buffer buffer;
	private File[] files;
	private Controller controller;

	public Producer(Buffer buffer, File[] files, Controller controller) {
		this.buffer = buffer;
		this.files = files;
		this.controller = controller;
	}

	@Override
	public void run() {
		try {
			for (File file : files) {
				loadFile(file);
				System.out.println(buffer.size());
			}		
			controller.downCounter();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void loadFile(File file) throws InterruptedException {
		try (BufferedReader reader = new BufferedReader(new FileReader(file)) ) {
			String line = reader.readLine();
			while (line != null) {
				buffer.put(line);
				line = reader.readLine();
			}				
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}



}
