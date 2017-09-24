package com.mcnichol.pramp.solution;

import com.mcnichol.pramp.SentenceReverse;

/**
 * Solution to PRAMP SentenceReverse Challenge
 *
 * @see com.mcnichol.pramp.SentenceReverse#reverseString(char[])
 **/

public class SentenceReverseSolution implements SentenceReverse {

    public static void main(String[] args) {
        char[] input = {'p', 'e', 'r', 'f', 'e', 'c', 't', ' ',
                'm', 'a', 'k', 'e', 's', ' ',
                'p', 'r', 'a', 'c', 't', 'i', 'c', 'e'};

        for (char c : input) {
            System.out.print(c);
        }
    }

    public void reverseString(char[] input) {

        mirrorReverse(input, 0, input.length - 1);

        int beginWord = 0;
        int endWord;
        for (int i = 0; i < input.length; i++) {
            if (isEndOfArrayOrSpace(input, i)) {
                endWord = i;
                mirrorReverse(input, beginWord, endWord);
                beginWord = i + 2;
            }
        }
    }

    private boolean isEndOfArrayOrSpace(char[] input, int i) {
        return (i == input.length - 1) || (input[i + 1] == ' ');
    }

    private void mirrorReverse(char[] input, int start, int end) {

        while (start < end) {
            char temp = input[start];
            input[start] = input[end];
            input[end] = temp;

            start++;
            end--;
        }
    }
}
