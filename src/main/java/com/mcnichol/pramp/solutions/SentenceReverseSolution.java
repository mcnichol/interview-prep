package com.mcnichol.pramp.solutions;

/**
 * Solution to PRAMP SentenceReverse Challenge
 *
 * @see com.mcnichol.pramp.SentenceReverse#reverseString(char[])
 **/

public class SentenceReverseSolution {

    public static void main(String[] args) {
        char[] input = {'p', 'e', 'r', 'f', 'e', 'c', 't', ' ',
                'm', 'a', 'k', 'e', 's', ' ',
                'p', 'r', 'a', 'c', 't', 'i', 'c', 'e'};

        for (char c : input) {
            System.out.println(c);
        }
    }

    static void reverseString(char[] input) {

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

    private static boolean isEndOfArrayOrSpace(char[] input, int i) {
        return (i == input.length - 1) || (input[i + 1] == ' ');
    }

    private static void mirrorReverse(char[] input, int start, int end) {

        while (start < end) {
            char temp = input[start];
            input[start] = input[end];
            input[end] = temp;

            start++;
            end--;
        }
    }
}
