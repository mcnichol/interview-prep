package com.mcnichol.ctci.chapter01;

/**
 * This solution is optimal for validating permutations if
 * space is not a constraint and runs in O(n) time
 */

public class Q02CharArrayHash implements Q02CheckPermutation {
    @Override
    public boolean isPermutation(String stringOne, String stringTwo) {
        if (stringOne.length() != stringTwo.length()) {
            return false;
        }

        int[] charMap = new int[128];

        for (int i = 0; i < stringOne.length(); i++) {
            charMap[stringOne.charAt(i)] += 1;
        }

        for (int i = 0; i < stringTwo.length(); i++) {
            if (charMap[stringTwo.charAt(i)] > 0) {
                charMap[stringTwo.charAt(i)] -= 1;
            } else {
                return false;
            }
        }

        return true;
    }
}
