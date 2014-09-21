package com.onpu.courses.reflection.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LogProxy implements InvocationHandler {

	private Object obj;

	private LogProxy(Object obj) {
		this.obj = obj;
	}

	public static Object newInstance(Object obj) {
		return Proxy.newProxyInstance(
				obj.getClass().getClassLoader(), 
				obj.getClass().getInterfaces(), 
				new LogProxy(obj));
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		if (method.isAnnotationPresent(Log.class)) {
			Log an = method.getAnnotation(Log.class);
			System.out.println(an.file());
			System.out.println("log hello");
		}
		Object result = method.invoke(obj, args);
		return result;
	}

}
