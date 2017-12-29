package com.mcnichol.ctci.chapter01.solutions;

import com.mcnichol.ctci.chapter01.Q01IsUnique;

import java.util.ArrayList;
import java.util.List;

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
public class Q01LeveragingJavaMethods implements Q01IsUnique {
    public boolean isUnique(String input) {
        if (input.length() > 128) return false;

        List<Character> characterList = new ArrayList<>();
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

