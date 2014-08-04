package com.lux.classes;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by dima on 8/4/2014.
 */
public class LogProxy implements InvocationHandler {
    private Object obj;

    private LogProxy(Object obj) {
        this.obj = obj;
    }
    //использование паттерна Фабричный метод

    public static Object newInstance(Object obj) {
        return Proxy.newProxyInstance( //для проксирования используем этот класс - ЭТО ВЫЗОВ ДИНАМИЧЕСКОГО ПРОКСИ
                obj.getClass().getClassLoader(), //параметр 1 класс лоадер
                obj.getClass().getInterfaces(), //проксируй все вызовы методов которые ЗАКРЕПЛЕНЫ ЗА ЭТИМ ОБЪЕКТОМ
                new LogProxy(obj)); //параметр 3 - кто обрабатывает , т.е. перенаправляю этому прокси
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //идет перехват метода и логика обработки кастомной аннотоации через рефлексию
        if (method.isAnnotationPresent(Log.class)) { //поверяем имеет ли метод аннотацию Log - кастомная
            Log an = method.getAnnotation(Log.class); //если да, то мы получаем аннтоцию как объект
            System.out.println(an.file()); //для определения параметра аннотации, т.е. тут мы считываем параметр аннотации, это значение можно использовать как имя файла лога
            System.out.println("Hello log"); //вывод аннотации @Log
        }
        //передача управления реальноу методу но через reflection API а не через стандартную нотацию instance.methodCall();
        Object result = method.invoke(obj, args);
        return result;
    }
}
