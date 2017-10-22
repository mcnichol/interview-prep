package com.mcnichol.ctci.chapter01.solutions;

import java.util.ArrayList;

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
public class Ctci__C01Q01 {
    public boolean isUnique(String input) {
        ArrayList<Character> characterList = new ArrayList<>();
        char[] c = input.toCharArray();

        for (char aC : c) {
            if (characterList.contains(aC)) {
                return false;
            }
            characterList.add(aC);
        }
        return true;
    }
}
