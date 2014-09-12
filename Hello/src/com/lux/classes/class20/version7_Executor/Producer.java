package com.lux.classes.class20.version7_Executor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Producer implements Runnable {

	private Buffer buffer;
	private File file;

	public Producer(Buffer buffer, File file) {
		this.buffer = buffer;
		this.file = file;
	}

	@Override
	public void run() {
		try {
			loadFile(file);
			//System.out.println(buffer.size());
			
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
			buffer.put(null);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}



}
