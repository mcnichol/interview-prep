package com.mcnichol.ctci.chapter01;

/**
 * Cracking the Coding Interview: Arrays and Strings
 * <p>
 * Is Unique
 * <p>
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures.
 * <p>
 * Hints:
 * #44, #117, #132
 */
public class Ctci_C01Q01 {
    public boolean isUnique(String input) {

        boolean isUnique = true;
        char[] chars = input.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            for (int j = i; j < chars.length; j++) {
                if (chars[i] > chars[j]) {
                    char temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }
        
        for (int i = 1; i < chars.length; i++) {
            if(chars[i] == chars[i - 1]){
                isUnique = false;
                break;
            }
        }

        return isUnique;
    }
}
