package com.vco.discover;

public class Reverser {
    
    public static String stringReverser(String frontwards){
        String backwards = "";
        while(frontwards.length() > 0){
            backwards = backwards.concat(frontwards.substring(frontwards.length()-1));
            frontwards = frontwards.substring(0,frontwards.length()-1);
        }
        return backwards;
    }
    
    public static String reverseStringRecursively(String frontwards){
        String backwards = "";                
         return stringPositionChanger(frontwards, backwards);
    }
    
    private static String stringPositionChanger(String frontwards, String backwards) {
        if (frontwards.length() == 0){
            return backwards;
        } else {
            return stringPositionChanger(frontwards.substring(0,frontwards.length()-1)
                    , backwards.concat(frontwards.substring(frontwards.length()-1)));
        }
    }
}
