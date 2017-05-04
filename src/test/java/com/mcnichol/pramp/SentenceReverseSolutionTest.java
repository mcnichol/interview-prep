package com.mcnichol.pramp;

import org.junit.Test;

import static org.junit.Assert.*;

public class SentenceReverseSolutionTest {
    @Test
    public void reversesString(){
        char[] input = "perfect makes practice".toCharArray();
        char[] expected = "practice makes perfect".toCharArray();

        SentenceReverseSolution.reverseString(input);

        assertArrayEquals(expected, input);
    }

    @Test
    public void reversesSingleChar() throws Exception {
        char[] input = "a".toCharArray();
        char[] expected = "a".toCharArray();

        SentenceReverseSolution.reverseString(input);

        assertArrayEquals(expected, input);
    }

    @Test
    public void reversesSingleWordCharArray() throws Exception {
        char[] input = "one".toCharArray();
        char[] expected = "one".toCharArray();

        SentenceReverseSolution.reverseString(input);

        assertArrayEquals(expected, input);
    }
}