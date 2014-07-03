package com.lux.classes;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class TestResource  implements AutoCloseable {
	
	public void test() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void close() throws IOException {
		
		//throw new RuntimeException("mmmmmmmmm");
		System.out.println("autoclose");
	}
	
}
