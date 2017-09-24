package com.mcnichol.pramp.stub;

import com.mcnichol.pramp.SentenceReverse;

/**
 * You are given an array of characters arr that consists of sequences of characters
 * separated by space characters. Each space-delimited sequence of characters defines
 * a word.
 * <p>
 * Implement a function reverseWords that reverses the order of the words in the array
 * in the most efficient manner.
 * <p>
 * Explain your solution and analyze its time and space complexities.
 * <p>
 * <p>
 * Example:
 * <p>
 * input:  arr = [ 'p', 'e', 'r', 'f', 'e', 'c', 't', '  ',
 * 'm', 'a', 'k', 'e', 's', '  ',
 * 'p', 'r', 'a', 'c', 't', 'i', 'c', 'e' ]
 * <p>
 * output: [ 'p', 'r', 'a', 'c', 't', 'i', 'c', 'e', '  ',
 * 'm', 'a', 'k', 'e', 's', '  ',
 * 'p', 'e', 'r', 'f', 'e', 'c', 't' ]
 * <p>
 * <p>
 * Constraints:
 * [time limit] 5000ms
 * [input] array.character arr
 * 0 ≤ arr.length ≤ 100
 * [output] array.character
 **/

/*
    Notes:
        * Issues with creating a char array,
          did not notice multiple spaces in input
          example were causing failure
        * Ended with N^2 Solution by turning char[]
          into a String, reversing on word boundary
          and rebuilding char[]
        * Solution didn't work.  It was missing last word
          (Splitting on spaces to detect word boundary, last word has no space)
 */

public class SentenceReverseStub implements SentenceReverse {

    public static void main(String[] args) {
        SentenceReverse stub = new SentenceReverseStub();
        char[] input = {'p', 'e', 'r', 'f', 'e', 'c', 't', ' ',
                'm', 'a', 'k', 'e', 's', ' ',
                'p', 'r', 'a', 'c', 't', 'i', 'c', 'e'};

        stub.reverseString(input);
        for (char c : input) {
            System.out.println(c);
        }
    }

    public void reverseString(char[] input) {
        // Your code goes here
    }
}


