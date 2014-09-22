package com.lux.classes.class16.junit_examples;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mockito;

import static junit.framework.Assert.assertEquals;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by Dmitriy on 05.03.14.
 */
public class CalculatorTest {

    Service service;

    @Before
    public void init() {
        service = mock(Service.class);
        when(service.getSomeValue()).thenReturn(5.0, 7.0);
        calc = new Calculator(service);
    }

    private Calculator calc;

    @Test
    public void testAdd() throws Exception {
        double result = calc.add(1,2);
        assertEquals(3, result, 0.1);
    }

    @Test
    public void testDiff() throws Exception {
        double result = calc.diff(7, 5);
        assertThat(result, is(closeTo(2, 0.1)));
    }


    @Test
    public void testDiffInvokeDoSomethig() throws Exception {
        calc.diff(7, 5);
        verify(service).doSomething();
        verify(service).doSomethingWithArg(anyString());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testDivide() throws Exception {
        calc.divide(5,5);
    }

    @Test
    public void testDiff2() {
        double result = calc.diff2(7.0);
        assertThat(result, is(2.0));
    }

}