package com.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by allx1m1k on 9/22/2017.
 * Your task is to make a function that can take any non-negative integer as a argument and return it with it's digits in descending order.
 * Essentially, rearrange the digits to create the highest possible number.
 * Examples:
 * Input: 21445 Output: 54421
 * Input: 145263 Output: 654321
 * Input: 1254859723 Output: 9875543221
 *
 * https://stackoverflow.com/questions/8033550/convert-integer-to-array-of-digits
 * https://stackoverflow.com/questions/7787754/sorting-integers-in-order-lowest-to-highest-java/7787780#7787780
 * https://stackoverflow.com/questions/940766/arraylist-of-integers-to-one-int
 */
public class DescendingOrder {
    public static int sortDesc(final int num) {
        //converting int to ArrayList in order sort them
        int temp = num;
        ArrayList<Integer> array = new ArrayList<Integer>();
        do{
            array.add(temp % 10);
            temp /= 10;
        } while  (temp > 0);
        //sort by natural order and reverse
        Collections.sort(array);
        Collections.reverse(array);
        //ArrayList to int
        int total = 0;
        for (Integer i : array) { // assuming list is of type List<Integer>
            total = 10*total + i;
        }
        return total;
    }
}