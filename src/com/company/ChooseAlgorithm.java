package com.company;

import java.util.Arrays;

public class ChooseAlgorithm {
    private ChooseAlgorithm() {

    }

    public static String chooseAlgorithm(int algorithmId, int loopType, int n) {
        String result;
        switch (algorithmId) {
            case 1:
                result = Arrays.toString(Fibonacci.chooseLoopType(loopType, n));
                break;
            case 2:
                result = String.valueOf(Factorial.chooseLoopTypeOne(loopType, n));
                break;
            default:
                throw new IllegalStateException("Неверное значение " +  algorithmId);
        }
        return result;
    }
}
