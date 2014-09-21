package com.onpu.courses.reflection.proxy;


public class ProxyDemo {

	public static void main(String[] args) {
		Test test = new TestImpl();
		System.out.println(test.hello());
		
		Test test2 = (Test) LogProxy.newInstance(test);
		System.out.println(test2.hello());
	}
	
	

}
