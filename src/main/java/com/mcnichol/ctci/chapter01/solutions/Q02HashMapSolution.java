package com.mcnichol.ctci.chapter01.solutions;

import com.mcnichol.ctci.chapter01.Q02CheckPermutation;

import java.util.HashMap;

public class Q02HashMapSolution implements Q02CheckPermutation {
    @Override
    public boolean isPermutation(String stringOne, String stringTwo) {
        if (stringOne.length() != stringTwo.length()) {
            return false;
        }

        HashMap<Character, Integer> stringIntegerHashMap = new HashMap<>();
        for (int i = 0; i < stringOne.length(); i++) {
            // Check if it is there first

            Integer integer = stringIntegerHashMap.get(stringOne.charAt(i));
            if (integer != null) {
                stringIntegerHashMap.put(stringOne.charAt(i), integer + 1);
            } else {
                stringIntegerHashMap.put(stringOne.charAt(i), 1);
            }
        }

        for (int i = 0; i < stringTwo.length(); i++) {
            Integer integer = stringIntegerHashMap.get(stringTwo.charAt(i));
            if (integer != null && integer > 0) {
                stringIntegerHashMap.put(stringTwo.charAt(i), integer - 1);
            } else {
                return false;
            }
        }

        return true;
    }
}
