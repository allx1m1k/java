package com.codewars;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Your task is to sort a given string. Each word in the String will contain a single number.
 * This number is the position the word should have in the result.
 * Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
 * If the input String is empty, return an empty String.
 * The words in the input String will only contain valid consecutive numbers.
 * For an input: "is2 Thi1s T4est 3a" the function should return "Thi1s is2 3a T4est"
 *
 * How to implements
 * 1. Create arrays of Strings which of words made of - String[] parts
 * 2. Perform parts sorting based on implemented Comparator
 * sort parts
 // https://docs.google.com/document/d/1WrOKUbW9CsRj-aLiMUPgHhBQw0DLguiVVaHJctlcjK0/edit
 // https://ru.stackoverflow.com/questions/600385/arrays-sort-%D0%A1%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0-%D0%BC%D0%B0%D1%81%D1%81%D0%B8%D0%B2%D0%B0-%D1%81%D1%82%D1%80%D0%BE%D0%BA-%D0%BF%D0%BE-%D0%B4%D0%BB%D0%B8%D0%BD%D0%B5
 //https://stackoverflow.com/questions/14974033/extract-digits-from-string-stringutils-java
 */
public class Order{

    //static String words = new String("");
    public static String order(String words) {
        //initialize result with capacity of words length
        StringBuilder result = new StringBuilder(words.length());
        // if formal argument is empty
        if (words.isEmpty())
            return result.toString();
        //initialize arrays of Strings which make up words as formal argument
        String[] parts = words.split(" ");
        //parts sorting
        Arrays.sort(parts, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //truncates non digits
                String s1 = o1.replaceAll("[^1-9]", "");
                String s2 = o2.replaceAll("[^1-9]", "");
                //extract integers from string
                int i1 = Integer.parseInt(s1);
                int i2 = Integer.parseInt(s2);
                //main comparing
                if (i1 > i2) {
                    return 1;
                } else {
                    if (i1 < i2) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            }
        });

        // building new string from sorted parts
        for (int i = 0; i < parts.length; i++) {
            //System.out.println(chars[i]);
            result.append(parts[i]).append(" ");
        }
        //truncate the latest space symbol from result string
        result.deleteCharAt(result.length()-1);
        return result.toString();
    }


}