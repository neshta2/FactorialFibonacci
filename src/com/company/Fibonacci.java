package com.company;

public class Fibonacci {

    public static int[] getFibonacciLoopWhile(int arrayFib) {
        int[] fibonacci = new int[arrayFib];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        int i = 2;
        while (i < arrayFib) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            i++;
        }
        return fibonacci;
    }

    public static int[] getFibonacciLoopDoWhile(int arrayFib)  {
        int[] fibonacci = new int[arrayFib];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        int i = 2;
        do {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            i++;
        }
        while (i < arrayFib);
        return fibonacci;
    }

    public static int[] getFibonacciLoopFor(int arrayFib) {
        int[] fibonacci = new int[arrayFib];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i < arrayFib; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }

    public static int[] chooseLoopType(int looptype, int n) {
        int[] result;
        switch (looptype) {
            case 1:
                result = getFibonacciLoopFor(n);
                break;

            case 2:
                result = getFibonacciLoopWhile(n);
                break;
            case 3:
                result = getFibonacciLoopDoWhile(n);
                break;
            default:
                throw new IllegalStateException("Неверное значение " + looptype);
        }
        return result;
    }
}