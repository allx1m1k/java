package com.arrayswebinar;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.apache.commons.lang3.ArrayUtils;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by dima on 10/5/2017.
 */
public class ArraySample  {

    @Test
    public void case_simpleArray() {
        //пришло из С/С++ практически не используется в проде
        int[] array = new int[7];

        array[0] = 1;

        //assert
    }

    @Test
    public void case_simpleArray_setOnInt() {
        //через new int[]
        int[] array = new int[]{1,2,3};

        array[0] = 1;

        //assert
    }

    @Test
    public void case_simpleArray_setOnInt_anotherWay() {
        //синтаксический сахар без new
        Integer[] array = {1,2,3};

        array[10] = -1;



        //assert
        String s = Arrays.deepToString(array);
        System.out.println(s);

        //since Java 8 with lambdas
        //Arrays.parallelPrefix(array, (o1, o2) -> o1 + o2);
    }

    @Test
    public void case_binarySearch() {
        //
        int[] array = {1,2,3, 9, 8};

        //возвращает индекс в массиве куда бы могли вставить формальный аргумент
        Arrays.binarySearch(array, 5);

    }


    @Test
    public void case_equals() {
        //
        int[] array1 = {1,2,3, 9, 8};
        int[] array2= {1,2,3, 9, 8};
        //

        System.out.println(Arrays.equals(array1, array2));
        //System.out.println(Arrays.deepEquals(array1, array2));

    }

    @Test
    public void case_fill() {
        //
        int[] array = {1,2,3, 9, 8};

        //

        Arrays.fill(array,24);
        //System.out.println(Arrays.deepEquals(array1, array2));

    }

    @Test
    public void case_copyOf() {
        //
        int[] array = {1,2,3, 9, 8};
        int [] result = Arrays.copyOf(array, 4);
        //
        System.out.println(Arrays.toString(result));

        //System.out.println(Arrays.deepEquals(array1, array2));

    }

    @Test
    public void case_hashCode() {
        //
        int[] array = {1,2,3, 9, 8};
        assertEquals(array.hashCode(), 2144787160);

    }


    @Test
    public void case_setAll() {
        //since Java 8 with lambdas
        int[] array = {1,2,3, 9, 8};
        //Arrays.setAll(array, lambda)
        //

    }


    @Test
         public void case_cloneArrays() {
        //
        int[] array1 = {1,2,3, 9, 8};
        int[] array2= {0};
        //Arrays.setAll(array, lambda)
        //
        int[] result = ArrayUtils.clone(array1);
        //assertEquals(array1, result);
        assertArrayEquals(result, array1);

    }

    @Test
    public void case_indexOf() {
        //
        int[] array = {1,2,3, 9, 8};

        //Arrays.setAll(array, lambda)
        //
        int index = ArrayUtils.indexOf(array, 8);
        //assertEquals(array1, result);
        assertEquals(index, 4);

    }

    @Test
    public void case_removeAllOcurences() {
        //
        int[] array = {1,2,3, 9, 8, 1, 0, -8, 3, -10, 2};

        //Arrays.setAll(array, lambda)
        //
        ArrayUtils.removeAll(array, 1);
        //assertEquals(array1, result);
        //assertEquals(index, 4);
        System.out.println(Arrays.toString(array));
    }

    @Test
    public void case_createListFromData() {
        //
        //Arrays.setAll(array, lambda)
        //
        List<Integer> result = Arrays.asList(1,2,3,4);

    }

    @Test
    public void case_createArrayFromList() {
        //
        //Arrays.setAll(array, lambda)
        //
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        //Integer[] array = {};
        Object[] objects = list.toArray();
        System.out.println(objects.toString());

    }

}
