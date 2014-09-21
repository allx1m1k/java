package com.lux.classes.class17.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ClassInfo {
	public static String getClassInfo(Class<?> clazz) {
		StringBuilder info = new StringBuilder();
		
		info.append("class" + clazz.getSimpleName() + "\n");
		loadConstructorsInfo(clazz, info);
		loadFieldsInfo(clazz, info);
		loadMethodsInfo(clazz, info);
		
		return info.toString().replace(", )", ")");
	}
	
	private static void loadConstructorsInfo(Class<?> clazz, StringBuilder info) {
		for (Constructor<?> constructor : clazz.getConstructors()) { 
			info.append("\t ");
			info.append(constructor.getName() + "(");
			for (Class<?> type : constructor.getParameterTypes()) {
				info.append(type.getSimpleName() + ", ");
			}	
			info.append(")\n ");
		}
		info.append("\n ");
	}	

	private static void loadMethodsInfo(Class<?> clazz, StringBuilder info) {
		for (Method method : clazz.getDeclaredMethods()) { 
			info.append(decodeModifiers(method.getModifiers())).append(" ");
			info.append(method.getReturnType().getSimpleName()).append(" ");		
			info.append(method.getName() + "(");
			for (Class<?> type : method.getParameterTypes()) {
				info.append(type.getSimpleName() + ", ");
			}	
			info.append(")\n ");
		}
		info.append("\n ");
	}

	private static void loadFieldsInfo(Class<?> clazz, StringBuilder info) {
		for (Field field : clazz.getDeclaredFields()) { //clazz.getFields()
			info.append(decodeModifiers(field.getModifiers())).append(" ");
			info.append(field.getType().getSimpleName()).append(" ");
			info.append(field.getName() + "\n"); 
		}
		info.append("\n ");
	}

	private static StringBuilder decodeModifiers(int mod) {
		StringBuilder result = new StringBuilder("\t");
		
		result.append(Modifier.isPublic(mod)?"public ":"");
		result.append(Modifier.isPrivate(mod)?"private ":"");
		result.append(Modifier.isProtected(mod)?"protected ":"");
		result.append(Modifier.isStatic(mod)?"static ":"");
		result.append(Modifier.isAbstract(mod)?"abstract ":"");
		result.append(Modifier.isTransient(mod)?"transient ":""); 
		
		
		//result.append(Modifier.toString(mod));
		return result;
	}
}
