package com.vco.discover;

import static com.vco.discover.Fibonnaci.fibonnaciFinder;
import static com.vco.discover.Fibonnaci.fibonnaciRecursive;
import static com.vco.discover.Reverser.reverseStringRecursively;
import static com.vco.discover.Reverser.stringReverser;

public class Main {

    public static void main(String[] args) {
        verifyArgs(args);

        System.out.println("The Fibonnaci number at position " + args[0] + " is: ");
        System.out.println(fibonnaciFinder(Integer.parseInt(args[0])).toString());

        System.out.println("The Fibonnaci number at position " + args[0] + " found recursively is: ");
        System.out.println(fibonnaciRecursive(Integer.parseInt(args[0])).toString());

        System.out.println("The reverse of the string " + args[1] + " is: ");
        System.out.println(stringReverser(args[1]));

        System.out.println("The reverse of the string " + args[1] + " found recursively is: ");
        System.out.println(reverseStringRecursively(args[1]));

    }

    private static void verifyArgs(String[] args) {
        String argsInfo = "There must be 2 command line arguments, the first an integer and the second a string";
        if (args == null || args.length == 0 || args.length < 2) {
            exit(1, argsInfo);
        } else {
            try {
                Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println(e);
                exit(1, argsInfo);
            }
        }
    }

    private static void exit(int code, String message) {
        System.out.println(message);
        System.exit(code);
    }
}
