package com.oop.lesson1;

public class TestExample {
    public static void main(String[] args) {
        int value = 10;
        int[] vulues = {value, 100, 199, 25};
        printArray(vulues);
    }
    private static void printArray(int[] values) {

        for (int value : values) {
            System.out.println(value);
        }
    }
}