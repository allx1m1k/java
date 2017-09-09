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
 */
public class Order{

    //static String words = new String("");
    public static String order(String words) {
        //initialize result with capacity of words length
        StringBuilder result = new StringBuilder(words.length());
        //initialize arrays of Strings which make up words as formal argument
        String[] parts = words.split(" ");

        //sort parts
        // https://docs.google.com/document/d/1WrOKUbW9CsRj-aLiMUPgHhBQw0DLguiVVaHJctlcjK0/edit
        // https://ru.stackoverflow.com/questions/600385/arrays-sort-%D0%A1%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0-%D0%BC%D0%B0%D1%81%D1%81%D0%B8%D0%B2%D0%B0-%D1%81%D1%82%D1%80%D0%BE%D0%BA-%D0%BF%D0%BE-%D0%B4%D0%BB%D0%B8%D0%BD%D0%B5
        //Arrays.sort(parts);

        Arrays.sort(parts, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int c = Integer.compare(o1.length(), o2.length());
                if (c == 0) {
                    return o1.compareTo(o2);
                } else {
                    return c;
                }
            }
        });

        // if formal argument is empty
        if (words.isEmpty())
            return result.toString();
        // proceed further if words is not empty
        // chars comprises of words
        //char [] chars = new char[words.length()];
        //chars = words.toCharArray();

        for (int i = 0; i < parts.length; i++) {
            //System.out.println(chars[i]);
            result.append(parts[i]).append(" ");
        }
        return result.toString();
    }


}