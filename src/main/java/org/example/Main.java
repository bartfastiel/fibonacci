package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static int fibonacci(int index) {
        if (index == 0) {
            return 0;
        }
        int previousNumber = 0;
        int currentNumber = 1;
        for (int i = 0; i < index-1; i++) {
            int sum = previousNumber + currentNumber;
            previousNumber = currentNumber;
            currentNumber = sum;
        }
        return currentNumber;
    }
}