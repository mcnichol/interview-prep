package com.mcnichol.ctci.chapter01.solutions;

import com.mcnichol.ctci.chapter01.Q01IsUnique;
import com.mcnichol.interviewing.sorting.InsertionSort;
import com.mcnichol.interviewing.sorting.MergeSort;
import com.mcnichol.interviewing.sorting.QuickSort;
import com.mcnichol.interviewing.sorting.Sorter;
import com.sun.xml.internal.bind.v2.model.annotation.Quick;

/**
 * Cracking the Coding Interview: Arrays and Strings
 * <p>
 * Is Unique
 * <p>
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures.
 * <p>
 * <p>
 * This algorithm solves the problem by turning the input into a character array,
 * iterating over the character array and perform an
 */
public class Q01BruteForceInsertionSortAndCheckWithGuardClause implements Q01IsUnique {
    public boolean isUnique(String input) {
        if(input.length() > 128) return false;

        boolean isUnique = true;
        char[] chars = input.toCharArray();

        insertionSort(chars);

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                isUnique = false;
                break;
            }
        }

        return isUnique;
    }

    private void insertionSort(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            for (int j = i; j > 0; j--) {
                if (chars[i] > chars[j]) {
                    char temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }
    }
}
