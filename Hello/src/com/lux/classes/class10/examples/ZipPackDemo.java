package com.lux.classes.class10.examples;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipPackDemo {
	
    public static void blockCopy(InputStream is, OutputStream ous) throws IOException {
        byte[] b = new byte[1024];
        int count = 0;
        while ((count = is.read(b)) != -1) {
            ous.write(b, 0, count);
        }
    }

	public static void main(String[] args) throws IOException {
		File dir = new File("e:/Demo/zipfolder");
		File zipFile = new File("e:/Demo/zipfolder/test.zip");
		
		if (zipFile.exists()) zipFile.delete();
		
		File[] files = dir.listFiles();
		try (	
				FileOutputStream out = new FileOutputStream(zipFile);
				ZipOutputStream zip = new ZipOutputStream(out);	
		) {
			zip.setLevel(Deflater.BEST_COMPRESSION);
			for (File file : files) {
				if (file.isFile()) {
					System.out.println(file);					
					
					zip.putNextEntry(new ZipEntry(file.getName()));
					InputStream in = new FileInputStream(file);
					blockCopy(in, zip);
					zip.closeEntry();
					in.close();
				}
			}
			if (zip != null) zip.close();
		}
		


	}
}
