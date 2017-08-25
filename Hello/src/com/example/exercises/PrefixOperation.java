package com.example.exercises;

/**
 * Created by dima on 8/19/2017.
 */
public class PrefixOperation {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int k = 0;
        k++;
        for (int i = 10; k <= i; --i) {
            System.out.println(i);
        }

        System.out.println(k++ + " " + (k +=1) );
        System.out.println("Total: " + 3 + 4);
        System.out.println(3 + 4 + " Total: ");
    }
}
