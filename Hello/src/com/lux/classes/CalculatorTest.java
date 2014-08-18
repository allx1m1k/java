package com.lux.classes;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
/*
import org.mockito.Mockito;
 */

import static junit.framework.Assert.assertEquals;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;
/*
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
*/

/**
 * Created by dima on 7/31/2014.
 */
public class CalculatorTest {

    private Service service;

    /*@Before
    тут мы подсовываем в ка-че всервиса Мок
    service = mock.(Service.class); // тут мы сделали мок
    when(service.getSomeValue()).thenReturn(5.0, 7.0) //тут мы мок обучаем
    calc = new Calculator(service);


    @Test
    calc.diff(7, 5); //мы тестируем метод diff и проверяме что при таких параметрах, этот метод обращается к методам класса Service doSomething()
    verify(service).doSomething(); //мокитовский assertion что в результате выполнения метода diff вызывался метод doSomething
    verify(service).doSomethingWithArg(anyString());

    */
    @Before
    public void init(){
        calc = new Calculator();
    }


    //чтобы не создавать объект калькулятора в каждом тесте
    private Calculator calc;

    @Test
    public void testAdd() throws Exception {
        double result = calc.add(1,2);
        assertEquals(3, result, 0.1);
    }

    //@Ignore
    @Test(expected = IllegalArgumentException.class)
    public void testDivide() throws Exception {
        calc.divide(5,0); //мы ожидаем что при таких аргументах у нас должно появится IllegalArumExcept
    }
}
