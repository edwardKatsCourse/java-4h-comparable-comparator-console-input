package com.company;

import com.company.model.Employee;

import java.util.Arrays;

public class StringExample {

    public static void main(String[] args) {

        String[] names = new String[]{
                "Zoe",
                "William",
                "Jacob",
                "Alice",
                "Bill",
                "Jack",
                "Matt",
                "George"
        };


        Integer[] digits = new Integer[]{
                123, 321, 142, 51, 214, 1, 13, 1, -123, 14, 123, -4463
        };


        printArray(digits);

        System.out.println("_______________________");

        Arrays.sort(digits);

        printArray(digits);
    }


    private static void printArray(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].toString());
        }
    }
}
