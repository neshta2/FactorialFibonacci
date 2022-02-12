package com.company;

public class Factorial {

    public static int getFactorialFor(int f) {
        int factorial = 1;
        for (int i = 1; i <= f; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static int getFactorialWhile(int f) {
        int a = 1;
        int factorial = 1;
        while (a < f) {
            a++;
            factorial += a;
        }
        return factorial;
    }

    public static int getFactorialDoWhile(int f) {
        int a = 1;
        int factorial = 1;
        do {
            a++;
            factorial += a;
        }
        while (a > f);
        return factorial;
    }

    public static int chooseLoopTypeOne(int looptype, int f) {
        int result;
        switch (looptype) {
            case 1:
                result = getFactorialFor(f);
                break;

            case 2:
                result = getFactorialWhile(f);
                break;
            case 3:
                result = getFactorialDoWhile(f);
                break;
            default:
                throw new IllegalStateException("Неверное значение " + looptype);
        }
        return result;
    }

}

