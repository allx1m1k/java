package com.lux.classes.class10.examples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipUnpackDemo {

	public static void blockCopy(InputStream is, OutputStream ous) throws IOException {
        byte[] b = new byte[1024];
        int count = 0;
        while ((count = is.read(b)) != -1) {
            ous.write(b, 0, count);
        }
    }	
	
	public static void main(String[] args) throws IOException {
		File dir = new File("e:/Demo/zipfolder/unpack");
		File zipFile = new File("e:/Demo/zipfolder/test.zip");
		
		if (!dir.exists()) dir.mkdir();
		
		ZipInputStream zip = new ZipInputStream(new FileInputStream(zipFile));
		ZipEntry entry;
		while ((entry = zip.getNextEntry()) != null ) {
			System.out.println(entry.getName());
			FileOutputStream fos = new FileOutputStream(dir + "/" +entry.getName());
			blockCopy(zip,fos);
			zip.closeEntry();
			fos.close();			
		}
		if (zip != null) zip.close();
	}

}
