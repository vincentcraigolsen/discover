package com.vco.discover;

public class Fibonnaci {

    public static Integer fibonnaciFinder(Integer nDepth) {
        if (nDepth < 1) {
            return 0;
        }
        Integer[] fib = new Integer[nDepth];
        if (nDepth > 0) {
            fib[0] = 1;
        }
        if (nDepth > 1) {
            fib[1] = 1;
        }
        if (nDepth > 2) {
            for (int i = 2; i < nDepth; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
            }
        }

        return fib[nDepth - 1];
    }
    
    public static Integer fibonnaciRecursive(Integer nDepth){
        if (nDepth < 1){
            return 0;
        } else if (nDepth == 1){
            return 1;
        } else return fibonnaciRecursive(nDepth-1) + fibonnaciRecursive(nDepth-2);
    }
}
