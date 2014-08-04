package com.lux.classes;


public class ProxyDemo {

	public static void main(String[] args) {
		//создание объекта и вызов метод объекта без рефлексии
        Test test = new TestImpl();
		System.out.println(test.hello());
		
		//создание proxy объекта
        Test test2 = (Test) LogProxy.newInstance(test);
		System.out.println(test2.hello());
	}
	
	

}
