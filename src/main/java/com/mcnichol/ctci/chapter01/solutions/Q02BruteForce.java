package com.mcnichol.ctci.chapter01.solutions;

import com.mcnichol.ctci.chapter01.Q02CheckPermutation;

import java.util.Arrays;

public class Q02BruteForce implements Q02CheckPermutation {
    @Override
    public boolean isPermutation(String stringOne, String stringTwo) {
        if (stringOne.length() != stringTwo.length()) {
            return false;
        }

        char[] charOne = stringOne.toCharArray();
        char[] charTwo = stringTwo.toCharArray();

        Arrays.sort(charOne);
        Arrays.sort(charTwo);

        return String.valueOf(charOne).equals(String.valueOf(charTwo));
    }
}
