package com.Konovalov;

/**
 * Created by Towa on 16.04.2018.
 */
public class Operation {

    @MyAnnotations(a = 10, b = 12)
    public static int sum(int numberOne, int numberTho) {
        return numberOne + numberTho;
    }

}
