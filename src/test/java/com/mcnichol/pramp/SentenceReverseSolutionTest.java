package com.mcnichol.pramp;

import com.mcnichol.pramp.solution.SentenceReverseSolution;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SentenceReverseSolutionTest {

    private SentenceReverse sentenceReverse;

    @Before
    public void setUp() throws Exception {
//        sentenceReverse = new SentenceReverseStub();
        sentenceReverse = new SentenceReverseSolution();  // Comment this Line Out to implement your own solution
    }

    @Test
    public void reversesString(){
        char[] input = "perfect makes practice".toCharArray();
        char[] expected = "practice makes perfect".toCharArray();

        sentenceReverse.reverseString(input);

        assertArrayEquals(expected, input);
    }

    @Test
    public void reversesSingleChar() throws Exception {
        char[] input = "a".toCharArray();
        char[] expected = "a".toCharArray();

        sentenceReverse.reverseString(input);

        assertArrayEquals(expected, input);
    }

    @Test
    public void reversesSingleWordCharArray() throws Exception {
        char[] input = "one".toCharArray();
        char[] expected = "one".toCharArray();

        sentenceReverse.reverseString(input);

        assertArrayEquals(expected, input);
    }
}