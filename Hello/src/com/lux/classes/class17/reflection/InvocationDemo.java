package com.lux.classes.class17.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class InvocationDemo {

	public static void main(String[] args) {
	
		long t1 = System.nanoTime();
		List<String> list = new ArrayList<>();
		list.add("test1");
		list.add("test2");
		list.add("test3");
		//Время в мс. понадобившееся на добавление в ArrayList 3 элементов типа String
        System.out.println(System.nanoTime() - t1);
		
		long t2 = System.nanoTime();
		Class<?> clazz = ArrayList.class;
		try {
			Object list2 = clazz.newInstance();
			Method addMethod = clazz.getMethod("add", Object.class);			
			addMethod.invoke(list2, "test1");
			addMethod.invoke(list2, "test2");
			addMethod.invoke(list2, "test3");
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
        //Время в мс. понадобившееся на создание экз-ра ArrayList и добавление 3 элементов типа String через reflection API
        System.out.println(System.nanoTime() - t2);
	}

}
